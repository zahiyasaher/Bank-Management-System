create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20),gender varchar(20), email varchar(30), marital_status varchar(20), address varchar(50), city varchar(30), pincode varchar(20), state varchar(30));

show tables;

select * from signup;

create table signuptwo(formno varchar(20), religion varchar(20), category varchar(20), income varchar(20), education varchar(20), occupation varchar(20), senior_citizen varchar(20), existing varchar(20), pan varchar(20), aadhar varchar(20));

select * from signuptwo;

create table signupthree(formno varchar(20), accountType varchar(40), cardnumber varchar(25), pin varchar(40), facilities varchar(100));
create table login(formno varchar(20),cardnumber varchar(25), pin varchar(10));
select * from signupthree;

select * from login;
drop table bank;
create table bank(pin varchar(10), date varchar(50),type varchar(20),amount varchar(40));

select * from bank;