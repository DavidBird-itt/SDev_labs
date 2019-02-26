
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,models.users.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(pagename:String,user: models.users.User)(content:Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html>
<html>
    <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta charset="UTF-8"/>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<style>
	    .footer """),format.raw/*9.14*/("""{"""),format.raw/*9.15*/(""" """),format.raw/*9.16*/("""font-weight: bold; color: white; background-color: black; """),format.raw/*9.74*/("""}"""),format.raw/*9.75*/("""
	    """),format.raw/*10.6*/(""".sidecol """),format.raw/*10.15*/("""{"""),format.raw/*10.16*/(""" """),format.raw/*10.17*/("""font-weight: bold; background-color: steelblue; """),format.raw/*10.65*/("""}"""),format.raw/*10.66*/("""
	    """),format.raw/*11.6*/(""".sidecol h2 """),format.raw/*11.18*/("""{"""),format.raw/*11.19*/(""" """),format.raw/*11.20*/("""font-weight: bold; """),format.raw/*11.39*/("""}"""),format.raw/*11.40*/("""
	    """),format.raw/*12.6*/(""".midcol h1 """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/(""" """),format.raw/*12.19*/("""text-align: center; font-weight: bold; """),format.raw/*12.58*/("""}"""),format.raw/*12.59*/("""
	    """),format.raw/*13.6*/(""".midcol h3 """),format.raw/*13.17*/("""{"""),format.raw/*13.18*/(""" """),format.raw/*13.19*/("""text-align: center; color: steelblue; """),format.raw/*13.57*/("""}"""),format.raw/*13.58*/("""
	    """),format.raw/*14.6*/(""".redtext """),format.raw/*14.15*/("""{"""),format.raw/*14.16*/(""" """),format.raw/*14.17*/("""color: red; """),format.raw/*14.29*/("""}"""),format.raw/*14.30*/("""
	"""),format.raw/*15.2*/("""</style>
	<title>OFM """),_display_(/*16.14*/pagename),format.raw/*16.22*/("""</title>
    </head>
    <body>
	<nav class="navbar navbar-inverse">
	    <div class="container-fluid">
		<div class="navbar-header">
		    <a class="navbar-brand" href="#">WebSiteName</a>
		</div>
		<ul class="nav navbar-nav">
            <li """),_display_(/*25.18*/if(pagename == "Home")/*25.40*/ {_display_(Seq[Any](format.raw/*25.42*/("""class="active"""")))}),format.raw/*25.57*/("""><a href=""""),_display_(/*25.68*/routes/*25.74*/.HomeController.index()),format.raw/*25.97*/("""">Home</a></li>
		    <li """),_display_(/*26.12*/if(pagename == "On Sale")/*26.37*/ {_display_(Seq[Any](format.raw/*26.39*/("""class="active"""")))}),format.raw/*26.54*/("""><a href=""""),_display_(/*26.65*/routes/*26.71*/.HomeController.onsale()),format.raw/*26.95*/("""">On Sale</a></li>
			<li """),_display_(/*27.9*/if(pagename == "About")/*27.32*/ {_display_(Seq[Any](format.raw/*27.34*/("""class="active"""")))}),format.raw/*27.49*/("""><a href=""""),_display_(/*27.60*/routes/*27.66*/.HomeController.about()),format.raw/*27.89*/("""">About us</a></li>
			<li """),_display_(/*28.9*/if(pagename == "Register")/*28.35*/ {_display_(Seq[Any](format.raw/*28.37*/("""class="active"""")))}),format.raw/*28.52*/("""><a href=""""),_display_(/*28.63*/routes/*28.69*/.LoginController.registerUser()),format.raw/*28.100*/("""">Register user</a></li>
			"""),_display_(/*29.5*/if((user != null) && ("admin".equals(user.getRole())))/*29.59*/ {_display_(Seq[Any](format.raw/*29.61*/("""
				"""),format.raw/*30.5*/("""<li """),_display_(/*30.10*/if(pagename == "Administrators")/*30.42*/ {_display_(Seq[Any](format.raw/*30.44*/("""class="active"""")))}),format.raw/*30.59*/("""><a href=""""),_display_(/*30.70*/routes/*30.76*/.HomeController.usersAdmin()),format.raw/*30.104*/("""">View Admin</a></li>
				<li """),_display_(/*31.10*/if(pagename == "Customers")/*31.37*/ {_display_(Seq[Any](format.raw/*31.39*/("""class="active"""")))}),format.raw/*31.54*/("""><a href=""""),_display_(/*31.65*/routes/*31.71*/.HomeController.usersCustomer()),format.raw/*31.102*/("""">View Customers</a></li>

			""")))}),format.raw/*33.5*/("""
			
			
			"""),format.raw/*36.4*/("""<li """),_display_(/*36.9*/if(pagename == "Log In")/*36.33*/ {_display_(Seq[Any](format.raw/*36.35*/("""class="active"""")))}),format.raw/*36.50*/(""">
				"""),_display_(/*37.6*/if(user != null)/*37.22*/ {_display_(Seq[Any](format.raw/*37.24*/("""
					"""),format.raw/*38.6*/("""<a href=""""),_display_(/*38.16*/routes/*38.22*/.LoginController.logout()),format.raw/*38.47*/("""">Log Out</a>
				""")))}/*39.7*/else/*39.12*/{_display_(Seq[Any](format.raw/*39.13*/("""
					"""),format.raw/*40.6*/("""<a href=""""),_display_(/*40.16*/routes/*40.22*/.LoginController.login()),format.raw/*40.46*/("""">Log In</a>
			</li>
