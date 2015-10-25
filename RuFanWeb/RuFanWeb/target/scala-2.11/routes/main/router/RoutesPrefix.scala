
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/thordisjona/IdeaProjects/Skilaverkefni4/RuFanWeb/RuFanWeb/conf/routes
// @DATE:Sat Oct 24 15:23:41 GMT 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
