package controllers;

import is.rufan.team.domain.Team;
import is.rufan.team.service.TeamService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import play.libs.Json;
import play.mvc.*;
import java.util.List;

/**
 * Created by thordisjona on 25/10/15.
 */
public class TeamController extends Controller {
    protected ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/userapp.xml");
    final TeamService teamService = (TeamService)ctx.getBean("teamService");

    public Result getTeams() {
        List<Team> teams = teamService.getTeams();
        return ok(Json.toJson(teams));
    }
}
