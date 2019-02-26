
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

object addAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Administrator],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Administrator],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.User
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Admin",user)/*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new administrator</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")/*12.103*/ {_display_(Seq[Any](format.raw/*12.105*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

            """),_display_(/*17.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.88*/("""
            """),_display_(/*18.14*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.86*/("""
            """),_display_(/*19.14*/inputDate(userForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*19.122*/("""
            """),_display_(/*20.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*20.94*/("""
            """),_display_(/*21.14*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "",'hidden -> "hidden")),format.raw/*21.102*/("""
            """),_display_(/*22.14*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*22.78*/("""
            
            """),format.raw/*24.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update Admin" class="btn btn-primary">
                <a href=""""),_display_(/*30.27*/routes/*30.33*/.HomeController.usersAdmin()),format.raw/*30.61*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*34.6*/(""" """),format.raw/*34.24*/("""
""")))}),format.raw/*35.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Administrator],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Administrator],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 11:22:19 GMT 2019
                  SOURCE: /home/wdd/SDev/SDev_labs/app/views/addAdmin.scala.html
                  HASH: 45de965c8c3d738eba66744dfbbd5b24f1bc4ccc
                  MATRIX: 995->1|1136->72|1168->98|1212->70|1239->114|1266->116|1296->138|1334->139|1365->144|1693->446|1800->543|1841->545|1878->582|1915->681|1952->691|1965->695|1996->705|2038->720|2133->794|2174->808|2267->880|2308->894|2438->1002|2479->1016|2580->1096|2621->1110|2731->1198|2772->1212|2857->1276|2911->1302|3304->1668|3319->1674|3368->1702|3528->1832|3557->1850|3589->1852
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|55->24|61->30|61->30|61->30|65->34|65->34|66->35
                  -- GENERATED --
              */
          