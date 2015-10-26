package is.rufan.team.service;

import is.rufan.team.data.GameDataGateway;
import is.rufan.team.data.TeamDataGateway;
import is.rufan.team.data.VenueDataGateway;
import is.rufan.team.domain.Game;
import is.ruframework.data.RuDataAccessFactory;
import is.ruframework.domain.RuException;

import java.util.List;

public class GameServiceData implements GameService
{
  RuDataAccessFactory factory;
  GameDataGateway gameDataGateway;
  VenueDataGateway venueDataGateway;
  TeamDataGateway teamDataGateway;

  public GameServiceData() throws RuException{

    factory = RuDataAccessFactory.getInstance("gamedata.xml");
    teamDataGateway = (TeamDataGateway) factory.getDataAccess("teamData");
    gameDataGateway = (GameDataGateway) factory.getDataAccess("gameData");
    venueDataGateway = (VenueDataGateway) factory.getDataAccess("venueData");

  }

  public void addGame(Game game)
  {
    gameDataGateway.addGame(game);
  }

  public List<Game> getGames() {
    return gameDataGateway.getGame();
  }

  public Game getGamebyId(int id) {
    return gameDataGateway.getGamebyId(id);
  }
}
