
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Skilaverkefni4/RuFanWeb/RuFanWeb/conf/routes
// @DATE:Tue Oct 27 03:29:37 GMT 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:27
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseSignupController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def signup: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignupController.signup",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:7
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.SignupController.blank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def postUserProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.postUserProfile",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:12
    def getUserProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUserProfile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseLoginController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:9
    def blank: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.blank",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:10
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.LoginController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReversePlayerController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def getPlayers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayerController.getPlayers",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/players/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:19
    def getPositions: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayerController.getPositions",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/positions"})
        }
      """
    )
  
    // @LINE:18
    def getGoalkeepers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayerController.getGoalkeepers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/goalkeepers"})
        }
      """
    )
  
    // @LINE:21
    def getPlayerPosition: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PlayerController.getPlayerPosition",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/positions/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:14
  class ReverseTeamController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def getTeams: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TeamController.getTeams",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/teams"})
        }
      """
    )
  
  }

  // @LINE:15
  class ReverseTournamentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def fantasyTeam: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TournamentController.fantasyTeam",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fantasyTeam"})
        }
      """
    )
  
    // @LINE:16
    def editFantasyTeams: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TournamentController.editFantasyTeams",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fantasyTeam"})
        }
      """
    )
  
  }


}