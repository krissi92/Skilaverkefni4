package is.rufan.tournament.service;

/**
 * Created by Kristján on 26.10.2015.
 */
public class FantasyTeamServiceException extends RuntimeException {

    public FantasyTeamServiceException(){

    };

    public FantasyTeamServiceException(String message) {
        super(message);
    }

    public FantasyTeamServiceException(String message, Throwable cause){
        super(message, cause);
    }

}
