CREATE TABLE appuser(
	userId BIGINT NOT NULL PRIMARY KEY,
	userName VARCHAR(50) NOT NULL,
	encryptedPassword VARCHAR(128) NOT NULL,
	enabled INT NOT NULL
);
--DROP TABLE appuser

CREATE TABLE appRole(
	roleId BIGINT NOT NULL PRIMARY KEY,
	roleName VARCHAR(30) NOT NULL UNIQUE
);
--DROP TABLE approle

CREATE TABLE userRole(
	id BIGINT NOT NULL PRIMARY KEY,
	userId BIGINT NOT NULL,
	roleId BIGINT NOT NULL
);
--DROP TABLE userrole

CREATE TABLE persistentLogins (
    username VARCHAR(64) NOT NULL,
    series VARCHAR(64) NOT NULL PRIMARY KEY,
    token VARCHAR(64) NOT NULL,
    last_used TIMESTAMP NOT NULL
);
--DROP TABLE persistentLogins

CREATE TABLE product(
	productId BIGINT PRIMARY KEY,
	productName VARCHAR(255)  NOT NULL UNIQUE,
	productNumber VARCHAR(255) NOT NULL UNIQUE,
	makeflag BOOLEAN,
	finishGoodFlags BOOLEAN,
	color VARCHAR(50) ,
	safetyStockLever INT,
	standardCost INT
);
--DROP TABLE product

