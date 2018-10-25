CREATE TABLE foo(
	fooId BIGINT PRIMARY KEY,
	fooName VARCHAR(255)  NOT NULL ,
	fooCode VARCHAR(32) NOT NULL ,
	userCreateId BIGINT,
	userName VARCHAR(255),
	createDate DATE,
);
--DROP TABLE foo

