package is.rufan.team.data;
import java.sql.ResultSet;
import java.sql.SQLException;

import is.rufan.team.domain.Game;
import is.rufan.team.service.TeamServiceData;
import is.ruframework.data.RuDataAccessFactory;
import is.ruframework.domain.RuException;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by Kristján on 26.10.2015.
 */
public class GameRowMapper implements RowMapper<Game>{

    RuDataAccessFactory factory;
    TeamDataGateway teamDataGateway;
    VenueDataGateway venueDataGateway;

    /*public GameRowMapper() throws RuException {
        factory = RuDataAccessFactory.getInstance("gamedata.xml");
        teamDataGateway = (TeamDataGateway) factory.getDataAccess("teamData");
        venueDataGateway = (VenueDataGateway) factory.getDataAccess("venueData");
    }*/

    public Game mapRow(ResultSet rs, int rowNum) throws SQLException
    {

        Game game = new Game();
        game.setGameId(rs.getInt("gameid"));
        game.setStartTime(rs.getDate("starttime"));
        int teamawayId = rs.getInt("teamawayid");
        int teamhomeId = rs.getInt("teamhomeid");
        game.setTeamAway(teamDataGateway.getTeam(teamawayId));
        game.setTeamHome(teamDataGateway.getTeam(teamhomeId));

        int venueId = rs.getInt("venueid");
        game.setVenue(venueDataGateway.getVenue(venueId));

        return game;
    }

}
