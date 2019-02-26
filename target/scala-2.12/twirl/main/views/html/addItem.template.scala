
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

object addItem extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.ItemOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(itemForm: Form[models.products.ItemOnSale],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Item",user)/*6.23*/{_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new item</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addItemSubmit(), 'class -> "form-horizontal", 'role -> "form",
          'method -> "POST" , 'enctype -> "multipart/form-data")/*13.65*/ {_display_(Seq[Any](format.raw/*13.67*/("""
        """),format.raw/*14.37*/("""
        """),format.raw/*15.99*/("""
        """),_display_(/*16.10*/CSRF/*16.14*/.formField),format.raw/*16.24*/("""

        """),format.raw/*18.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the itemForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*22.24*/select),format.raw/*22.30*/(""" """),format.raw/*22.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->
            """),_display_(/*25.14*/inputText(itemForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.86*/("""
            """),format.raw/*26.13*/("""<p><strong>Categories</strong></p>
            """),_display_(/*27.14*/for((value, name) <- products.Category.options) yield /*27.61*/ {_display_(Seq[Any](format.raw/*27.63*/("""
                """),format.raw/*28.17*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*28.67*/value),format.raw/*28.72*/(""""  
                    """),_display_(/*29.22*/if(itemForm("id").getValue.isPresent && itemForm("id").getValue.get != "")/*29.96*/ {_display_(Seq[Any](format.raw/*29.98*/(""" 
                        """),_display_(/*30.26*/if(products.Category.inCategory(value.toLong, itemForm("id").getValue.get.toLong))/*30.108*/ {_display_(Seq[Any](format.raw/*30.110*/("""
                            """),format.raw/*31.29*/("""checked
                        """)))}),format.raw/*32.26*/("""
                    """)))}),format.raw/*33.22*/(""" 
                """),format.raw/*34.17*/("""/> """),_display_(/*34.21*/name),format.raw/*34.25*/(""" """),format.raw/*34.26*/("""</br>
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""</p>
            
            """),_display_(/*38.14*/inputText(itemForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*38.100*/("""
            """),_display_(/*39.14*/inputText(itemForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*39.88*/("""
            """),_display_(/*40.14*/inputText(itemForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*40.88*/("""

            """),format.raw/*42.13*/("""<label>Image Upload</label>
            <input class="btn-sm btn-default" type="file" name="upload">

            """),_display_(/*45.14*/inputText(itemForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*45.75*/("""
            
            """),format.raw/*47.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update item" class="btn btn-primary">
                <a href=""""),_display_(/*53.27*/routes/*53.33*/.HomeController.onsale(0)),format.raw/*53.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*57.6*/(""" """),format.raw/*57.24*/("""
""")))}),format.raw/*58.2*/(""" """))
      }
    }
  }

  def render(itemForm:Form[models.products.ItemOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(itemForm,user)

  def f:((Form[models.products.ItemOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (itemForm,user) => apply(itemForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Feb 26 11:33:30 GMT 2019
                  SOURCE: /home/wdd/SDev/SDev_labs/app/views/addItem.scala.html
                  HASH: 4fc4bde9023b8f41bad345ac4b7f813d96dfd2e2
                  MATRIX: 994->1|1135->73|1179->70|1207->89|1234->91|1263->112|1301->113|1332->118|1651->411|1821->572|1861->574|1898->611|1935->710|1972->720|1985->724|2016->734|2053->744|2427->1091|2454->1097|2483->1098|2735->1323|2828->1395|2869->1408|2944->1456|3007->1503|3047->1505|3092->1522|3169->1572|3195->1577|3247->1602|3330->1676|3370->1678|3424->1705|3516->1787|3557->1789|3614->1818|3678->1851|3731->1873|3777->1891|3808->1895|3833->1899|3862->1900|3912->1919|3953->1932|4011->1963|4119->2049|4160->2063|4255->2137|4296->2151|4391->2225|4433->2239|4575->2354|4657->2415|4711->2441|5103->2806|5118->2812|5164->2837|5324->2967|5353->2985|5385->2987
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|44->13|44->13|45->14|46->15|47->16|47->16|47->16|49->18|53->22|53->22|53->22|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|64->33|65->34|65->34|65->34|65->34|66->35|67->36|69->38|69->38|70->39|70->39|71->40|71->40|73->42|76->45|76->45|78->47|84->53|84->53|84->53|88->57|88->57|89->58
                  -- GENERATED --
              */
          