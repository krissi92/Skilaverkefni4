package is.rufan.tournament.data;

import is.rufan.team.domain.Game;
import is.rufan.tournament.domain.Tournament;

import java.util.List;

/**
 * Created by Kristján on 23.10.2015.
 */
public interface TournamentDataGateway {

    public void addTournament(Tournament tour);
    public Tournament getTournament(int tournamentId);
    public List<Tournament> getTournaments();
    public List<Game> getTournamentGames(int tournamentId);


}
