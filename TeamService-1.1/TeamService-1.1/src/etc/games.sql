create table games(
  gameid int primary key not null,
  starttime datetime,
  teamhomeid int not null,
  teamawayid int not null,
  venueid int

)