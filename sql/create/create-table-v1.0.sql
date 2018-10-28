database design here !

-- -----------------------------------------------------
-- Table users
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Users(
	userId BIGINT PRIMARY KEY,
    userUuid VARCHAR(255) UNIQUE,
	firstName VARCHAR(50), 
    lastName VARCHAR(50), 
    dob DATE,
	email VARCHAR(50), 
	password VARCHAR(150), 
	phone VARCHAR(50), 
	address VARCHAR(150)
);
-- -----------------------------------------------------
-- Table   Category 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Category  (
   categoryId  BIGINT PRIMARY KEY,
   categoryName  VARCHAR(150),
   description  VARCHAR(1000)
);
-- -----------------------------------------------------
-- Table   Product 
-- -----------------------------------------------------
CREATE TABLE Product(
	productId BIGINT PRIMARY KEY,
    productUuid VARCHAR(255) UNIQUE,
	productName VARCHAR(150)  NOT NULL UNIQUE,
	productNumber VARCHAR(255) NOT NULL UNIQUE,
	productCode VARCHAR(32) NOT NULL UNIQUE,
	makeFlag BOOLEAN,
	finishGoodFlags BOOLEAN,
	color VARCHAR(50) ,
	safetyStockLever INT,
	standardCost INT
);
-- -----------------------------------------------------
-- Table   Customer 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Customer  (
   customerId BIGINT PRIMARY KEY,
   firstName  VARCHAR(50),
   lastName  VARCHAR(50),
   email  VARCHAR(50),
   password  VARCHAR(50),
   address  VARCHAR(150),
   dob  DATE
);
-- -----------------------------------------------------
-- Table   Order 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Orders  (
   orderId BIGINT PRIMARY KEY,
   orderUuid VARCHAR(255) UNIQUE,
   orderDate  DATE,
   description  VARCHAR(1000)
);
-- -----------------------------------------------------
-- Table   Image 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Image (
   imageId  BIGINT PRIMARY KEY,
   imageName  VARCHAR(100),
   imageData  bytea 
);
-- -----------------------------------------------------
-- Table   OrderDetails 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS   OrderDetails  (
   orderDetailsId BIGINT PRIMARY KEY,
   quantity  INT,
   price  NUMERIC
);
-- -----------------------------------------------------
-- Table   SpecialOffer 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS   SpecialOffer  (
   specialOfferId BIGINT PRIMARY KEY,
   description  VARCHAR(1000),
   percent  INT
);
-- -----------------------------------------------------
-- Table   SpecialOfferProduct 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS   SpecialOfferProduct  (
   specialOfferProductId BIGINT PRIMARY KEY
);