""")))}),format.raw/*42.2*/(""" 
		"""),format.raw/*43.3*/("""</ul>
	    </div>
	</nav>

	<div class="container-fluid">
	    <div class="row">
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>News</h2>
			<h3>New product sub-category</h3>
			<p>Following the sudden and unprecedented volumes of trade in fashion paper bags, our <span class="redtext">bags</span> category has been extended to include a seventh subcategory, <span class="redtext">paper handbags</span>.
		    </div>
		</div>
		<div class="col-sm-8">
		    <div class="midcol">
			"""),_display_(/*58.5*/content),format.raw/*58.12*/("""
		    """),format.raw/*59.7*/("""</div>
		</div>
		<div class="col-sm-2">
		    <div class="well sidecol">
			<h2>Events</h2>
			<h3>The 153rd Meet for Real event</h3>
			<p>The popular <span class="redtext">Meet for Real</span> event takes place this Sunday at the Square Park, from 7am until 1pm. It will yet again give flea-market enthusiasts a chance to engage in a bit of live bartering and banter with their fellow sitesters.</p>
		    </div>
		</div>
	    </div>
	    <div class="row">
		<div class="col-sm-12">
		    <div class="well footer">
			Website created by ABC Sights
		    </div>
		</div>
	    </div>
	</div>
	<script src =""""),_display_(/*77.17*/routes/*77.23*/.Assets.versioned("javascripts/main.js")),format.raw/*77.63*/(""""></script>
    </body>
</html>

"""))
      }
    }
  }

  def render(pagename:String,user:models.users.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(pagename,user)(content)

  def f:((String,models.users.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (pagename,user) => (content) => apply(pagename,user)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 11:22:18 GMT 2019
                  SOURCE: /home/wdd/SDev/SDev_labs/app/views/main.scala.html
                  HASH: bdeae504df340a875704a85ea4a3f9bd23ccc88c
                  MATRIX: 970->1|1119->57|1401->312|1429->313|1457->314|1542->372|1570->373|1603->379|1640->388|1669->389|1698->390|1774->438|1803->439|1836->445|1876->457|1905->458|1934->459|1981->478|2010->479|2043->485|2082->496|2111->497|2140->498|2207->537|2236->538|2269->544|2308->555|2337->556|2366->557|2432->595|2461->596|2494->602|2531->611|2560->612|2589->613|2629->625|2658->626|2687->628|2736->650|2765->658|3037->903|3068->925|3108->927|3154->942|3192->953|3207->959|3251->982|3305->1009|3339->1034|3379->1036|3425->1051|3463->1062|3478->1068|3523->1092|3576->1119|3608->1142|3648->1144|3694->1159|3732->1170|3747->1176|3791->1199|3845->1227|3880->1253|3920->1255|3966->1270|4004->1281|4019->1287|4072->1318|4127->1347|4190->1401|4230->1403|4262->1408|4294->1413|4335->1445|4375->1447|4421->1462|4459->1473|4474->1479|4524->1507|4582->1538|4618->1565|4658->1567|4704->1582|4742->1593|4757->1599|4810->1630|4871->1661|4910->1673|4941->1678|4974->1702|5014->1704|5060->1719|5093->1726|5118->1742|5158->1744|5191->1750|5228->1760|5243->1766|5289->1791|5326->1811|5339->1816|5378->1817|5411->1823|5448->1833|5463->1839|5508->1863|5561->1886|5592->1890|6118->2390|6146->2397|6180->2404|6816->3013|6831->3019|6892->3059
                  LINES: 28->1|33->2|40->9|40->9|40->9|40->9|40->9|41->10|41->10|41->10|41->10|41->10|41->10|42->11|42->11|42->11|42->11|42->11|42->11|43->12|43->12|43->12|43->12|43->12|43->12|44->13|44->13|44->13|44->13|44->13|44->13|45->14|45->14|45->14|45->14|45->14|45->14|46->15|47->16|47->16|56->25|56->25|56->25|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|57->26|57->26|57->26|58->27|58->27|58->27|58->27|58->27|58->27|58->27|59->28|59->28|59->28|59->28|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|61->30|61->30|61->30|61->30|61->30|62->31|62->31|62->31|62->31|62->31|62->31|62->31|64->33|67->36|67->36|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|73->42|74->43|89->58|89->58|90->59|108->77|108->77|108->77
                  -- GENERATED --
              */
          