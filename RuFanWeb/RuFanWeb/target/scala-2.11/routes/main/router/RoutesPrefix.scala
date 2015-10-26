
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Skilaverkefni4/RuFanWeb/RuFanWeb/conf/routes
// @DATE:Mon Oct 26 19:41:48 GMT 2015


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
