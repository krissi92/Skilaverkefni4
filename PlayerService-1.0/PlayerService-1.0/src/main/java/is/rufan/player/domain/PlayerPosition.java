package is.rufan.player.domain;

/**
 * Created by Kristján on 26.10.2015.
 */
public class PlayerPosition {
    private int playerid;
    private int positionid;

    public PlayerPosition(){}

    public void setPositionid(int positionid) {
        this.positionid = positionid;
    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public int getPositionid() {
        return positionid;
    }



    public PlayerPosition(int playerid, int positionid) {
        this.playerid = playerid;
        this.positionid = positionid;
    }
}
