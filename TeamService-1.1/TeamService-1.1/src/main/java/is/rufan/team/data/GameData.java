package is.rufan.team.data;

import is.rufan.team.domain.Game;
import is.ruframework.data.RuData;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kristján on 26.10.2015.
 */
public class GameData extends RuData implements GameDataGateway {
    public void addGame(Game game) {
        SimpleJdbcInsert insertGame =
                new SimpleJdbcInsert(getDataSource())
                        .withTableName("games");

        Map<String, Object> gameParameters = new HashMap<String, Object>(5);
        gameParameters.put("gameid", game.getGameId());
        gameParameters.put("starttime", game.getStartTime());
        gameParameters.put("teamhomeid", game.getTeamHome().getTeamId());
        gameParameters.put("teamawayid", game.getTeamAway().getTeamId());
        gameParameters.put("venueid", game.getVenue().getVenueId());

        try
        {
            insertGame.execute(gameParameters);
        }
        catch (DataIntegrityViolationException divex)
        {
            System.out.println(divex.getMessage());
            log.warning("Duplicate entry");
        }
    }

    public List<Game> getGame() {
        String sql = "select * from games";
        JdbcTemplate queryPosition= new JdbcTemplate(getDataSource());

        List<Game> games = queryPosition.query(sql,
                new GameRowMapper());

        return games;
    }

    public Game getGamebyId(int gameId) {
        String sql = "select * from games where gameid = ?";
        JdbcTemplate queryGame= new JdbcTemplate(getDataSource());
        Game game = queryGame.queryForObject(sql, new Object[] { gameId },
                new GameRowMapper());
        return game;
    }
}
