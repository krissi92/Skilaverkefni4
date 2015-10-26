package is.rufan.tournament.data;

import is.rufan.tournament.domain.FantasyTeam;
import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;



/**
 * Created by Kristján on 26.10.2015.
 */

public class FantasyTeamRowMapper implements RowMapper<FantasyTeam>{

        public FantasyTeam mapRow(ResultSet rs, int rownum) throws SQLException{
            FantasyTeam fantateam = new FantasyTeam();
            fantateam.setFantasyTeamId(rs.getInt("fantasyteamid"));
            fantateam.setFantasyTeamName(rs.getString("fantasyteamname"));
            fantateam.setTournamentId(rs.getInt("tournamentid"));
            fantateam.setUserId(rs.getInt("userid"));

            return fantateam;

        }


}
