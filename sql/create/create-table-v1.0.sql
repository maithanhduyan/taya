database design here !

-- -----------------------------------------------------
-- Table users
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS users(
	idUser serial primary key,
	first_name VARCHAR(50), 
    last_name VARCHAR(50), 
    dob DATE,
	email VARCHAR(50), 
	password VARCHAR(50), 
	phone VARCHAR(50), 
	address VARCHAR(150)
)
-- -----------------------------------------------------
-- Table   Category 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Category  (
   idCategory  serial primary key,
   category_name  VARCHAR(50),
   category_description  VARCHAR(1000)
)
-- -----------------------------------------------------
-- Table   Product 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Product  (
   idProduct  serial primary key,
   idCategory  INT,
   product_name  VARCHAR(50),
   product_price  numeric,
   product_description  VARCHAR(1000),
   product_quantity  INT,
   CONSTRAINT  fk_Product_Category
   FOREIGN KEY (idCategory) REFERENCES   Category  ( idCategory )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
-- -----------------------------------------------------
-- Table   Customer 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Customer  (
   idCustomer  serial primary key,
   first_name  VARCHAR(50),
   last_name  VARCHAR(50),
   email  VARCHAR(50),
   password  VARCHAR(50),
   address  VARCHAR(150),
   dob  DATE
)
-- -----------------------------------------------------
-- Table   Order 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS orders  (
   idOrder VARCHAR(50) primary key,
    idCustomer  INT NOT NULL,
   order_date  DATE,
   order_description  VARCHAR(1000),
  CONSTRAINT  fk_Order_Customer 
    FOREIGN KEY ( idCustomer )
    REFERENCES   Customer  ( idCustomer )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
-- -----------------------------------------------------
-- Table   Image 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS Image (
   idImage  serial primary key,
   idProduct  INT NOT NULL,
   img_name  VARCHAR(100),
   img_data  bytea ,
   CONSTRAINT  fk_Image_Product 
   FOREIGN KEY ( idProduct)
   REFERENCES   Product  ( idProduct)
   ON DELETE NO ACTION
   ON UPDATE NO ACTION
)
-- -----------------------------------------------------
-- Table   OrderDetails 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS   OrderDetails  (
   idOrderDetails  serial primary key,
   quantity  INT,
   price  NUMERIC,
   idOrder  VARCHAR(50) NOT NULL,
   idCustomer  INT NOT NULL,
   idProduct  INT NOT NULL,
  CONSTRAINT  fk_OrderDetails_Order
    FOREIGN KEY ( idOrder )
    REFERENCES   Orders  ( idOrder )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT  fk_OrderDetails_Product
    FOREIGN KEY ( idProduct )
    REFERENCES   Product  ( idProduct )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)
-- -----------------------------------------------------
-- Table   SpecialOffer 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS   SpecialOffer  (
   idSpecialOffer serial primary key,
   description  VARCHAR(1000),
   percent  INT
)
-- -----------------------------------------------------
-- Table   SpecialOfferProduct 
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS   SpecialOfferProduct  (
   idSpecialOfferProduct serial primary key,
   idSpecialOffer  INT NOT NULL,
   idProduct  INT NOT NULL,
   CONSTRAINT  fk_SpecialOfferProduct_SpecialOffer
    FOREIGN KEY ( idSpecialOffer )
    REFERENCES   SpecialOffer  ( idSpecialOffer )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
    CONSTRAINT  fk_SpecialOfferProduct_Product
    FOREIGN KEY ( idProduct )
    REFERENCES   Product  ( idProduct)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
)



