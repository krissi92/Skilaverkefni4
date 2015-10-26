package is.rufan.tournament.domain;

import is.rufan.player.domain.Player;

import java.util.List;

/**
 * Created by Kristján on 26.10.2015.
 */
public class FantasyTeam {

    private int FantasyTeamId;
    private int userId;
    private String FantasyTeamName;
    private List<Player> players;
    private int tournamentId;

    public FantasyTeam(){}

    public FantasyTeam(int fantasyTeamId, int userId, String fantasyTeamName, List<Player> players, int tournamentId) {
        FantasyTeamId = fantasyTeamId;
        this.userId = userId;
        FantasyTeamName = fantasyTeamName;
        this.players = players;
        this.tournamentId = tournamentId;
    }

    public int getFantasyTeamId() {
        return FantasyTeamId;
    }

    public void setFantasyTeamId(int fantasyTeamId) {
        FantasyTeamId = fantasyTeamId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFantasyTeamName() {
        return FantasyTeamName;
    }

    public void setFantasyTeamName(String fantasyTeamName) {
        FantasyTeamName = fantasyTeamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }



}
