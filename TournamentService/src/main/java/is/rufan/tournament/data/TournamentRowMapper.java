package is.rufan.tournament.data;

import is.rufan.tournament.domain.Tournament;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by Kristján on 23.10.2015.
 */
public class TournamentRowMapper implements RowMapper<Tournament>
{
    public Tournament mapRow(ResultSet rs, int rowNum) throws SQLException
    {
        Tournament tournament = new Tournament();
        tournament.setTournamentId(rs.getInt("tournamentId"));
        tournament.setName(rs.getString("name"));
        tournament.setStartTime(rs.getDate("startTime"));
        tournament.setEndTime(rs.getDate("endTime"));
        tournament.setStatus(rs.getString("status"));

        return tournament;
    }

}
