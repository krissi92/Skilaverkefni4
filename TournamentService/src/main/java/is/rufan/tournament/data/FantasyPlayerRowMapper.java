package is.rufan.tournament.data;

import is.rufan.tournament.domain.FantasyPlayer;
import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by Kristján on 26.10.2015.
 */
public class FantasyPlayerRowMapper implements RowMapper<FantasyPlayer>{


    public FantasyPlayer mapRow(ResultSet rs, int rownum) throws SQLException{
        FantasyPlayer fantaplayer = new FantasyPlayer();
        fantaplayer.setFantasyTeamId(rs.getInt("fantasyteamid"));
        fantaplayer.setPlayerId(rs.getInt("playerid"));

        return fantaplayer;
    }

}
