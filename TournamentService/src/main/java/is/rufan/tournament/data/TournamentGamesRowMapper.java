package is.rufan.tournament.data;

import is.rufan.tournament.domain.TournamentGames;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by Kristján on 24.10.2015.
 */
public class TournamentGamesRowMapper implements RowMapper<TournamentGames> {

    public TournamentGames mapRow(ResultSet rs, int rownum) throws SQLException{
        TournamentGames tourgames = new TournamentGames();
        tourgames.setGameId(rs.getInt("gameid"));
        tourgames.setTournamentId(rs.getInt("tournamentid"));

        return tourgames;
    }

}
