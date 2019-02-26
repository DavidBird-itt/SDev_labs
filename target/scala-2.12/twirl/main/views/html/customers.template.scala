
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

object customers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Customers",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<h1>Current customers</h1>


    """),format.raw/*6.71*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current customers on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Role </th>
            <th>Name</th>
            <th>Date Of Birth</th>
            <th>Password</th>
            <th>Street 1</th>
            <th>Street 2</th>
            <th>Town</th>
            <th>Postcode</th>
            <th>Credit Card</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*34.62*/("""
            """),_display_(/*35.14*/for(c<-customers) yield /*35.31*/ {_display_(Seq[Any](format.raw/*35.33*/("""
               """),format.raw/*36.16*/("""<tr>
                  <td>"""),_display_(/*37.24*/c/*37.25*/.getEmail),format.raw/*37.34*/("""</td>
                  <td>"""),_display_(/*38.24*/c/*38.25*/.getRole),format.raw/*38.33*/("""</td>
                  <td>"""),_display_(/*39.24*/c/*39.25*/.getName),format.raw/*39.33*/("""</td>
                  <td>"""),_display_(/*40.24*/c/*40.25*/.getDateOfBirthString),format.raw/*40.46*/("""</td>
                  <td>"""),_display_(/*41.24*/c/*41.25*/.getPassword),format.raw/*41.37*/("""</td>
                  <td>"""),_display_(/*42.24*/c/*42.25*/.getStreet1),format.raw/*42.36*/("""</td>
                  <td>"""),_display_(/*43.24*/c/*43.25*/.getStreet2),format.raw/*43.36*/("""</td>
                  <td>"""),_display_(/*44.24*/c/*44.25*/.getTown),format.raw/*44.33*/("""</td>
                  <td>"""),_display_(/*45.24*/c/*45.25*/.getPostCode),format.raw/*45.37*/("""</td>
                  <td>"""),_display_(/*46.24*/c/*46.25*/.getCreditCard),format.raw/*46.39*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*49.18*/routes/*49.24*/.HomeController.updateCustomer(c.getEmail)),format.raw/*49.66*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*55.18*/routes/*55.24*/.HomeController.deleteCustomer(c.getEmail)),format.raw/*55.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*60.14*/("""
        
        """),format.raw/*62.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*66.19*/routes/*66.25*/.HomeController.addCustomer()),format.raw/*66.54*/("""">
            <button class="btn btn-primary">Add a new Customer</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(customers:List[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customers,user)

  def f:((List[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customers,user) => apply(customers,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 11:22:18 GMT 2019
                  SOURCE: /home/wdd/SDev/SDev_labs/app/views/customers.scala.html
                  HASH: 250da37e40f8d5377209bf5c2c1db9c4583aee21
                  MATRIX: 991->1|1149->67|1179->89|1217->90|1248->95|1308->194|1336->197|1376->229|1415->231|1444->234|1507->272|1520->277|1555->292|1585->295|1623->303|1656->309|2304->978|2345->992|2378->1009|2418->1011|2462->1027|2517->1055|2527->1056|2557->1065|2613->1094|2623->1095|2652->1103|2708->1132|2718->1133|2747->1141|2803->1170|2813->1171|2855->1192|2911->1221|2921->1222|2954->1234|3010->1263|3020->1264|3052->1275|3108->1304|3118->1305|3150->1316|3206->1345|3216->1346|3245->1354|3301->1383|3311->1384|3344->1396|3400->1425|3410->1426|3445->1440|3547->1515|3562->1521|3625->1563|3852->1763|3867->1769|3930->1811|4156->2006|4201->2024|4277->2073|4292->2079|4342->2108
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|80->49|80->49|80->49|86->55|86->55|86->55|91->60|93->62|97->66|97->66|97->66
                  -- GENERATED --
              */
          