--MySQL Commands:
--
--1.) Initalize:  Go to bin folder of mysql and run as admin in cmd: mysqld --initialize
--2.) Start DB: Go to bin folder of mysql and run as admin in cmd: mysqld --console

--ALTER USER 'root'@'localhost' IDENTIFIED BY 'admin';
--
--CREATE USER 'user1'@'localhost' IDENTIFIED BY 'admin';
--
--GRANT ALL PRIVILEGES ON demo.users TO 'user1'@'localhost';


-- USER TABLE
create table users (uid VARCHAR(20) NOT NULL PRIMARY KEY, password VARCHAR(20) NOT NULL, email VARCHAR(50));

insert into users (uid, password) values ('grepos','itsadog');


--PARKS TABLE
create table parks (name VARCHAR(50) NOT NULL PRIMARY KEY,country VARCHAR(50), province VARCHAR(50), latitude VARCHAR(10) NOT NULL, longitude VARCHAR(10) NOT NULL,annualVisitors INTEGER, parkArea INTEGER, dtEst DATE, description VARCHAR(255));




