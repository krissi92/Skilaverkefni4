package is.rufan.player.data;

import is.rufan.player.domain.Position;

import java.util.Collection;
import java.util.List;

public interface PositionDataGateway
{
  public Position getPosition(int positionId);
  public List<Position> getPositions();
  public List<Position> getPlayerPos(int playerId);
}
