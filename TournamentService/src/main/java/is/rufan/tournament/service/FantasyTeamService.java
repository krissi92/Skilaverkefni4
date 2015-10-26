package is.rufan.tournament.service;

import is.rufan.player.domain.Player;
import is.rufan.tournament.domain.FantasyTeam;

import java.util.List;

/**
 * Created by Kristján on 26.10.2015.
 */
public interface FantasyTeamService {

    public List<Player> getFantasyTeamPlayers(int fantasyTeamid);
    public FantasyTeam getFantasyTeam(int userId);
    public void addPlayerToFantasyTeam(int fantasyTeamId, int userId);
    public void createFantasyTeam(FantasyTeam fantasyTeam);
}
