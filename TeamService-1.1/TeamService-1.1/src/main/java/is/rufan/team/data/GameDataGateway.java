package is.rufan.team.data;

import is.rufan.team.domain.Game;

import java.util.List;

/**
 * Created by Kristján on 26.10.2015.
 */
public interface GameDataGateway {

    void addGame(Game game);
    public List<Game> getGame();
    public Game getGamebyId(int id);

}

