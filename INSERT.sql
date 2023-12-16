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

INSERT INTO Customer (customerID, customerName, customerPhone, customerAddress, email, password)
VALUES
    ('C001', 'John Doe', '555-123-4567', '123 Main Street', 'john.doe@email.com', 'password123'),
    ('C002', 'Jane Smith', '555-987-6543', '456 Oak Avenue', 'jane.smith@email.com', 'securepass456'),
    ('C003', 'Bob Johnson', '555-555-5555', '789 Pine Road', 'bob.johnson@email.com', 'pass123word'),
    ('C004', 'Alice Williams', '555-777-8888', '101 Elm Lane', 'alice.williams@email.com', 'userpass789'),
    ('C005', 'Charlie Brown', '555-333-4444', '202 Cedar Drive', 'charlie.brown@email.com', 'pass432word'),
    ('C006', 'Eva Davis', '555-111-2222', '303 Birch Boulevard', 'eva.davis@email.com', 'password567'),
    ('C007', 'David Smith', '555-888-9999', '404 Maple Street', 'david.smith@email.com', 'pass789word'),
    ('C008', 'Grace Miller', '555-666-7777', '505 Pine Road', 'grace.miller@email.com', 'securepass890'),
    ('C009', 'Samuel Jones', '555-444-5555', '606 Oak Avenue', 'samuel.jones@email.com', 'pass456word'),
    ('C010', 'Olivia White', '555-222-3333', '707 Elm Lane', 'olivia.white@email.com', 'userpass123'),
    ('C011', 'Daniel Wilson', '555-999-0000', '808 Cedar Drive', 'daniel.wilson@email.com', 'securepass111'),
    ('C012', 'Sophia Davis', '555-666-6666', '909 Birch Boulevard', 'sophia.davis@email.com', 'pass789word'),
    ('C013', 'Matthew Turner', '555-444-4444', '101 Maple Street', 'matthew.turner@email.com', 'securepass222'),
    ('C014', 'Emma Clark', '555-111-1111', '202 Pine Road', 'emma.clark@email.com', 'userpass333'),
    ('C015', 'Andrew Lee', '555-999-9999', '303 Oak Avenue', 'andrew.lee@email.com', 'pass123word'),
    ('C016', 'Ava Harris', '555-888-8888', '404 Elm Lane', 'ava.harris@email.com', 'securepass444'),
    ('C017', 'Logan Brown', '555-666-6666', '505 Cedar Drive', 'logan.brown@email.com', 'pass567word'),
    ('C018', 'Isabella Martinez', '555-444-4444', '606 Pine Road', 'isabella.martinez@email.com', 'userpass678'),
    ('C019', 'Jackson Taylor', '555-222-2222', '707 Oak Avenue', 'jackson.taylor@email.com', 'pass789word'),
    ('C020', 'Mia Anderson', '555-999-9999', '808 Cedar Drive', 'mia.anderson@email.com', 'securepass890');

INSERT INTO Restaurant (restaurantID, restaurantName, restaurantAddress)
VALUES
    ('RST001', 'Tasty Grill', '123 Main Street'),
    ('RST002', 'Italian Delight', '456 Oak Avenue'),
    ('RST003', 'Spicy Bites', '789 Pine Road'),
    ('RST004', 'Sushi Fusion', '101 Elm Lane'),
    ('RST005', 'Mediterranean Flavors', '202 Cedar Drive'),
    ('RST006', 'Burger Haven', '303 Birch Boulevard'),
    ('RST007', 'Veggie Delight', '404 Maple Street'),
    ('RST008', 'Seafood Paradise', '505 Pine Road'),
    ('RST009', 'Mexican Fiesta', '606 Oak Avenue'),
    ('RST010', 'Café Elegance', '707 Elm Lane'),
    ('RST011', 'Healthy Bites', '808 Cedar Drive'),
    ('RST012', 'BBQ Grill', '909 Birch Boulevard'),
    ('RST013', 'Noodle House', '101 Maple Street'),
    ('RST014', 'Pizza Palace', '202 Pine Road'),
    ('RST015', 'Diner Delight', '303 Oak Avenue'),
    ('RST016', 'Thai Spice', '404 Elm Lane'),
    ('RST017', 'Gourmet Kitchen', '505 Cedar Drive'),
    ('RST018', 'Steakhouse Royale', '606 Pine Road'),
    ('RST019', 'Indian Spice', '707 Oak Avenue'),
    ('RST020', 'Sweets Paradise', '808 Cedar Drive');

