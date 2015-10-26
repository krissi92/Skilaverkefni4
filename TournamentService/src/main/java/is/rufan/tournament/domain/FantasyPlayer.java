package is.rufan.tournament.domain;

/**
 * Created by Kristj�n on 26.10.2015.
 */
public class FantasyPlayer {

    private int FantasyTeamId;
    private int PlayerId;

    public FantasyPlayer() {}

    public FantasyPlayer(int fantasyTeamId, int playerId) {
        FantasyTeamId = fantasyTeamId;
        PlayerId = playerId;
    }

    public int getFantasyTeamId() {
        return FantasyTeamId;
    }

    public void setFantasyTeamId(int fantasyTeamId) {
        FantasyTeamId = fantasyTeamId;
    }

    public int getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(int playerId) {
        PlayerId = playerId;
    }
}
