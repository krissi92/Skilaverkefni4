package is.rufan.player.data;

import is.rufan.player.domain.Player;
import is.rufan.player.domain.Position;

import java.util.List;

public interface PlayerDataGateway
{
  public void addPlayer(Player player);
  public Player getPlayer(int playerid);
  public List<Player> getAllPlayers();
  public List<Player> getPlayersByPos(int id);
  public List<Player> getPlayersInTeam(int teamId);

}
