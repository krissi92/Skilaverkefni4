package is.rufan.player.test;

import is.rufan.player.domain.Country;
import is.rufan.player.domain.Player;
import is.rufan.player.domain.Position;
import is.rufan.player.service.PlayerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestPlayerData
{
  public TestPlayerData()
  {

    ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:playerapp.xml");
    PlayerService playerService = (PlayerService)applicationContext.getBean("playerService");

   /* System.out.println(playerService.getPlayer(457));

    Player player = new Player();
    player.setFirstName("firstname");
    player.setLastName("lastname");
    player.setHeight(190);
    player.setWeight(90);
    player.setBirthDate(new Date());
    player.setTeamId(1);
    player.setNationality(new Country(1, "Iceland", "IS"));

    playerService.addPlayer(player);*/
    List<Position> test = new ArrayList<Position>();
    test = playerService.getPlayerPos(346219);
    for(Position play : test){
      System.out.println("Player: " + play.getName());
    }

  }

  public static void main(String[] args)
  {
    new TestPlayerData();
  }
}
