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

import java.util.Collection;
import java.util.List;

public class PlayerController extends Controller
{

    protected ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/userapp.xml");
    final PlayerService playerService = (PlayerService)ctx.getBean("playerService");
    final TournamentService tournamentService = (TournamentService)ctx.getBean("tournamentService");
    final FantasyTeamService fantasyTeamService = (FantasyTeamService)ctx.getBean("fantasyTeamService");
    final UserService userService = (UserService)ctx.getBean("userService");
    final static Form<Player> playerFormer = form(Player.class);

    public Result getPlayers(int teamId){
        List<Player> players = playerService.getPlayers(teamId);


        return ok(Json.toJson(players));
    }
    public Result getGoalkeepers(){

        List<Player> goalkeepers = playerService.getPlayerByPos(1);

        return ok(Json.toJson(goalkeepers));
    }
    public Result getForwards(){
        List<Player> goalkeepers = playerService.getPlayerByPos(2);

        return ok(Json.toJson(goalkeepers));
    }
    public Result getPositions(){
        Collection<Position> positions = playerService.getPositions();

        return ok(Json.toJson(positions));

    }
    public Result getPlayerPosition(int playerId){
        List<Position> playerPositions = playerService.getPlayerPos(playerId);
        return ok(Json.toJson(playerPositions));

    }

}
