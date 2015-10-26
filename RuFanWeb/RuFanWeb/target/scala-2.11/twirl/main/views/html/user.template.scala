
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object user_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class user extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[is.rufan.user.domain.UserRegistration],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(accountForm: Form[is.rufan.user.domain.UserRegistration]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Modify Profile", nav = "userProfile")/*5.45*/ {_display_(Seq[Any](format.raw/*5.47*/("""
    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.UserController.postUserProfile())/*6.67*/ {_display_(Seq[Any](format.raw/*6.69*/("""
        """),format.raw/*7.9*/("""<fieldset>
            <legend>Account information</legend>
            """),_display_(/*9.14*/inputText(
                accountForm("name"),
                '_help -> "Change first name here.",
                '_error -> accountForm.globalError
            )),format.raw/*13.14*/("""
            """),_display_(/*14.14*/inputText(
                accountForm("email"),
                '_help -> "Change email here.",
                '_label -> "Email"
            )),format.raw/*18.14*/("""
            """),_display_(/*19.14*/inputPassword(
                accountForm("password"),
                '_label -> "Password",
                '_help -> "A password must be at least 6 characters. "
            )),format.raw/*23.14*/("""
            """),_display_(/*24.14*/inputPassword(
                accountForm("repeatPassword"),
                '_label -> "Repeat password",
                '_help -> "Please repeat your password.",
                '_error -> accountForm.globalError
            )),format.raw/*29.14*/("""
            """),_display_(/*30.14*/select(
                accountForm("favoriteTeam"),
                options(),
                '_help -> "Choose your favorite team.",
                '_label -> "Chooses Favorite Team"
            )),format.raw/*35.14*/("""
            """),_display_(/*36.14*/inputText(
                accountForm("cardType"),
                '_help -> "Change card type.",
                '_label -> "Card type"
            )),format.raw/*40.14*/("""
            """),_display_(/*41.14*/inputText(
                accountForm("cardNumber"),
                '_help -> "Change card number.",
                '_label -> "Card number"
            )),format.raw/*45.14*/("""
            """),_display_(/*46.14*/inputText(
                accountForm("cardExpirationDate"),
                '_help -> "Change card expiration date.",
                '_label -> "Card expiration date"
            )),format.raw/*50.14*/("""
        """),format.raw/*51.9*/("""</fieldset>
        <div class="actions">
            <input type="submit" class="btn btn-primary" value="Submit"/>
        </div>
    """)))}),format.raw/*55.6*/("""
    """),format.raw/*56.5*/("""<script src=""""),_display_(/*56.19*/routes/*56.25*/.Assets.versioned("javascripts/TeamList.js")),format.raw/*56.69*/(""""></script>
""")))}),format.raw/*57.2*/("""
"""))
      }
    }
  }

  def render(accountForm:Form[is.rufan.user.domain.UserRegistration]): play.twirl.api.HtmlFormat.Appendable = apply(accountForm)

  def f:((Form[is.rufan.user.domain.UserRegistration]) => play.twirl.api.HtmlFormat.Appendable) = (accountForm) => apply(accountForm)

  def ref: this.type = this

}


}

/**/
object user extends user_Scope0.user
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 19:16:12 GMT 2015
                  SOURCE: C:/Skilaverkefni4/RuFanWeb/RuFanWeb/app/views/user.scala.html
                  HASH: f9a68ba2dc5f3e32ada48c9b050ffcbaf07645cf
                  MATRIX: 780->1|948->59|978->81|1006->84|1057->127|1096->129|1128->136|1142->142|1205->197|1244->199|1280->209|1381->284|1571->453|1613->468|1783->617|1825->632|2029->815|2071->830|2327->1065|2369->1080|2595->1285|2637->1300|2813->1455|2855->1470|3037->1631|3079->1646|3287->1833|3324->1843|3494->1983|3527->1989|3568->2003|3583->2009|3648->2053|3692->2067
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|39->9|43->13|44->14|48->18|49->19|53->23|54->24|59->29|60->30|65->35|66->36|70->40|71->41|75->45|76->46|80->50|81->51|85->55|86->56|86->56|86->56|86->56|87->57
                  -- GENERATED --
              */
          