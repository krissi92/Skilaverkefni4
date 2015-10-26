
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object fantasyTeam_Scope0 {
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

class fantasyTeam extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[is.rufan.tournament.domain.FantasyTeam,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(fantasyTeams: is.rufan.tournament.domain.FantasyTeam):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.56*/("""

"""),_display_(/*3.2*/main("Fantasy teams")/*3.23*/ {_display_(Seq[Any](format.raw/*3.25*/("""
  """),format.raw/*4.3*/("""<div class ="fantasyteam">
    """),_display_(/*5.6*/for(players <- fantasyTeams.getPlayers) yield /*5.45*/ {_display_(Seq[Any](format.raw/*5.47*/("""
      """),format.raw/*6.7*/("""<!--if(team.-->
      <table class="fantasyTeamsTable">
        <thead>
          <th>Player</th>
          <td>Kriddzi</td>
            <!--<td>players.getFirstName</td>-->
          <th>Position</th>
          <td>adc</td>
          <!--<td>players.getPositions</td>-->
        </thead>
        <tbody>
        </tbody>
      </table>
    """)))}),format.raw/*19.6*/("""
  """),format.raw/*20.3*/("""</div>
""")))}),format.raw/*21.2*/("""
"""))
      }
    }
  }

  def render(fantasyTeams:is.rufan.tournament.domain.FantasyTeam): play.twirl.api.HtmlFormat.Appendable = apply(fantasyTeams)

  def f:((is.rufan.tournament.domain.FantasyTeam) => play.twirl.api.HtmlFormat.Appendable) = (fantasyTeams) => apply(fantasyTeams)

  def ref: this.type = this

}


}

/**/
object fantasyTeam extends fantasyTeam_Scope0.fantasyTeam
              /*
                  -- GENERATED --
                  DATE: Mon Oct 26 19:36:05 GMT 2015
                  SOURCE: C:/Skilaverkefni4/RuFanWeb/RuFanWeb/app/views/fantasyTeam.scala.html
                  HASH: 026d467c9e85fae424c1ab45ef99d70c479c950b
                  MATRIX: 789->1|938->55|968->60|997->81|1036->83|1066->87|1124->120|1178->159|1217->161|1251->169|1636->524|1667->528|1706->537
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|36->5|36->5|36->5|37->6|50->19|51->20|52->21
                  -- GENERATED --
              */
          