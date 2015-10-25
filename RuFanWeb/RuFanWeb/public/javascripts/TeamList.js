/**
 * Created by thordisjona on 25/10/15.
 */

$(document).ready(function() {
    $.get("/api/teams", function(data) {
        data.forEach(function(team) {
            $("#favoriteTeam").append("<option value='" + team.teamId + "'>" + team.displayName + "<\/option>");
        });
    });
});
