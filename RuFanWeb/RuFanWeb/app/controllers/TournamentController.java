package controllers;

import is.rufan.tournament.domain.FantasyTeam;
import is.rufan.tournament.service.FantasyTeamService;
import is.rufan.tournament.service.TournamentService;
import is.rufan.user.domain.User;
import is.rufan.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.fantasyTeam;

/**
 * @(#)Tournament Controller 25 Oct 2015 Kristján Harðarsson and Þórdís Jóna Jónsdóttir
 *
 * Controller component which handles everything connected to the tournaments
 * and fantasy teams. Extends from Controller and uses Bean to access the
 * Tournament Service and add the information to the database.
 */
public class TournamentController extends Controller {
    protected ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/userapp.xml");
    final TournamentService tournamentService = (TournamentService)ctx.getBean("tournamentService");
    final FantasyTeamService fantasyTeamService = (FantasyTeamService)ctx.getBean("fantasyTeamService");
    final UserService userService = (UserService)ctx.getBean("userService");

    public Result fantasyTeam() {
        String username = session("username");
        User currentUser = userService.getUserByUsername(username);

        // User has to be logged in
        if(username != null) {
            FantasyTeam fantasyteamye = fantasyTeamService.getFantasyTeam(currentUser.getId());
            return ok(fantasyTeam.render(fantasyteamye));
        }
        else {
            return redirect("/login");
        }
    }
}
