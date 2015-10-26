package is.rufan.tournament.data;

import is.rufan.player.data.PlayerRowMapper;
import is.rufan.player.domain.Player;
import is.rufan.tournament.domain.FantasyPlayer;
import is.rufan.tournament.domain.FantasyTeam;
import is.ruframework.data.RuData;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kristján on 26.10.2015.
 */
public class FantasyTeamData extends RuData implements FantasyTeamDataGateway {


    public List<Player> getFantasyTeamPlayers(int fantasyTeamid) {
        String FPsql = "select * from fantasyplayers";
        String Psql = "select * from players";


        JdbcTemplate queryFantasyPlayers = new JdbcTemplate(getDataSource());
        List<FantasyPlayer> fantasyplayers = queryFantasyPlayers.query(FPsql, new FantasyPlayerRowMapper());

        JdbcTemplate queryPlayers = new JdbcTemplate(getDataSource());
        List<Player> players = queryPlayers.query(Psql, new PlayerRowMapper());

        List<Player> result = new ArrayList<Player>();
        for(Player check : players){
            if(fantasyplayers.contains(check.getPlayerId())){
                result.add(check);
            }
        }

        return result;
    }

    public FantasyTeam getFantasyTeam(int userId) {
        String sql = "select * from fantasyteams where userid = ?";
        JdbcTemplate queryFantasy = new JdbcTemplate(getDataSource());
        FantasyTeam fantasyTeam = queryFantasy.queryForObject(sql, new Object[] {userId}, new FantasyTeamRowMapper());
        return fantasyTeam;
    }

    public void addPlayerToFantasyTeam(int fantasyTeamId, int playerId) {
        SimpleJdbcInsert insertFantasyPlayer = new SimpleJdbcInsert(getDataSource()).withTableName("fantasyplayers");

        Map<String, Object> fantasyPlayerParam = new HashMap<String, Object>(2);
        fantasyPlayerParam.put("fantasyteamid", fantasyTeamId);
        fantasyPlayerParam.put("playerid", playerId);

        try{
            insertFantasyPlayer.execute(fantasyPlayerParam);
        }
        catch(DataIntegrityViolationException divex){
            log.warning("Duplicate items");
        }



    }

    public void createFantasyTeam(FantasyTeam fantasyTeam) {
        SimpleJdbcInsert insertFantasyTeam = new SimpleJdbcInsert(getDataSource()).withTableName("fantasyteam");

        Map<String, Object> fantasyTeamParameters = new HashMap<String, Object>(4);
        fantasyTeamParameters.put("fantasyteamname", fantasyTeam.getFantasyTeamName());
        fantasyTeamParameters.put("tournamentid", fantasyTeam.getTournamentId());
        fantasyTeamParameters.put("fantasyteamid", fantasyTeam.getFantasyTeamId());
        fantasyTeamParameters.put("userid", fantasyTeam.getUserId());

        try{
            insertFantasyTeam.execute(fantasyTeamParameters);
        }
        catch(DataIntegrityViolationException divex){
            log.warning("Duplicate item");
        }
        SimpleJdbcInsert insertFantasyPlayers = new SimpleJdbcInsert(getDataSource()).withTableName("fantasyplayers");
        List<Player> fantasyplayers = fantasyTeam.getPlayers();
        if(!fantasyplayers.isEmpty()){
            for(Player player : fantasyplayers){
                Map<String, Object> fantasyplayerparameter = new HashMap<String, Object>(2);
                fantasyplayerparameter.put("fantasyteamid", fantasyTeam.getFantasyTeamId());
                fantasyplayerparameter.put("playerid", player.getPlayerId());
                try{
                    insertFantasyPlayers.execute(fantasyplayerparameter);
                }
                catch(DataIntegrityViolationException divex){
                    log.warning("Duplicate item");
                }
            }
        }






    }
}
