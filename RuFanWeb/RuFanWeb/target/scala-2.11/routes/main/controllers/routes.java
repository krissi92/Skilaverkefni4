
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Skilaverkefni4/RuFanWeb/RuFanWeb/conf/routes
// @DATE:Mon Oct 26 19:41:48 GMT 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseSignupController SignupController = new controllers.ReverseSignupController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseLoginController LoginController = new controllers.ReverseLoginController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTeamController TeamController = new controllers.ReverseTeamController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseTournamentController TournamentController = new controllers.ReverseTournamentController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseSignupController SignupController = new controllers.javascript.ReverseSignupController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseLoginController LoginController = new controllers.javascript.ReverseLoginController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTeamController TeamController = new controllers.javascript.ReverseTeamController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseTournamentController TournamentController = new controllers.javascript.ReverseTournamentController(RoutesPrefix.byNamePrefix());
  }

}
