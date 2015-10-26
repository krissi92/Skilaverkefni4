package is.rufan.tournament.service;

import is.rufan.player.data.PlayerDataGateway;
import is.rufan.player.domain.Player;
import is.rufan.tournament.data.FantasyTeamDataGateway;
import is.rufan.tournament.domain.FantasyTeam;
import is.ruframework.data.RuDataAccessFactory;
import is.ruframework.domain.RuException;

import java.util.List;

/**
 * Created by Kristján on 26.10.2015.
 */
public class FantasyTeamServiceData implements FantasyTeamService {

    RuDataAccessFactory factory;
    PlayerDataGateway playerDataGateway;
    FantasyTeamDataGateway fantasyTeamDataGateway;

    public FantasyTeamServiceData() throws RuException{

        factory = RuDataAccessFactory.getInstance("fantasyteam.xml"); //TODO
        playerDataGateway = (PlayerDataGateway) factory.getDataAccess("playerData");
        fantasyTeamDataGateway = (FantasyTeamDataGateway) factory.getDataAccess("fantasyTeamData");
    }


    public List<Player> getFantasyTeamPlayers(int fantasyTeamid) {
        return fantasyTeamDataGateway.getFantasyTeamPlayers(fantasyTeamid);
    }

    public FantasyTeam getFantasyTeam(int userId) {
        return fantasyTeamDataGateway.getFantasyTeam(userId);
    }

    public void addPlayerToFantasyTeam(int fantasyTeamId, int userId) {
        fantasyTeamDataGateway.addPlayerToFantasyTeam(fantasyTeamId, userId);
    }

    public void createFantasyTeam(FantasyTeam fantasyTeam) {
        fantasyTeamDataGateway.createFantasyTeam(fantasyTeam);
    }
}
