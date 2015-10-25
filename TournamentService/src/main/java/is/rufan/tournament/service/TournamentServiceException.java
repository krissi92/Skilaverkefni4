package is.rufan.tournament.service;

/**
 * Created by Kristján on 23.10.2015.
 */
public class TournamentServiceException extends RuntimeException
{
    public TournamentServiceException(){

    };

    public TournamentServiceException(String message) {
        super(message);
    }

    public TournamentServiceException(String message, Throwable cause){
        super(message, cause);
    }


}
