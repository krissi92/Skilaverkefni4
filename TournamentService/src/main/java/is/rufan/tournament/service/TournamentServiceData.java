package is.rufan.tournament.service;

import is.rufan.team.data.GameDataGateway;
import is.rufan.team.domain.Game;
import is.rufan.tournament.data.TournamentDataGateway;
import is.rufan.tournament.domain.Tournament;
import is.ruframework.data.RuDataAccess;
import is.ruframework.data.RuDataAccessFactory;
import is.ruframework.domain.RuException;

import java.util.List;

/**
 * Created by Kristján on 23.10.2015.
 */
public class TournamentServiceData implements TournamentService {

    RuDataAccessFactory factory;
    TournamentDataGateway tournamentDataGateway;
    GameDataGateway gameDataGateway;


    public TournamentServiceData() throws RuException{

        factory = RuDataAccessFactory.getInstance("tournamentdata.xml");//TODO
        tournamentDataGateway = (TournamentDataGateway) factory.getDataAccess("tournamentData");
        gameDataGateway = (GameDataGateway) factory.getDataAccess("gameData");

    }

    public void addTournament(Tournament tournament) throws TournamentServiceException {

        tournamentDataGateway.addTournament(tournament);

    }

    public List<Tournament> getTournaments() {

        return tournamentDataGateway.getTournaments();
    }

    public Tournament getTournament(int tournamentId) {
        return tournamentDataGateway.getTournament(tournamentId);
    }

    public List<Game> getTournamentGames(int tournamentId) throws RuException {
        return tournamentDataGateway.getTournamentGames(tournamentId);
    }
}
