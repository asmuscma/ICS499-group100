
Create Table personalInfo(fName varchar(25) NOT NULL, lName varchar(25) NOT NULL, 
address varchar(60) NOT NULL, DOB date NOT NULL, SSN int NOT NULL, phoneNum int NOT NULL);

CREATE TABLE USER(username varchar(15) NOT NULL, 
password varchar(25), SSN int NOT NULL);

create Table Address(Street varchar(60) NOT NULL,
Street2 varchar(60), 
city varchar(40) NOT NULL,
zipCode int NULL, county varchar(10) NOT NULL,
district int NOT NULL); 

create Table Survey(question varchar(100) NOT NULL, 
answer varchar(45) NOT NULL,
topic varchar(35) NOT NULL);

Create Table Ballot(raceID int NOT NULL, office varchar(25) NOT NULL, 
count int NOT NULL, date Date NOT NULL, Candidate varchar(25) NOT NULL);

Create Table Candidate(candidateFirstName varchar(30), 
candidateLastName varchar(30), district int NOT Null, party varchar(25) NOT NULL, 
office varchar(25) NOT NULL, candidateID int NOT NUll);



  