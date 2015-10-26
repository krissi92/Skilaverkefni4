
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String = "Welcome", nav: String = "")(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.62*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
  <head>
    <title>RuFan</title>
    <link rel="stylesheet" media="screen" href=""""),_display_(/*8.50*/routes/*8.56*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*8.102*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.55*/routes/*9.61*/.Assets.versioned("images/favicon.png")),format.raw/*9.100*/("""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
  </head>

  <body>

    <nav class="navbar navbar-default">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href=""""),_display_(/*18.42*/routes/*18.48*/.Application.index()),format.raw/*18.68*/("""">RuFan</a>
        </div>
        <div>
          <ul class="nav navbar-nav">
          """),_display_(/*22.12*/if(session.get("username"))/*22.39*/ {_display_(Seq[Any](format.raw/*22.41*/("""
            """),format.raw/*23.13*/("""<li>
              <a href="TODO">Tournaments</a>
            </li>
            <li>
              <a href=""""),_display_(/*27.25*/routes/*27.31*/.UserController.getUserProfile()),format.raw/*27.63*/("""">Profile</a>
            </li>
            <li>
              <a href="TODO">Wallet</a>
            </li>
            <li>
              <a href=""""),_display_(/*33.25*/routes/*33.31*/.LoginController.logout()),format.raw/*33.56*/("""">Logout</a>
            </li>
          """)))}/*35.13*/else/*35.18*/{_display_(Seq[Any](format.raw/*35.19*/("""
            """),format.raw/*36.13*/("""<li class=""""),_display_(/*36.25*/("active".when(nav == "signup"))),format.raw/*36.57*/("""">
              <a href=""""),_display_(/*37.25*/routes/*37.31*/.SignupController.blank()),format.raw/*37.56*/("""">Sign up</a>
            </li>
            <li class=""""),_display_(/*39.25*/("active".when(nav == "login"))),format.raw/*39.56*/("""">
              <a href=""""),_display_(/*40.25*/routes/*40.31*/.LoginController.blank()),format.raw/*40.55*/("""">Login</a>
            </li>
          """)))}),format.raw/*42.12*/("""
          """),format.raw/*43.11*/("""</ul>
        </div>
      </div>
    </nav>


    <div class="container">

      <div class="content">

        <div class="page-header">
          <h1>"""),_display_(/*54.16*/title),format.raw/*54.21*/("""</h1>
        </div>

        <div class="row">
          <div class="span14">
          """),_display_(/*59.12*/content),format.raw/*59.19*/("""
          """),format.raw/*60.11*/("""</div>
        </div>

      </div>

      <footer>
        <p></p>
        <p>
          RuFan Best Daily Fantasy Sport Service in the world
        </p>
      </footer>

    </div>

  </body>
</html>
"""))
      }
    }
  }

  def render(title:String,nav:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,nav)(content)

  def f:((String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,nav) => (content) => apply(title,nav)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 19:16:12 GMT 2015
                  SOURCE: C:/Skilaverkefni4/RuFanWeb/RuFanWeb/app/views/main.scala.html
                  HASH: 10b7c3cb7817f9dcc8deb2d1c42e175e10f285bd
                  MATRIX: 755->1|910->61|940->65|1078->177|1092->183|1159->229|1243->287|1257->293|1317->332|1623->611|1638->617|1679->637|1800->731|1836->758|1876->760|1918->774|2058->887|2073->893|2126->925|2307->1079|2322->1085|2368->1110|2431->1155|2444->1160|2483->1161|2525->1175|2564->1187|2617->1219|2672->1247|2687->1253|2733->1278|2818->1336|2870->1367|2925->1395|2940->1401|2985->1425|3059->1468|3099->1480|3291->1645|3317->1650|3439->1745|3467->1752|3507->1764
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|40->9|40->9|40->9|49->18|49->18|49->18|53->22|53->22|53->22|54->23|58->27|58->27|58->27|64->33|64->33|64->33|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|70->39|70->39|71->40|71->40|71->40|73->42|74->43|85->54|85->54|90->59|90->59|91->60
                  -- GENERATED --
              */
          