INSERT INTO Menu (foodID, foodName, foodPrice, foodDescription, foodRating, restaurantID)
VALUES
    ('F001', 'Spaghetti Bolognese', 12, 'Classic Italian dish with meat sauce', 4, 'RST001'),
    ('F002', 'Margherita Pizza', 10, 'Classic pizza with tomato, mozzarella, and basil', 5, 'RST002'),
    ('F003', 'Chicken Curry', 15, 'Spicy chicken curry with rice', 4, 'RST003'),
    ('F004', 'Sushi Platter', 18, 'Assorted sushi rolls with soy sauce', 5, 'RST004'),
    ('F005', 'Greek Salad', 8, 'Fresh salad with olives, feta, and tomatoes', 4, 'RST005'),
    ('F006', 'Cheeseburger', 9, 'Juicy beef patty with cheese and condiments', 4, 'RST006'),
    ('F007', 'Vegetarian Wrap', 10, 'Healthy wrap with assorted veggies', 4, 'RST007'),
    ('F008', 'Seafood Paella', 20, 'Spanish rice dish with assorted seafood', 5, 'RST008'),
    ('F009', 'Taco Trio', 12, 'Assorted tacos with various fillings', 4, 'RST009'),
    ('F010', 'Cappuccino', 4, 'Classic Italian coffee with foamed milk', 5, 'RST010'),
    ('F011', 'Caesar Salad', 9, 'Romaine lettuce, croutons, and Caesar dressing', 4, 'RST011'),
    ('F012', 'BBQ Ribs', 16, 'Succulent ribs with barbecue sauce', 5, 'RST012'),
    ('F013', 'Pad Thai', 14, 'Thai stir-fried noodles with shrimp and tofu', 5, 'RST013'),
    ('F014', 'Pepperoni Pizza', 11, 'Pizza topped with pepperoni and mozzarella', 4, 'RST014'),
    ('F015', 'Eggplant Parmesan', 13, 'Baked eggplant with marinara and cheese', 4, 'RST015'),
    ('F016', 'Tom Yum Soup', 7, 'Spicy Thai soup with shrimp and mushrooms', 5, 'RST016'),
    ('F017', 'Chicken Alfredo', 15, 'Creamy Alfredo sauce with grilled chicken', 4, 'RST017'),
    ('F018', 'Steak Frites', 19, 'Grilled steak with French fries', 5, 'RST018'),
    ('F019', 'Butter Chicken', 16, 'Indian chicken curry in a rich buttery sauce', 5, 'RST019'),
    ('F020', 'Chocolate Sundae', 6, 'Vanilla ice cream with chocolate syrup and nuts', 5, 'RST020');

INSERT INTO Delivery (deliveryTime, shipperID, shipperName, shipperPhone)
VALUES
    ('2023-01-15', 'SH001', 'Fast Express', '123-456-7890'),
    ('2023-02-18', 'SH002', 'Swift Shippers', '987-654-3210'),
    ('2023-03-25', 'SH003', 'Quick Logistics', '555-123-4567'),
    ('2023-04-12', 'SH004', 'Speedy Delivery', '555-987-6543'),
    ('2023-05-20', 'SH005', 'Rapid Transports', '777-111-2222'),
    ('2023-06-08', 'SH006', 'A1 Couriers', '888-333-4444'),
    ('2023-07-14', 'SH007', 'Express Movers', '222-555-6666'),
    ('2023-08-19', 'SH008', 'Swift Freight', '444-777-8888'),
    ('2023-09-22', 'SH009', 'Speedy Shipment', '666-999-0000'),
    ('2023-10-30', 'SH010', 'On-Time Couriers', '111-222-3333'),
    ('2023-11-05', 'SH011', 'Timely Transits', '333-444-5555'),
    ('2023-12-12', 'SH012', 'Instant Deliveries', '555-666-7777'),
    ('2024-01-07', 'SH013', 'Punctual Movers', '777-888-9999'),
    ('2024-02-14', 'SH014', 'Reliable Shippers', '999-000-1111'),
    ('2024-03-21', 'SH015', 'Efficient Freight', '222-333-4444'),
    ('2024-04-26', 'SH016', 'On-the-Dot Transports', '444-555-6666'),
    ('2024-05-03', 'SH017', 'Prompt Couriers', '666-777-8888'),
    ('2024-06-10', 'SH018', 'Sprint Deliveries', '888-999-0000'),
    ('2024-07-15', 'SH019', 'Direct Shipment', '111-222-3333'),
    ('2024-08-22', 'SH020', 'Swift Cargo', '333-444-5555');

