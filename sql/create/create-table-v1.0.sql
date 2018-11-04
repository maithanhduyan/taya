CREATE DATABASE taya
--DROP DATABASE taya
-- -----------------------------------------------------
-- Table users
-- -----------------------------------------------------
CREATE TABLE Users(
	userId BIGINT PRIMARY KEY,
    userUuid VARCHAR(255) UNIQUE,
	firstName VARCHAR(50), 
    lastName VARCHAR(50), 
    dob DATE,
	email VARCHAR(50), 
	password VARCHAR(150), 
	phone VARCHAR(50), 
	address VARCHAR(150),
	createDate DATE,
	modifiedDate DATE
);
--DROP TABLE Users
-- -----------------------------------------------------
-- Table   Category 
-- -----------------------------------------------------
CREATE TABLE ProductCategory  (
   categoryId  BIGINT PRIMARY KEY,
   categoryName  VARCHAR(150),
   description  VARCHAR(1000)
);
--DROP TABLE Category
-- -----------------------------------------------------
-- Table   Product 
-- -----------------------------------------------------
CREATE TABLE Product(
	productId BIGINT PRIMARY KEY,
    productUuid VARCHAR(255) NOT NULL,
	productName VARCHAR(150)  NOT NULL,
	productCategoryId BIGINT,
	color VARCHAR(50) ,
	standardCost INT
);
--DROP TABLE Product
-- -----------------------------------------------------
-- Table   Customer 
-- -----------------------------------------------------
CREATE TABLE Customer  (
   customerId BIGINT PRIMARY KEY,
   firstName  VARCHAR(50),
   lastName  VARCHAR(50),
   email  VARCHAR(50),
   password  VARCHAR(50),
   address  VARCHAR(150),
   dob  DATE
);
--DROP TABLE Customer
-- -----------------------------------------------------
-- Table   Order 
-- -----------------------------------------------------
CREATE TABLE Orders  (
   orderId BIGINT PRIMARY KEY,
   orderUuid VARCHAR(255) UNIQUE,
   orderDate  DATE,
   description  VARCHAR(1000)
);
--DROP TABLE Orders
-- -----------------------------------------------------
-- Table OrderDetails 
-- -----------------------------------------------------
CREATE TABLE OrderDetails  (
   orderDetailsId BIGINT PRIMARY KEY,
   quantity  INT,
   price  NUMERIC
);
--DROP TABLE OrderDetails
-- -----------------------------------------------------
-- Table Image 
-- -----------------------------------------------------
CREATE TABLE Image (
   	imageId BIGINT NOT NULL PRIMARY KEY,
	modifiedDate DATE null,
	type_ VARCHAR(75) null,
	height INTEGER,
	width INTEGER,
	size_ INTEGER
);
--DROP TABLE Image
-- -----------------------------------------------------
-- Table Country 
-- -----------------------------------------------------
CREATE TABLE Country (
	countryId BIGINT NOT NULL PRIMARY KEY,
	name VARCHAR(75) NULL,
	a2 VARCHAR(75) NULL,
	a3 VARCHAR(75) NULL,
	number_ VARCHAR(75) NULL,
	idd_ VARCHAR(75) NULL,
	zipRequired BOOLEAN,
	active_ BOOLEAN
);
--DROP TABLE Country
-- -----------------------------------------------------
-- Table Region 
-- -----------------------------------------------------
CREATE TABLE Region (
	regionId BIGINT NOT NULL PRIMARY KEY,
	countryId BIGINT,
	regionCode VARCHAR(75) NULL,
	name VARCHAR(75) NULL,
	active_ BOOLEAN
);
--DROP TABLE Region
-- -----------------------------------------------------
-- Table Region 
-- -----------------------------------------------------
CREATE TABLE District (
	district BIGINT NOT NULL PRIMARY KEY,
	regionId BIGINT,
	districtCode VARCHAR(75) NULL,
	name VARCHAR(75) NULL,
	active_ BOOLEAN
);
--DROP TABLE Region