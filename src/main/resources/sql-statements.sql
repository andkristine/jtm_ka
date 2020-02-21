create schema db;
DROP TABLE IF EXISTS Teacher;
CREATE TABLE Teacher (
    Id int AUTO_INCREMENT,
    firstName varchar(100) NOT NULL,
    lastName varchar(100) NOT NULL ,
    age int,
    PRIMARY KEY (Id)
);
SELECT * FROM Teacher;
INSERT INTO User (firstName, lastName, age)
VALUES ('John', 'Doe','36');

INSERT INTO Teacher (Id, firstName, lastName, age)
VALUES (1, 'John', 'Doe','36');
INSERT INTO Teacher (Id, firstName, lastName, age)
VALUES (2, 'Jane', 'Doe','32');



INSERT INTO Teacher (Id, firstName, lastName, age)
VALUES (900 ,'Mary', 'Boo', 67);
INSERT INTO Teacher (Id, firstName, lastName, age)
VALUES (901 ,'Steve', 'Wallace', 54);

UPDATE Teacher
SET lastName = 'Parker'
WHERE Id = 900;
UPDATE Teacher
SET firstName = 'Steven'
WHERE Id = 901;
DELETE FROM Teacher WHERE age;
SET SQL_SAFE_UPDATES = 0;
ALTER TABLE Teacher DROP COLUMN age;
