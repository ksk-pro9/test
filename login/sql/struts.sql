set names utf8;
set foreign_key_checks=0;
drop database if exists logindb;
create database logindb;
use logindb;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"myles.k","123"),
(2,"dave.g","123"),
(1,"summy.h","123"),
(1,"eddie.v","123");
