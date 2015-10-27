package is.rufan.player.data;

import is.rufan.player.domain.PlayerPosition;
import is.rufan.player.domain.Position;
import is.ruframework.data.RuData;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PositionData extends RuData implements PositionDataGateway
{
  public Position getPosition(int positionId)
  {
    String sql = "select * from positions where positionid=?";
    JdbcTemplate queryPosition= new JdbcTemplate(getDataSource());

    Position position = queryPosition.queryForObject(sql,
        new Object[] { positionId },
        new PositionRowMapper());

    return position;
  }

  public List<Position> getPositions()
  {
    String sql = "select * from positions";
    JdbcTemplate queryPosition= new JdbcTemplate(getDataSource());

    List<Position> positions = queryPosition.query(sql,
            new PositionRowMapper());
    return positions;
  }
  public List<Position> getPlayerPos(int playerId) {
    String PPsql = "select * from playerpositions where playerid =?";

    JdbcTemplate quearyPlayerPos = new JdbcTemplate(getDataSource());
    List<PlayerPosition> playpos = quearyPlayerPos.query(PPsql, new Object[] {playerId} , new PlayerPositionRowMapper());
    List<Position> result = new ArrayList<Position>();

    for(PlayerPosition pos : playpos){
      Position temp = getPosition(pos.getPositionid());
      result.add(temp);
    }
    return result;
  }
}

