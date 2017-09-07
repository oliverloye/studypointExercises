DROP DATABASE restPersons;

CREATE TABLE Person
(
    id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    firstName VARCHAR(25),
    lastName VARCHAR(25),
    phone VARCHAR(25)
);


CREATE DATABASE restPersons;