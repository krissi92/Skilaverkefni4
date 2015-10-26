
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Skilaverkefni4/RuFanWeb/RuFanWeb/conf/routes
// @DATE:Mon Oct 26 19:41:48 GMT 2015

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
  Application_6: controllers.Application,
  // @LINE:7
  SignupController_0: controllers.SignupController,
  // @LINE:9
  LoginController_4: controllers.LoginController,
  // @LINE:12
  UserController_2: controllers.UserController,
  // @LINE:14
  TeamController_5: controllers.TeamController,
  // @LINE:15
  TournamentController_1: controllers.TournamentController,
  // @LINE:19
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_6: controllers.Application,
    // @LINE:7
    SignupController_0: controllers.SignupController,
    // @LINE:9
    LoginController_4: controllers.LoginController,
    // @LINE:12
    UserController_2: controllers.UserController,
    // @LINE:14
    TeamController_5: controllers.TeamController,
    // @LINE:15
    TournamentController_1: controllers.TournamentController,
    // @LINE:19
    Assets_3: controllers.Assets
  ) = this(errorHandler, Application_6, SignupController_0, LoginController_4, UserController_2, TeamController_5, TournamentController_1, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_6, SignupController_0, LoginController_4, UserController_2, TeamController_5, TournamentController_1, Assets_3, prefix)
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
    Application_6.index(),
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
    SignupController_0.blank(),
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
    SignupController_0.signup(),
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
    LoginController_4.blank(),
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
    LoginController_4.login(),
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
    LoginController_4.logout(),
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
    UserController_2.getUserProfile(),
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
    UserController_2.postUserProfile(),
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
    TeamController_5.getTeams(),
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
    TournamentController_1.fantasyTeam(),
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

  // @LINE:19
  private[this] lazy val controllers_Assets_versioned10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned10_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
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
        controllers_Application_index0_invoker.call(Application_6.index())
      }
  
    // @LINE:7
    case controllers_SignupController_blank1_route(params) =>
      call { 
        controllers_SignupController_blank1_invoker.call(SignupController_0.blank())
      }
  
    // @LINE:8
    case controllers_SignupController_signup2_route(params) =>
      call { 
        controllers_SignupController_signup2_invoker.call(SignupController_0.signup())
      }
  
    // @LINE:9
    case controllers_LoginController_blank3_route(params) =>
      call { 
        controllers_LoginController_blank3_invoker.call(LoginController_4.blank())
      }
  
    // @LINE:10
    case controllers_LoginController_login4_route(params) =>
      call { 
        controllers_LoginController_login4_invoker.call(LoginController_4.login())
      }
  
    // @LINE:11
    case controllers_LoginController_logout5_route(params) =>
      call { 
        controllers_LoginController_logout5_invoker.call(LoginController_4.logout())
      }
  
    // @LINE:12
    case controllers_UserController_getUserProfile6_route(params) =>
      call { 
        controllers_UserController_getUserProfile6_invoker.call(UserController_2.getUserProfile())
      }
  
    // @LINE:13
    case controllers_UserController_postUserProfile7_route(params) =>
      call { 
        controllers_UserController_postUserProfile7_invoker.call(UserController_2.postUserProfile())
      }
  
    // @LINE:14
    case controllers_TeamController_getTeams8_route(params) =>
      call { 
        controllers_TeamController_getTeams8_invoker.call(TeamController_5.getTeams())
      }
  
    // @LINE:15
    case controllers_TournamentController_fantasyTeam9_route(params) =>
      call { 
        controllers_TournamentController_fantasyTeam9_invoker.call(TournamentController_1.fantasyTeam())
      }
  
    // @LINE:19
    case controllers_Assets_versioned10_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned10_invoker.call(Assets_3.versioned(path, file))
      }
  }
}