
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Skilaverkefni4/RuFanWeb/RuFanWeb/conf/routes
// @DATE:Tue Oct 27 03:29:37 GMT 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_7: controllers.Application,
  // @LINE:7
  SignupController_1: controllers.SignupController,
  // @LINE:9
  LoginController_5: controllers.LoginController,
  // @LINE:12
  UserController_3: controllers.UserController,
  // @LINE:14
  TeamController_6: controllers.TeamController,
  // @LINE:15
  TournamentController_2: controllers.TournamentController,
  // @LINE:18
  PlayerController_0: controllers.PlayerController,
  // @LINE:27
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_7: controllers.Application,
    // @LINE:7
    SignupController_1: controllers.SignupController,
    // @LINE:9
    LoginController_5: controllers.LoginController,
    // @LINE:12
    UserController_3: controllers.UserController,
    // @LINE:14
    TeamController_6: controllers.TeamController,
    // @LINE:15
    TournamentController_2: controllers.TournamentController,
    // @LINE:18
    PlayerController_0: controllers.PlayerController,
    // @LINE:27
    Assets_4: controllers.Assets
  ) = this(errorHandler, Application_7, SignupController_1, LoginController_5, UserController_3, TeamController_6, TournamentController_2, PlayerController_0, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_7, SignupController_1, LoginController_5, UserController_3, TeamController_6, TournamentController_2, PlayerController_0, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignupController.blank()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.SignupController.signup()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.blank()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.getUserProfile()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.postUserProfile()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/teams""", """controllers.TeamController.getTeams()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fantasyTeam""", """controllers.TournamentController.fantasyTeam()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fantasyTeam""", """controllers.TournamentController.editFantasyTeams()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/goalkeepers""", """controllers.PlayerController.getGoalkeepers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/positions""", """controllers.PlayerController.getPositions()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/players/$id<[^/]+>""", """controllers.PlayerController.getPlayers(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/positions/$id<[^/]+>""", """controllers.PlayerController.getPlayerPosition(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_7.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_SignupController_blank1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignupController_blank1_invoker = createInvoker(
    SignupController_1.blank(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignupController",
      "blank",
      Nil,
      "GET",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_SignupController_signup2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_SignupController_signup2_invoker = createInvoker(
    SignupController_1.signup(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.SignupController",
      "signup",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_LoginController_blank3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_blank3_invoker = createInvoker(
    LoginController_5.blank(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "blank",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_login4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login4_invoker = createInvoker(
    LoginController_5.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_LoginController_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout5_invoker = createInvoker(
    LoginController_5.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UserController_getUserProfile6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_getUserProfile6_invoker = createInvoker(
    UserController_3.getUserProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUserProfile",
      Nil,
      "GET",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_postUserProfile7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_postUserProfile7_invoker = createInvoker(
    UserController_3.postUserProfile(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "postUserProfile",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_TeamController_getTeams8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/teams")))
  )
  private[this] lazy val controllers_TeamController_getTeams8_invoker = createInvoker(
    TeamController_6.getTeams(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TeamController",
      "getTeams",
      Nil,
      "GET",
      """""",
      this.prefix + """api/teams"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_TournamentController_fantasyTeam9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fantasyTeam")))
  )
  private[this] lazy val controllers_TournamentController_fantasyTeam9_invoker = createInvoker(
    TournamentController_2.fantasyTeam(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TournamentController",
      "fantasyTeam",
      Nil,
      "GET",
      """""",
      this.prefix + """fantasyTeam"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_TournamentController_editFantasyTeams10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fantasyTeam")))
  )
  private[this] lazy val controllers_TournamentController_editFantasyTeams10_invoker = createInvoker(
    TournamentController_2.editFantasyTeams(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TournamentController",
      "editFantasyTeams",
      Nil,
      "POST",
      """""",
      this.prefix + """fantasyTeam"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_PlayerController_getGoalkeepers11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/goalkeepers")))
  )
  private[this] lazy val controllers_PlayerController_getGoalkeepers11_invoker = createInvoker(
    PlayerController_0.getGoalkeepers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayerController",
      "getGoalkeepers",
      Nil,
      "GET",
      """GET         /api/players            controllers.PlayerController.getPlayers()""",
      this.prefix + """api/goalkeepers"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PlayerController_getPositions12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/positions")))
  )
  private[this] lazy val controllers_PlayerController_getPositions12_invoker = createInvoker(
    PlayerController_0.getPositions(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayerController",
      "getPositions",
      Nil,
      "GET",
      """""",
      this.prefix + """api/positions"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_PlayerController_getPlayers13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/players/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PlayerController_getPlayers13_invoker = createInvoker(
    PlayerController_0.getPlayers(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayerController",
      "getPlayers",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """api/players/$id<[^/]+>"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_PlayerController_getPlayerPosition14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/positions/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PlayerController_getPlayerPosition14_invoker = createInvoker(
    PlayerController_0.getPlayerPosition(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PlayerController",
      "getPlayerPosition",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """api/positions/$id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_7.index())
      }
  
    // @LINE:7
    case controllers_SignupController_blank1_route(params) =>
      call { 
        controllers_SignupController_blank1_invoker.call(SignupController_1.blank())
      }
  
    // @LINE:8
    case controllers_SignupController_signup2_route(params) =>
      call { 
        controllers_SignupController_signup2_invoker.call(SignupController_1.signup())
      }
  
    // @LINE:9
    case controllers_LoginController_blank3_route(params) =>
      call { 
        controllers_LoginController_blank3_invoker.call(LoginController_5.blank())
      }
  
    // @LINE:10
    case controllers_LoginController_login4_route(params) =>
      call { 
        controllers_LoginController_login4_invoker.call(LoginController_5.login())
      }
  
    // @LINE:11
    case controllers_LoginController_logout5_route(params) =>
      call { 
        controllers_LoginController_logout5_invoker.call(LoginController_5.logout())
      }
  
    // @LINE:12
    case controllers_UserController_getUserProfile6_route(params) =>
      call { 
        controllers_UserController_getUserProfile6_invoker.call(UserController_3.getUserProfile())
      }
  
    // @LINE:13
    case controllers_UserController_postUserProfile7_route(params) =>
      call { 
        controllers_UserController_postUserProfile7_invoker.call(UserController_3.postUserProfile())
      }
  
    // @LINE:14
    case controllers_TeamController_getTeams8_route(params) =>
      call { 
        controllers_TeamController_getTeams8_invoker.call(TeamController_6.getTeams())
      }
  
    // @LINE:15
    case controllers_TournamentController_fantasyTeam9_route(params) =>
      call { 
        controllers_TournamentController_fantasyTeam9_invoker.call(TournamentController_2.fantasyTeam())
      }
  
    // @LINE:16
    case controllers_TournamentController_editFantasyTeams10_route(params) =>
      call { 
        controllers_TournamentController_editFantasyTeams10_invoker.call(TournamentController_2.editFantasyTeams())
      }
  
    // @LINE:18
    case controllers_PlayerController_getGoalkeepers11_route(params) =>
      call { 
        controllers_PlayerController_getGoalkeepers11_invoker.call(PlayerController_0.getGoalkeepers())
      }
  
    // @LINE:19
    case controllers_PlayerController_getPositions12_route(params) =>
      call { 
        controllers_PlayerController_getPositions12_invoker.call(PlayerController_0.getPositions())
      }
  
    // @LINE:20
    case controllers_PlayerController_getPlayers13_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PlayerController_getPlayers13_invoker.call(PlayerController_0.getPlayers(id))
      }
  
    // @LINE:21
    case controllers_PlayerController_getPlayerPosition14_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_PlayerController_getPlayerPosition14_invoker.call(PlayerController_0.getPlayerPosition(id))
      }
  
    // @LINE:27
    case controllers_Assets_versioned15_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_4.versioned(path, file))
      }
  }
}