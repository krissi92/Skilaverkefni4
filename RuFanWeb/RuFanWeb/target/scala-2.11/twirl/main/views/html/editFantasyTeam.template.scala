
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object editFantasyTeam_Scope0 {
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

class editFantasyTeam extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[is.rufan.player.domain.Player],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(FantasyForm: Form[is.rufan.player.domain.Player]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.52*/("""
"""),_display_(/*3.2*/main("Fantasy teams")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""


    """),_display_(/*6.6*/helper/*6.12*/.form(action = routes.TournamentController.editFantasyTeams())/*6.74*/{_display_(Seq[Any](format.raw/*6.75*/("""
        """),format.raw/*7.9*/("""<fieldset>
            <legend>Your Fantasy Team</legend>
            """),_display_(/*9.14*/select(
                FantasyForm("Team"),
                options(),
                '_help -> "Choose team"
            )),format.raw/*13.14*/("""
            """),_display_(/*14.14*/select(
                FantasyForm("Player"),
                options(),
                '_help -> "Choose player"
            )),format.raw/*18.14*/("""
            """),_display_(/*19.14*/select(
                FantasyForm("Position"),
                options(),
                '_help -> "Choose position"
            )),format.raw/*23.14*/("""
        """),format.raw/*24.9*/("""</fieldset>

    """)))}),format.raw/*26.6*/("""
    """),format.raw/*27.5*/("""<script src=""""),_display_(/*27.19*/routes/*27.25*/.Assets.versioned("javascripts/PlayerList.js")),format.raw/*27.71*/(""""></script>
""")))}),format.raw/*28.2*/("""
"""))
      }
    }
  }

  def render(FantasyForm:Form[is.rufan.player.domain.Player]): play.twirl.api.HtmlFormat.Appendable = apply(FantasyForm)

  def f:((Form[is.rufan.player.domain.Player]) => play.twirl.api.HtmlFormat.Appendable) = (FantasyForm) => apply(FantasyForm)

  def ref: this.type = this

}


}

/**/
object editFantasyTeam extends editFantasyTeam_Scope0.editFantasyTeam
              /*
                  -- GENERATED --
                  DATE: Tue Oct 27 03:30:48 GMT 2015
                  SOURCE: C:/Skilaverkefni4/RuFanWeb/RuFanWeb/app/views/editFantasyTeam.scala.html
                  HASH: d3811dec61940026aa0befd2a82bc96a769c0a3e
                  MATRIX: 794->1|954->51|982->72|1011->93|1050->95|1086->106|1100->112|1170->174|1208->175|1244->185|1343->258|1493->387|1535->402|1689->535|1731->550|1889->687|1926->697|1976->717|2009->723|2050->737|2065->743|2132->789|2176->803
                  LINES: 27->1|32->1|33->3|33->3|33->3|36->6|36->6|36->6|36->6|37->7|39->9|43->13|44->14|48->18|49->19|53->23|54->24|56->26|57->27|57->27|57->27|57->27|58->28
                  -- GENERATED --
              */
          