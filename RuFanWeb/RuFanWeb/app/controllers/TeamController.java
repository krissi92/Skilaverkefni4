package controllers;

import is.rufan.team.domain.Team;
import is.rufan.team.service.TeamService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import play.libs.Json;
import play.mvc.*;
import java.util.List;

/**
 * @(#)Team Controller 25 Oct 2015 Kristján Harðarsson and Þórdís Jóna Jónsdóttir
 *
 * Controller component which handles everything connected to the team.
 * Extends from Controller and uses Bean to access the Team Service and
 * add the information to the database.
 */
public class TeamController extends Controller {
    protected ApplicationContext ctx = new FileSystemXmlApplicationContext("/conf/userapp.xml");
    final TeamService teamService = (TeamService)ctx.getBean("teamService");

    /**
     * A function which gets the teams with the Team Service and returns a JSON object of arrays
     * where each array is a team.
     *
     * @return JSON object of arrays
     */
    public Result getTeams() {
        List<Team> teams = teamService.getTeams();
        return ok(Json.toJson(teams));
    }
}
