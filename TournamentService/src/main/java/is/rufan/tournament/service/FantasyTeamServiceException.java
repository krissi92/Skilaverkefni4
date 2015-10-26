package is.rufan.tournament.service;

/**
 * Created by Kristj�n on 26.10.2015.
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
