CREATE TABLE Product(
	productId BIGINT PRIMARY KEY,
	productName VARCHAR(255)  NOT NULL UNIQUE,
	productNumber VARCHAR(255) NOT NULL UNIQUE,
	productCode VARCHAR(32) NOT NULL UNIQUE,
	makeflag BOOLEAN,
	finishGoodFlags BOOLEAN,
	color VARCHAR(50) ,
	safetyStockLever INT,
	standardCost INT
);
--DROP TABLE Product

