package controllers;

import is.rufan.player.domain.Player;
import is.rufan.player.domain.Position;
import is.rufan.player.service.PlayerService;
import is.rufan.tournament.domain.FantasyTeam;
import is.rufan.tournament.service.FantasyTeamService;
import is.rufan.tournament.service.TournamentService;
import is.rufan.user.domain.User;
import is.rufan.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import static play.data.Form.*;
import play.data.*;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.editFantasyTeam;
import views.html.summary;
import views.html.user;

import java.util.List;

/**
 * @(#)Tournament Controller 25 Oct 2015 Kristján Harðarsson and Þórdís Jóna Jónsdóttir
 *
 * Controller component which handles everything connected to the tournaments
 * and fantasy teams. Extends from Controller and uses Bean to access the
 * Tournament Service and add the information to the database.
 */
public class TournamentController extends Controller {
    protected ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/userapp.xml");
    final PlayerService playerService = (PlayerService)ctx.getBean("playerService");
    final TournamentService tournamentService = (TournamentService)ctx.getBean("tournamentService");
    final FantasyTeamService fantasyTeamService = (FantasyTeamService)ctx.getBean("fantasyTeamService");
    final UserService userService = (UserService)ctx.getBean("userService");
    final static Form<Player> playerFormer = form(Player.class);


    public Result fantasyTeam() {
        String username = session("username");
        User currentUser = userService.getUserByUsername(username);

        // User has to be logged in
        if(username != null) {
            //FantasyTeam currentFantasyTeam = fantasyTeamService.getFantasyTeam(currentUser.getId());
            /*if(currentFantasyTeam.equals(null)){
                //player doesnt have fantasy team
            }*/


            Form<Player> playerForm = playerFormer.fill(new Player());

            return ok(editFantasyTeam.render(playerForm));
        }
        else {
            return redirect("/login");
        }

    }
    public Result editFantasyTeams(){

        String username = session("username");
        User currentUser = userService.getUserByUsername(username);
        if(username != null){



        }
        return null;
    }
}
