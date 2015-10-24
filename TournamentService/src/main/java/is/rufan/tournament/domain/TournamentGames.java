package is.rufan.tournament.domain;

/**
 * Created by Kristján on 24.10.2015.
 */
public class TournamentGames {


    private int tournamentId;
    private int gameId;

    public TournamentGames(){}

    public TournamentGames(int tournamentId, int gameId) {
        this.tournamentId = tournamentId;
        this.gameId = gameId;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }
}
