package is.rufan.player.data;

import java.sql.ResultSet;
import java.sql.SQLException;

import is.rufan.player.domain.Player;
import is.rufan.player.domain.PlayerPosition;
import org.springframework.jdbc.core.RowMapper;
/**
 * Created by Kristján on 26.10.2015.
 */
public class PlayerPositionRowMapper implements RowMapper<PlayerPosition>{
    public PlayerPosition mapRow(ResultSet rs, int rowNum) throws SQLException {
        PlayerPosition player = new PlayerPosition();
        player.setPlayerid(rs.getInt("playerid"));
        player.setPositionid(rs.getInt("positionid"));

        return player;
    }
}
