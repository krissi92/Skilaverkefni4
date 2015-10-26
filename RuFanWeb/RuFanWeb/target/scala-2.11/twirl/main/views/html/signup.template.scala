
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signup_Scope0 {
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

class signup extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[is.rufan.user.domain.UserRegistration],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signupForm: Form[is.rufan.user.domain.UserRegistration]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.59*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Signup", nav = "signup")/*5.32*/ {_display_(Seq[Any](format.raw/*5.34*/("""
    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.SignupController.signup)/*6.58*/ {_display_(Seq[Any](format.raw/*6.60*/("""
        """),format.raw/*7.9*/("""<fieldset>
            <legend>Account information</legend>
            """),_display_(/*9.14*/inputText(
                signupForm("username"),
                '_label -> "Username",
                '_help -> "Please enter your username.",
                '_error -> signupForm.globalError
            )),format.raw/*14.14*/("""
            """),_display_(/*15.14*/inputText(
                signupForm("name"),
                '_label -> "Name",
                '_help -> "Please provide your first name.",
                '_error -> signupForm.globalError
            )),format.raw/*20.14*/("""
            """),_display_(/*21.14*/inputText(
                signupForm("email"),
                '_label -> "Email",
                '_help -> "Enter a valid email address."
            )),format.raw/*25.14*/("""
            """),_display_(/*26.14*/inputPassword(
                signupForm("password"),
                '_label -> "Password",
                '_help -> "A password must be at least 6 characters. "
            )),format.raw/*30.14*/("""
            """),_display_(/*31.14*/inputPassword(
                signupForm("repeatPassword"),
                '_label -> "Repeat password",
                '_help -> "Please repeat your password.",
                '_error -> signupForm.globalError
            )),format.raw/*36.14*/("""
        """),format.raw/*37.9*/("""</fieldset>
        <fieldset>
        """),_display_(/*39.10*/checkbox(
            signupForm("accept"),
            '_label -> None, '_text -> "You agree to the Terms and conditions",
            '_showConstraints -> false
        )),format.raw/*43.10*/("""
        """),format.raw/*44.9*/("""</fieldset>

        <div class="actions">
            <input type="submit" class="btn btn-primary" value="Sign Up">
            <a href=""""),_display_(/*48.23*/routes/*48.29*/.Application.index),format.raw/*48.47*/("""" class="btn">Cancel</a>
        </div>
    """)))}),format.raw/*50.6*/("""
""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(signupForm:Form[is.rufan.user.domain.UserRegistration]): play.twirl.api.HtmlFormat.Appendable = apply(signupForm)

  def f:((Form[is.rufan.user.domain.UserRegistration]) => play.twirl.api.HtmlFormat.Appendable) = (signupForm) => apply(signupForm)

  def ref: this.type = this

}


}

/**/
object signup extends signup_Scope0.signup
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 19:16:12 GMT 2015
                  SOURCE: C:/Skilaverkefni4/RuFanWeb/RuFanWeb/app/views/signup.scala.html
                  HASH: 60f93a29e69c821e96d634c13c9cafcee830f7c4
                  MATRIX: 784->1|951->58|981->80|1009->83|1047->113|1086->115|1118->122|1132->128|1186->174|1225->176|1261->186|1362->261|1598->476|1640->491|1872->702|1914->717|2093->875|2135->890|2338->1072|2380->1087|2634->1320|2671->1330|2740->1372|2937->1548|2974->1558|3144->1701|3159->1707|3198->1725|3275->1772|3308->1775
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|39->9|44->14|45->15|50->20|51->21|55->25|56->26|60->30|61->31|66->36|67->37|69->39|73->43|74->44|78->48|78->48|78->48|80->50|81->51
                  -- GENERATED --
              */
          