package is.rufan.team.service;

import is.rufan.team.domain.Game;

import java.util.List;

public interface GameService
{
  public void addGame(Game game);
  public List<Game> getGames();
  public Game getGamebyId(int id);
}
