package is.rufan.tournament.service;

import is.rufan.team.domain.Game;
import is.rufan.tournament.domain.Tournament;

import java.util.List;

/**
 * Created by Kristján on 23.10.2015.
 */
public interface TournamentService {

    public void addTournament(Tournament tournament) throws TournamentServiceException;
    public List<Tournament> getTournaments();
    public Tournament getTournament(int tournamentId);
    public List<Game> getTournamentGames(int tournamentId);
}
