Use Project;

CREATE TABLE Customer
(
  customerID VARCHAR(10) NOT NULL,
  customerName VARCHAR(50) NOT NULL,
  customerPhone VARCHAR(20) NOT NULL,
  customerAddress VARCHAR(50) NOT NULL,
  email VARCHAR(50) NOT NULL,
  password VARCHAR(50) NOT NULL,
  PRIMARY KEY (customerID)
);

CREATE TABLE Delivery
(
  deliveryTime DATE NOT NULL,
  shipperID VARCHAR(10) NOT NULL,
  shipperName VARCHAR(50) NOT NULL,
  shipperPhone VARCHAR(20) NOT NULL,
  PRIMARY KEY (shipperID)
);

CREATE TABLE Restaurant
(
  restaurantID VARCHAR(10) NOT NULL,
  restaurantName VARCHAR(50) NOT NULL,
  restaurantAddress VARCHAR(50) NOT NULL,
  PRIMARY KEY (restaurantID)
);

CREATE TABLE Menu
(
  foodID VARCHAR(10) NOT NULL,
  foodName VARCHAR(50) NOT NULL,
  foodPrice INT NOT NULL,
  foodDescription VARCHAR(50) NOT NULL,
  foodRating INT NOT NULL,
  restaurantID VARCHAR(10) NOT NULL,
  PRIMARY KEY (foodID),
  FOREIGN KEY (restaurantID) REFERENCES Restaurant(restaurantID)
);

CREATE TABLE Payment
(
  priceTotal INT NOT NULL,
  paymentID VARCHAR(10) NOT NULL,
  foodID VARCHAR(10) NOT NULL,  
  PRIMARY KEY (paymentID),
  FOREIGN KEY (foodID) REFERENCES Menu(foodID)
);

CREATE TABLE Bill_Report
(
  billTotal INT NOT NULL,
  billAmount INT NOT NULL,
  billID VARCHAR(10) NOT NULL,
  paymentMethod VARCHAR(10) NOT NULL,
  customerID VARCHAR(10) NOT NULL,
  paymentID VARCHAR(10) NOT NULL,
  PRIMARY KEY (billID),
  FOREIGN KEY (customerID) REFERENCES Customer(customerID),
  FOREIGN KEY (paymentID) REFERENCES Payment(paymentID)
);

CREATE TABLE Delivery_to
(
  customerID VARCHAR(10) NOT NULL,
  shipperID VARCHAR(10) NOT NULL,
  PRIMARY KEY (customerID, shipperID),
  FOREIGN KEY (customerID) REFERENCES Customer(customerID),
  FOREIGN KEY (shipperID) REFERENCES Delivery(shipperID)
);
