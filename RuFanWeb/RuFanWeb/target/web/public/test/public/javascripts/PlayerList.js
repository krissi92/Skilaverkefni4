
$(document).ready(function() {
    $.get("/api/teams", function(data) {
        data.forEach(function(team) {
            $("#Team").append("<option value='" + team.teamId+ "'>" + team.displayName + "<\/option>");
        });
    });
});


$('#Team').change(function(){
    $('#Player').empty();
    $.get("/api/players/" + this.value, function(data) {
        data.forEach(function (player) {
            $("#Player").append("<option value='" + player.playerId + "'>" + player.firstName + "<\/option>");
        });
    });
});
$('#Player').change(function(){
    $('#Position').empty();
    $.get("/api/positions/" + this.value, function(data) {
        data.forEach(function (position) {
            $("#Position").append("<option value='" + position.positionId + "'>" + position.abbreviation + "<\/option>");
        });
    });
});

