
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object summary_Scope0 {
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

class summary extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[is.rufan.user.domain.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: is.rufan.user.domain.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Account created!", nav = "signup")/*3.42*/ {_display_(Seq[Any](format.raw/*3.44*/("""

    """),format.raw/*5.5*/("""<h2>Your account:</h2>
    <p>Name: """),_display_(/*6.15*/user/*6.19*/.getUsername()),format.raw/*6.33*/("""</p>

""")))}))
      }
    }
  }

  def render(user:is.rufan.user.domain.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((is.rufan.user.domain.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object summary extends summary_Scope0.summary
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 19:16:12 GMT 2015
                  SOURCE: C:/Skilaverkefni4/RuFanWeb/RuFanWeb/app/views/summary.scala.html
                  HASH: 261665fff5f98f960d0623a2edc649e615128cb2
                  MATRIX: 768->1|896->34|926->39|974->79|1013->81|1047->89|1111->127|1123->131|1157->145
                  LINES: 27->1|32->1|34->3|34->3|34->3|36->5|37->6|37->6|37->6
                  -- GENERATED --
              */
          