INSERT INTO Payment (priceTotal, paymentID, foodID)
VALUES
    (100, 'PAY001', 'F001'),
    (150, 'PAY002', 'F002'),
    (75, 'PAY003', 'F003'),
    (200, 'PAY004', 'F004'),
    (120, 'PAY005', 'F005'),
    (180, 'PAY006', 'F006'),
    (90, 'PAY007', 'F007'),
    (220, 'PAY008', 'F008'),
    (130, 'PAY009', 'F009'),
    (160, 'PAY010', 'F010'),
    (85, 'PAY011', 'F011'),
    (240, 'PAY012', 'F012'),
    (110, 'PAY013', 'F013'),
    (170, 'PAY014', 'F014'),
    (95, 'PAY015', 'F015'),
    (260, 'PAY016', 'F016'),
    (140, 'PAY017', 'F017'),
    (200, 'PAY018', 'F018'),
    (120, 'PAY019', 'F019'),
    (180, 'PAY020', 'F020');

INSERT INTO Bill_Report (billTotal, billAmount, billID, paymentMethod, customerID, paymentID)
VALUES
    (50, 50, 'B001', 'Cash', 'C001', 'PAY001'),
    (75, 75, 'B002', 'Credit', 'C002', 'PAY002'),
    (30, 30, 'B003', 'Debit', 'C003', 'PAY003'),
    (100, 100, 'B004', 'Cash', 'C004', 'PAY004'),
    (60, 60, 'B005', 'Credit', 'C005', 'PAY005'),
    (90, 90, 'B006', 'Debit', 'C006', 'PAY006'),
    (45, 45, 'B007', 'Cash', 'C007', 'PAY007'),
    (110, 110, 'B008', 'Credit', 'C008', 'PAY008'),
    (65, 65, 'B009', 'Debit', 'C009', 'PAY009'),
    (80, 80, 'B010', 'Cash', 'C010', 'PAY010'),
    (35, 35, 'B011', 'Credit', 'C011', 'PAY011'),
    (120, 120, 'B012', 'Debit', 'C012', 'PAY012'),
    (55, 55, 'B013', 'Cash', 'C013', 'PAY013'),
    (85, 85, 'B014', 'Credit', 'C014', 'PAY014'),
    (40, 40, 'B015', 'Debit', 'C015', 'PAY015'),
    (130, 130, 'B016', 'Cash', 'C016', 'PAY016'),
    (70, 70, 'B017', 'Credit', 'C017', 'PAY017'),
    (100, 100, 'B018', 'Debit', 'C018', 'PAY018'),
    (60, 60, 'B019', 'Cash', 'C019', 'PAY019'),
    (95, 95, 'B020', 'Credit', 'C020', 'PAY020');

INSERT INTO Delivery_to(customerID, shipperID)
VALUES
    ('C001', 'SH001'),
    ('C002', 'SH002'),
    ('C003', 'SH003'),
    ('C004', 'SH004'),
    ('C005', 'SH005'),
    ('C006', 'SH001'),
    ('C007', 'SH002'),
    ('C008', 'SH003'),
    ('C009', 'SH004'),
    ('C010', 'SH005'),
    ('C011', 'SH005'),
    ('C012', 'SH004'),
    ('C013', 'SH003'),
    ('C014', 'SH002'),
    ('C015', 'SH001'),
    ('C016', 'SH002'),
    ('C017', 'SH003'),
    ('C018', 'SH004'),
    ('C019', 'SH005'),
    ('C020', 'SH001');
