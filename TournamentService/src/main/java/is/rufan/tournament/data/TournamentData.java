package is.rufan.tournament.data;
import is.rufan.team.data.GameRowMapper;
import is.rufan.team.domain.Game;
import is.rufan.tournament.domain.Tournament;

import is.rufan.tournament.domain.TournamentGames;
import is.ruframework.data.RuData;
import is.ruframework.domain.RuException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.*;

/**
 * Created by Kristj�n on 23.10.2015.
 */
public class TournamentData extends RuData implements TournamentDataGateway{


    public void addTournament(Tournament tour) {
        SimpleJdbcInsert insertTournament =
                new SimpleJdbcInsert(getDataSource()).withTableName("tournaments");

        Map<String, Object> tournamentParameter = new HashMap<String, Object>(6);
        tournamentParameter.put("tournamentId", tour.getTournamentId());
        tournamentParameter.put("name", tour.getName());
        tournamentParameter.put("startTime", tour.getStartTime());
        tournamentParameter.put("endTime", tour.getEndTime());
        tournamentParameter.put("leagueName", tour.getLeagueName());
        tournamentParameter.put("status", tour.getStatus());

        try{
            insertTournament.execute(tournamentParameter);
        }
        catch(DataIntegrityViolationException divex){
            log.warning("Duplicate Entry");
        }
        SimpleJdbcInsert insertTournamentGames =
                new SimpleJdbcInsert(getDataSource()).withTableName("tournamentgames");
        List<Game> tournamentGames = tour.getTournamentGames();
        if(!tournamentGames.isEmpty()) {
            for (Game games : tournamentGames) {
                Map<String, Object> tournamentGameParameters = new HashMap<String, Object>(2);
                tournamentGameParameters.put("tournamentid", tour.getTournamentId());
                tournamentGameParameters.put("gameid", games.getGameId()); //ATH
                try {
                    insertTournamentGames.execute(tournamentGameParameters);
                } catch (DataIntegrityViolationException divex) {
                    log.warning("Duplicate Entry");
                }
            }
        }



    }

    public Tournament getTournament(int tournamentId) {
        String sql = "select * from tournaments where id = ?";
        JdbcTemplate queryTournament = new JdbcTemplate(getDataSource());
        Tournament tournament = queryTournament.queryForObject(sql, new Object[] { tournamentId },
                new TournamentRowMapper());
        return tournament;
    }

    public List<Tournament> getTournaments() {
        String sql = "select * from tournaments";
        JdbcTemplate quearytournaments = new JdbcTemplate(getDataSource());

        List<Tournament> tournaments = quearytournaments.query(sql, new TournamentRowMapper());

        return tournaments;
    }

    public List<Game> getTournamentGames(int tournamentId) { //ATH


        String Gsql = "select * from games";
        String TGsql = "select * from tournamentgames";

        /*Get list of games*/
        JdbcTemplate queryGames = new JdbcTemplate(getDataSource());
        List<Game> games = queryGames.query(Gsql, new GameRowMapper());

        /*Get list of tournament games*/
        JdbcTemplate queryTournamentGames = new JdbcTemplate(getDataSource());
        Collection<TournamentGames> tourgames = queryTournamentGames.query(TGsql, new TournamentGamesRowMapper());

        /*Compare them and return a list of games in the given tournament*/
        List <Game> result = new ArrayList<Game>();
        for(Game check : games){
            if(tourgames.contains(check.getGameId())){//sk�tamix sem g�ti ekki virka� !!
                result.add(check);
            }
        }


        return result;
    }
}
