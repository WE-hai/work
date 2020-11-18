create database login;

use login;

create table user
(
  username varchar(10),
  password varchar(10),
  create_time varchar(20),
  login_time varchar(20),
  status varchar(5)
);

insert into user(username, password,create_time,login_time,status)  values ('abc','123456',2020-11-12 00:00:00,2020-11-12 00:00:00,'登录');