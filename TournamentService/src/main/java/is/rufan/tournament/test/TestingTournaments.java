package is.rufan.tournament.test;

import is.rufan.team.domain.Game;
import is.rufan.team.service.GameService;
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
        GameService gameService = (GameService)applicationContext.getBean("gameService");


        System.out.println("Start Test");

        Tournament tour = new Tournament();
        tour.setName("RufanTournament");
        tour.setEndTime(new Date());
        tour.setStartTime(new Date()); //ath
        tour.setLeagueName("Rufan");
        tour.setStatus("STATUS_ACTIVE");
        tour.setTournamentId(3);


        Game test1 = gameService.getGamebyId(1546789);
        Game test2 = gameService.getGamebyId(1546791);
        Game test3 = gameService.getGamebyId(1546793);
        Game test4 = gameService.getGamebyId(1546804);


        List<Game> testerList = new ArrayList<Game>();
        testerList.add(test1);
        testerList.add(test2);
        testerList.add(test3);
        testerList.add(test4);
        tour.setTournamentGames(testerList);

        tournamentService.addTournament(tour);

        System.out.println("End of test");

    }

    public static void main(String[] args)
    {
        new TestingTournaments();
    }
}
