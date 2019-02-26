
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginForm: Form[models.users.Login],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/main("Login",user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<h3>Sign in</h3>
    <!-- Display login errors if there are any-->
    """),_display_(/*7.6*/if(loginForm.hasGlobalErrors)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
        """),format.raw/*8.9*/("""<p class="alert alert-warning">
            """),_display_(/*9.14*/for(e <- loginForm.globalErrors) yield /*9.46*/ {_display_(Seq[Any](format.raw/*9.48*/("""
                """),_display_(/*10.18*/e/*10.19*/.message),format.raw/*10.27*/("""<br/>
            """)))}),format.raw/*11.14*/("""
        """),format.raw/*12.9*/("""</p>
    """)))}),format.raw/*13.6*/("""
	"""),format.raw/*14.54*/("""
	"""),_display_(/*15.3*/if(flash.containsKey("error"))/*15.33*/ {_display_(Seq[Any](format.raw/*15.35*/("""
		"""),format.raw/*16.3*/("""<div class="alert alert-success">
			"""),_display_(/*17.5*/flash/*17.10*/.get("error")),format.raw/*17.23*/("""
		"""),format.raw/*18.3*/("""</div>
	""")))}),format.raw/*19.3*/("""
    """),format.raw/*20.5*/("""<!-- The login form-->
    """),_display_(/*21.6*/helper/*21.12*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.76*/ {_display_(Seq[Any](format.raw/*21.78*/("""
        """),format.raw/*22.37*/("""
        """),format.raw/*24.84*/("""
        """),_display_(/*25.10*/CSRF/*25.14*/.formField),format.raw/*25.24*/("""
        
        """),format.raw/*27.9*/("""<div class="form-group">
            """),_display_(/*28.14*/inputText(loginForm("email"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Email")),format.raw/*29.72*/("""
        """),format.raw/*30.9*/("""</div>
        <div class="form-group">
            """),_display_(/*32.14*/inputPassword(loginForm("password"), '_label -> "", 
            'class -> "form-control input-xs", 'placeholder -> "Password")),format.raw/*33.75*/("""
        
        """),format.raw/*35.9*/("""</div>
        <div class="form-group">
            <input type="submit" value="Sign In" class="btn btn-primary">
        </div>
    """)))}),format.raw/*39.6*/(""" """),format.raw/*39.24*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 11:22:18 GMT 2019
                  SOURCE: /home/wdd/SDev/SDev_labs/app/views/login.scala.html
                  HASH: 4d46936d6b4f7e1dd9151a954b21af3c3f58a7cc
                  MATRIX: 984->1|1118->64|1162->80|1189->82|1215->100|1254->102|1285->107|1382->179|1419->208|1458->210|1493->219|1564->264|1611->296|1650->298|1695->316|1705->317|1734->325|1784->344|1820->353|1860->363|1890->417|1919->420|1958->450|1998->452|2028->455|2092->493|2106->498|2140->511|2170->514|2209->523|2241->528|2295->556|2310->562|2383->626|2423->628|2460->665|2497->826|2534->836|2547->840|2578->850|2623->868|2688->906|2826->1023|2862->1032|2942->1085|3090->1212|3135->1230|3299->1364|3328->1382
                  LINES: 28->1|31->2|34->3|35->4|35->4|35->4|36->5|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|43->12|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|51->20|52->21|52->21|52->21|52->21|53->22|54->24|55->25|55->25|55->25|57->27|58->28|59->29|60->30|62->32|63->33|65->35|69->39|69->39
                  -- GENERATED --
              */
          