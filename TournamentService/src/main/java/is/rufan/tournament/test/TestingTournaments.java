package is.rufan.tournament.test;

import is.rufan.team.domain.Game;
import is.rufan.tournament.domain.Tournament;
import is.rufan.tournament.service.TournamentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestingTournaments {

    public TestingTournaments(){
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:tournamentapp.xml");
        TournamentService tournamentService = (TournamentService)applicationContext.getBean("tournamentService");

        System.out.println("Start Test");

        Tournament tour = new Tournament();
        tour.setName("Penis");
        tour.setEndTime(new Date());
        tour.setStartTime(new Date());
        tour.setLeagueName("hlölli");
        tour.setStatus("TEST");
        tour.setTournamentId(1);


        Game test1 = new Game();
        test1.setGameId(123);
        test1.setStartTime(new Date());
        test1.setTeamAway(null);
        test1.setTeamHome(null);
        test1.setVenue(null);

        Game test2 = new Game();
        test2.setGameId(456);
        test2.setStartTime(new Date());
        test2.setTeamAway(null);
        test2.setTeamHome(null);
        test2.setVenue(null);

        List<Game> testerList = new ArrayList<Game>();
        testerList.add(test1);
        testerList.add(test2);

        tour.setTournamentGames(testerList);

        tournamentService.addTournament(tour);

        System.out.println("End of test");

    }

    public static void main(String[] args)
    {
        new TestingTournaments();
    }
}
