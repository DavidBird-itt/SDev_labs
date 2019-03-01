// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SDev/SDev_labs/conf/routes
// @DATE:Fri Mar 01 10:43:46 GMT 2019


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
