// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SDev/SDev_labs/conf/routes
// @DATE:Fri Mar 01 10:43:46 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_1: controllers.HomeController,
  // @LINE:34
  LoginController_5: controllers.LoginController,
  // @LINE:45
  CountController_0: controllers.CountController,
  // @LINE:47
  AsyncController_2: controllers.AsyncController,
  // @LINE:50
  Assets_4: controllers.Assets,
  // @LINE:53
  ShoppingCtrl_3: controllers.ShoppingCtrl,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_1: controllers.HomeController,
    // @LINE:34
    LoginController_5: controllers.LoginController,
    // @LINE:45
    CountController_0: controllers.CountController,
    // @LINE:47
    AsyncController_2: controllers.AsyncController,
    // @LINE:50
    Assets_4: controllers.Assets,
    // @LINE:53
    ShoppingCtrl_3: controllers.ShoppingCtrl
  ) = this(errorHandler, HomeController_1, LoginController_5, CountController_0, AsyncController_2, Assets_4, ShoppingCtrl_3, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, LoginController_5, CountController_0, AsyncController_2, Assets_4, ShoppingCtrl_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """onsale""", """controllers.HomeController.onsale(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """about""", """controllers.HomeController.about"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addItem""", """controllers.HomeController.addItem"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateItem/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateItem(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteItem/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteItem(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addItemSubmit""", """controllers.HomeController.addItemSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteCustomer/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteCustomer(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteAdmin/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateCustomer/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateCustomer(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateAdmin/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateAdmin(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.HomeController.usersAdmin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """customers""", """controllers.HomeController.usersCustomer"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAdmin""", """controllers.HomeController.addAdmin"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addAdminSubmit""", """controllers.HomeController.addAdminSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomer""", """controllers.HomeController.addCustomer"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addCustomerSubmit""", """controllers.HomeController.addCustomerSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUser""", """controllers.LoginController.registerUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """registerUserSubmit""", """controllers.LoginController.registerUserSubmit()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showBasket""", """controllers.ShoppingCtrl.showBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addToBasket/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.addToBasket(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.addOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removeOne/""" + "$" + """itemId<[^/]+>""", """controllers.ShoppingCtrl.removeOne(itemId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """emptyBasket""", """controllers.ShoppingCtrl.emptyBasket()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """placeOrder""", """controllers.ShoppingCtrl.placeOrder()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """viewOrder/""" + "$" + """id<[^/]+>""", """controllers.ShoppingCtrl.viewOrder(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_onsale1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("onsale")))
  )
  private[this] lazy val controllers_HomeController_onsale1_invoker = createInvoker(
    HomeController_1.onsale(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "onsale",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """onsale""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_about2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("about")))
  )
  private[this] lazy val controllers_HomeController_about2_invoker = createInvoker(
    HomeController_1.about,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "about",
      Nil,
      "GET",
      this.prefix + """about""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_addItem3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addItem")))
  )
  private[this] lazy val controllers_HomeController_addItem3_invoker = createInvoker(
    HomeController_1.addItem,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addItem",
      Nil,
      "GET",
      this.prefix + """addItem""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_updateItem4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateItem/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateItem4_invoker = createInvoker(
    HomeController_1.updateItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """updateItem/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_deleteItem5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteItem/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteItem5_invoker = createInvoker(
    HomeController_1.deleteItem(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteItem",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """deleteItem/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addItemSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addItemSubmit")))
  )
  private[this] lazy val controllers_HomeController_addItemSubmit6_invoker = createInvoker(
    HomeController_1.addItemSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addItemSubmit",
      Nil,
      "POST",
      this.prefix + """addItemSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_deleteCustomer7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteCustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteCustomer7_invoker = createInvoker(
    HomeController_1.deleteCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteCustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_deleteAdmin8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteAdmin8_invoker = createInvoker(
    HomeController_1.deleteAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteAdmin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """deleteAdmin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_updateCustomer9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateCustomer/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateCustomer9_invoker = createInvoker(
    HomeController_1.updateCustomer(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateCustomer",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateCustomer/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_updateAdmin10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateAdmin/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateAdmin10_invoker = createInvoker(
    HomeController_1.updateAdmin(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateAdmin",
      Seq(classOf[String]),
      "GET",
      this.prefix + """updateAdmin/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_usersAdmin11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_HomeController_usersAdmin11_invoker = createInvoker(
    HomeController_1.usersAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersAdmin",
      Nil,
      "GET",
      this.prefix + """admin""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_HomeController_usersCustomer12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("customers")))
  )
  private[this] lazy val controllers_HomeController_usersCustomer12_invoker = createInvoker(
    HomeController_1.usersCustomer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersCustomer",
      Nil,
      "GET",
      this.prefix + """customers""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_addAdmin13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAdmin")))
  )
  private[this] lazy val controllers_HomeController_addAdmin13_invoker = createInvoker(
    HomeController_1.addAdmin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAdmin",
      Nil,
      "GET",
      this.prefix + """addAdmin""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_HomeController_addAdminSubmit14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addAdminSubmit")))
  )
  private[this] lazy val controllers_HomeController_addAdminSubmit14_invoker = createInvoker(
    HomeController_1.addAdminSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addAdminSubmit",
      Nil,
      "POST",
      this.prefix + """addAdminSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_addCustomer15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomer")))
  )
  private[this] lazy val controllers_HomeController_addCustomer15_invoker = createInvoker(
    HomeController_1.addCustomer,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCustomer",
      Nil,
      "GET",
      this.prefix + """addCustomer""",
      """""",
      Seq()
    )
  )

  // @LINE:32
  private[this] lazy val controllers_HomeController_addCustomerSubmit16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addCustomerSubmit")))
  )
  private[this] lazy val controllers_HomeController_addCustomerSubmit16_invoker = createInvoker(
    HomeController_1.addCustomerSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addCustomerSubmit",
      Nil,
      "POST",
      this.prefix + """addCustomerSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_LoginController_registerUser17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUser")))
  )
  private[this] lazy val controllers_LoginController_registerUser17_invoker = createInvoker(
    LoginController_5.registerUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "registerUser",
      Nil,
      "GET",
      this.prefix + """registerUser""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_LoginController_registerUserSubmit18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("registerUserSubmit")))
  )
  private[this] lazy val controllers_LoginController_registerUserSubmit18_invoker = createInvoker(
    LoginController_5.registerUserSubmit(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "registerUserSubmit",
      Nil,
      "POST",
      this.prefix + """registerUserSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_LoginController_login19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login19_invoker = createInvoker(
    LoginController_5.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:40
  private[this] lazy val controllers_LoginController_loginSubmit20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit20_invoker = createInvoker(
    LoginController_5.loginSubmit,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "GET",
      this.prefix + """loginSubmit""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_LoginController_logout21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout21_invoker = createInvoker(
    LoginController_5.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_CountController_count22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count22_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_AsyncController_message23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message23_invoker = createInvoker(
    AsyncController_2.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Assets_versioned24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned24_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:53
  private[this] lazy val controllers_ShoppingCtrl_showBasket25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_showBasket25_invoker = createInvoker(
    ShoppingCtrl_3.showBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "showBasket",
      Nil,
      "GET",
      this.prefix + """showBasket""",
      """ Shopping""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_ShoppingCtrl_addToBasket26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addToBasket/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addToBasket26_invoker = createInvoker(
    ShoppingCtrl_3.addToBasket(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addToBasket",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addToBasket/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:55
  private[this] lazy val controllers_ShoppingCtrl_addOne27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_addOne27_invoker = createInvoker(
    ShoppingCtrl_3.addOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "addOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """addOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_ShoppingCtrl_removeOne28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removeOne/"), DynamicPart("itemId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_removeOne28_invoker = createInvoker(
    ShoppingCtrl_3.removeOne(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "removeOne",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """removeOne/""" + "$" + """itemId<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:57
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("emptyBasket")))
  )
  private[this] lazy val controllers_ShoppingCtrl_emptyBasket29_invoker = createInvoker(
    ShoppingCtrl_3.emptyBasket(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "emptyBasket",
      Nil,
      "GET",
      this.prefix + """emptyBasket""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_ShoppingCtrl_placeOrder30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("placeOrder")))
  )
  private[this] lazy val controllers_ShoppingCtrl_placeOrder30_invoker = createInvoker(
    ShoppingCtrl_3.placeOrder(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "placeOrder",
      Nil,
      "GET",
      this.prefix + """placeOrder""",
      """""",
      Seq()
    )
  )

  // @LINE:59
  private[this] lazy val controllers_ShoppingCtrl_viewOrder31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("viewOrder/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ShoppingCtrl_viewOrder31_invoker = createInvoker(
    ShoppingCtrl_3.viewOrder(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ShoppingCtrl",
      "viewOrder",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """viewOrder/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_HomeController_onsale1_route(params@_) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_onsale1_invoker.call(HomeController_1.onsale(cat))
      }
  
    // @LINE:9
    case controllers_HomeController_about2_route(params@_) =>
      call { 
        controllers_HomeController_about2_invoker.call(HomeController_1.about)
      }
  
    // @LINE:12
    case controllers_HomeController_addItem3_route(params@_) =>
      call { 
        controllers_HomeController_addItem3_invoker.call(HomeController_1.addItem)
      }
  
    // @LINE:13
    case controllers_HomeController_updateItem4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateItem4_invoker.call(HomeController_1.updateItem(id))
      }
  
    // @LINE:14
    case controllers_HomeController_deleteItem5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteItem5_invoker.call(HomeController_1.deleteItem(id))
      }
  
    // @LINE:16
    case controllers_HomeController_addItemSubmit6_route(params@_) =>
      call { 
        controllers_HomeController_addItemSubmit6_invoker.call(HomeController_1.addItemSubmit)
      }
  
    // @LINE:18
    case controllers_HomeController_deleteCustomer7_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteCustomer7_invoker.call(HomeController_1.deleteCustomer(id))
      }
  
    // @LINE:19
    case controllers_HomeController_deleteAdmin8_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_deleteAdmin8_invoker.call(HomeController_1.deleteAdmin(id))
      }
  
    // @LINE:21
    case controllers_HomeController_updateCustomer9_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateCustomer9_invoker.call(HomeController_1.updateCustomer(id))
      }
  
    // @LINE:22
    case controllers_HomeController_updateAdmin10_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_HomeController_updateAdmin10_invoker.call(HomeController_1.updateAdmin(id))
      }
  
    // @LINE:24
    case controllers_HomeController_usersAdmin11_route(params@_) =>
      call { 
        controllers_HomeController_usersAdmin11_invoker.call(HomeController_1.usersAdmin)
      }
  
    // @LINE:25
    case controllers_HomeController_usersCustomer12_route(params@_) =>
      call { 
        controllers_HomeController_usersCustomer12_invoker.call(HomeController_1.usersCustomer)
      }
  
    // @LINE:28
    case controllers_HomeController_addAdmin13_route(params@_) =>
      call { 
        controllers_HomeController_addAdmin13_invoker.call(HomeController_1.addAdmin)
      }
  
    // @LINE:29
    case controllers_HomeController_addAdminSubmit14_route(params@_) =>
      call { 
        controllers_HomeController_addAdminSubmit14_invoker.call(HomeController_1.addAdminSubmit)
      }
  
    // @LINE:31
    case controllers_HomeController_addCustomer15_route(params@_) =>
      call { 
        controllers_HomeController_addCustomer15_invoker.call(HomeController_1.addCustomer)
      }
  
    // @LINE:32
    case controllers_HomeController_addCustomerSubmit16_route(params@_) =>
      call { 
        controllers_HomeController_addCustomerSubmit16_invoker.call(HomeController_1.addCustomerSubmit)
      }
  
    // @LINE:34
    case controllers_LoginController_registerUser17_route(params@_) =>
      call { 
        controllers_LoginController_registerUser17_invoker.call(LoginController_5.registerUser)
      }
  
    // @LINE:35
    case controllers_LoginController_registerUserSubmit18_route(params@_) =>
      call { 
        controllers_LoginController_registerUserSubmit18_invoker.call(LoginController_5.registerUserSubmit())
      }
  
    // @LINE:39
    case controllers_LoginController_login19_route(params@_) =>
      call { 
        controllers_LoginController_login19_invoker.call(LoginController_5.login)
      }
  
    // @LINE:40
    case controllers_LoginController_loginSubmit20_route(params@_) =>
      call { 
        controllers_LoginController_loginSubmit20_invoker.call(LoginController_5.loginSubmit)
      }
  
    // @LINE:43
    case controllers_LoginController_logout21_route(params@_) =>
      call { 
        controllers_LoginController_logout21_invoker.call(LoginController_5.logout)
      }
  
    // @LINE:45
    case controllers_CountController_count22_route(params@_) =>
      call { 
        controllers_CountController_count22_invoker.call(CountController_0.count)
      }
  
    // @LINE:47
    case controllers_AsyncController_message23_route(params@_) =>
      call { 
        controllers_AsyncController_message23_invoker.call(AsyncController_2.message)
      }
  
    // @LINE:50
    case controllers_Assets_versioned24_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned24_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:53
    case controllers_ShoppingCtrl_showBasket25_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_showBasket25_invoker.call(ShoppingCtrl_3.showBasket())
      }
  
    // @LINE:54
    case controllers_ShoppingCtrl_addToBasket26_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_addToBasket26_invoker.call(ShoppingCtrl_3.addToBasket(id))
      }
  
    // @LINE:55
    case controllers_ShoppingCtrl_addOne27_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_addOne27_invoker.call(ShoppingCtrl_3.addOne(itemId))
      }
  
    // @LINE:56
    case controllers_ShoppingCtrl_removeOne28_route(params@_) =>
      call(params.fromPath[Long]("itemId", None)) { (itemId) =>
        controllers_ShoppingCtrl_removeOne28_invoker.call(ShoppingCtrl_3.removeOne(itemId))
      }
  
    // @LINE:57
    case controllers_ShoppingCtrl_emptyBasket29_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_emptyBasket29_invoker.call(ShoppingCtrl_3.emptyBasket())
      }
  
    // @LINE:58
    case controllers_ShoppingCtrl_placeOrder30_route(params@_) =>
      call { 
        controllers_ShoppingCtrl_placeOrder30_invoker.call(ShoppingCtrl_3.placeOrder())
      }
  
    // @LINE:59
    case controllers_ShoppingCtrl_viewOrder31_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ShoppingCtrl_viewOrder31_invoker.call(ShoppingCtrl_3.viewOrder(id))
      }
  }
}
