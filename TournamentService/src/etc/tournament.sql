create table tournaments
(
  tournamentid int primary key NOT NULL,
  name varchar(50),
  starttime datetime,
  endtime datetime,
  leaguename varchar(50),
  status varchar(50)

)