package is.rufan.tournament.domain;

import is.rufan.team.domain.Game;

import java.util.Date;
import java.util.List;

/**
 * Created by Kristján on 23.10.2015.
 */
public class Tournament {

    private int tournamentId;
    private String Name;
    private Date startTime;
    private Date endTime;
    private String leagueName;
    private String status;
    private List<Game> tournamentGames;



    public Tournament(){}

    public Tournament(int tournamentId, String name, Date startTime, Date endTime, String leagueName, String status, List<Game> tournamentGames) {
        this.tournamentId = tournamentId;
        Name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.leagueName = leagueName;
        this.status = status;
        this.tournamentGames = tournamentGames;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Game> getTournamentGames() {
        return tournamentGames;
    }

    public void setTournamentGames(List<Game> tournamentGames) {
        this.tournamentGames = tournamentGames;
    }


}
