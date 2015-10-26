
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String = "Welcome!"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current

Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main(title)/*5.13*/ {_display_(Seq[Any](format.raw/*5.15*/("""

    """),format.raw/*7.5*/("""<h2>Welcome to RuFan</h2>

    """),_display_(/*9.6*/if(session.get("username"))/*9.33*/ {_display_(Seq[Any](format.raw/*9.35*/("""

        """),format.raw/*11.9*/("""<div class="jumbotron">
            <h1>RuFan - Daily Fantasy Sport</h1>
            <p>Good to see you again """),_display_(/*13.39*/{session.get("displayName")}),format.raw/*13.67*/("""!</p>
            <a href="#" class="btn btn-info btn-lg"><span class="glyphicon glyphicon-search"></span>Tournaments</a>
            <a href=""""),_display_(/*15.23*/routes/*15.29*/.TournamentController.fantasyTeam()),format.raw/*15.64*/("""" class="btn btn-info btn-lg">
                <span class="glyphicon glyphicon-search"></span>My Fantasy Teams</a>
        </div>

    """)))}/*19.7*/else/*19.12*/{_display_(Seq[Any](format.raw/*19.13*/("""
        """),format.raw/*20.9*/("""<image src=""""),_display_(/*20.22*/routes/*20.28*/.Assets.versioned("/images/RuFan-FrontPageLogo.png")),format.raw/*20.80*/(""""/>
    """)))}),format.raw/*21.6*/("""
""")))}))
      }
    }
  }

  def render(title:String): play.twirl.api.HtmlFormat.Appendable = apply(title)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (title) => apply(title)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 19:16:12 GMT 2015
                  SOURCE: C:/Skilaverkefni4/RuFanWeb/RuFanWeb/app/views/index.scala.html
                  HASH: c2c87d6adc3882bcf8e7454b8d8afcede7647b2c
                  MATRIX: 745->1|896->29|926->64|954->67|973->78|1012->80|1046->88|1105->122|1140->149|1179->151|1218->163|1358->276|1407->304|1580->450|1595->456|1651->491|1810->633|1823->638|1862->639|1899->649|1939->662|1954->668|2027->720|2067->730
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|37->7|39->9|39->9|39->9|41->11|43->13|43->13|45->15|45->15|45->15|49->19|49->19|49->19|50->20|50->20|50->20|50->20|51->21
                  -- GENERATED --
              */
          