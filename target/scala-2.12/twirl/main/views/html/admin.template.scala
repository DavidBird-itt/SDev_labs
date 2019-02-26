
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Administrator],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Administrator],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Administrators",user)/*2.29*/{_display_(Seq[Any](format.raw/*2.30*/("""
    """),format.raw/*3.5*/("""<h1>Current administrators</h1>


    """),format.raw/*6.71*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current administrators on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Role</th>
            <th>Name</th>
            <th>Date Of Birth</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*29.62*/("""
            """),_display_(/*30.14*/for(u<-users) yield /*30.27*/ {_display_(Seq[Any](format.raw/*30.29*/("""
               """),format.raw/*31.16*/("""<tr>
                  <td>"""),_display_(/*32.24*/u/*32.25*/.getEmail),format.raw/*32.34*/("""</td>
                  <td>"""),_display_(/*33.24*/u/*33.25*/.getRole),format.raw/*33.33*/("""</td>
                  <td>"""),_display_(/*34.24*/u/*34.25*/.getName),format.raw/*34.33*/("""</td>
                  <td>"""),_display_(/*35.24*/u/*35.25*/.getDateOfBirthString),format.raw/*35.46*/("""</td>
                  <td>"""),_display_(/*36.24*/u/*36.25*/.getPassword),format.raw/*36.37*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*39.18*/routes/*39.24*/.HomeController.updateAdmin(u.getEmail)),format.raw/*39.63*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*45.18*/routes/*45.24*/.HomeController.deleteAdmin(u.getEmail)),format.raw/*45.63*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*50.14*/("""
        
        """),format.raw/*52.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*56.19*/routes/*56.25*/.HomeController.addAdmin()),format.raw/*56.51*/("""">
            <button class="btn btn-primary">Add a new Administrator</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(users:List[models.users.Administrator],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.Administrator],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 11:22:18 GMT 2019
                  SOURCE: /home/wdd/SDev/SDev_labs/app/views/admin.scala.html
                  HASH: 4be8911e6d7fb15c070b3d11c3aaab018a8bc28e
                  MATRIX: 992->1|1151->68|1186->95|1224->96|1255->101|1320->205|1348->208|1388->240|1427->242|1456->245|1519->283|1532->288|1567->303|1597->306|1635->314|1668->320|2171->844|2212->858|2241->871|2281->873|2325->889|2380->917|2390->918|2420->927|2476->956|2486->957|2515->965|2571->994|2581->995|2610->1003|2666->1032|2676->1033|2718->1054|2774->1083|2784->1084|2817->1096|2919->1171|2934->1177|2994->1216|3221->1416|3236->1422|3296->1461|3522->1656|3567->1674|3643->1723|3658->1729|3705->1755
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|60->29|61->30|61->30|61->30|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|70->39|70->39|70->39|76->45|76->45|76->45|81->50|83->52|87->56|87->56|87->56
                  -- GENERATED --
              */
          