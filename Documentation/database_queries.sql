--MySQL Commands:
--
--1.) Initalize:  Go to bin folder of mysql and run as admin in cmd: mysqld --initialize
--2.) Start DB: Go to bin folder of mysql and run as admin in cmd: mysqld --console



create table users (uid VARCHAR(20) NOT NULL, password VARCHAR(20) NOT NULL, email VARCHAR(50));

insert into users (uid, password) values ('grepos','itsadog');