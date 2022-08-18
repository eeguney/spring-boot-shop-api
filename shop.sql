CREATE DATABASE  IF NOT EXISTS `shop_directory`;
USE `shop_directory`;

CREATE TABLE `notebooks` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) NOT NULL,
  `brand` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL,
  `storage` varchar(45) DEFAULT NULL,
  `processor` varchar(100) DEFAULT 0,
  `graphic_card` varchar(100) DEFAULT NULL,
  `motherboard` varchar(100) DEFAULT NULL,
  `screen_size` varchar(20) DEFAULT NULL,
  `ram_memory` varchar(10) DEFAULT NULL,
  `screen_resolution` varchar(45) DEFAULT NULL,
  `price` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `notebooks` VALUES 
	(1,'Apple Macbook Air M2','Apple','Macbook Air M2', '256GB, 512GB, 1TB',
    'Apple Silicon M2', 'Apple Silicon M2', '', '14 inch','8GB, 16GB','2560x1664','699$');

CREATE TABLE `smartphones` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(100) NOT NULL,
  `brand` varchar(45) NOT NULL,
  `model` varchar(45) NOT NULL,
  `storage` varchar(45) DEFAULT NULL,
  `weight` int(5) DEFAULT 0,
  `display_size` varchar(45) DEFAULT NULL,
  `display_resolution` varchar(45) DEFAULT NULL,
  `os` varchar(20) DEFAULT NULL,
  `ram_memory` varchar(10) DEFAULT NULL,
  `battery` varchar(45) DEFAULT NULL,
  `price` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

INSERT INTO `smartphones` VALUES 
	(1,'Apple iPhone 13','Apple','iPhone 13', '128, 256GB, 512GB',
    174, 6.1, '1170x2532 pixels','iOS 15','4GB','3240mAh', '449$'),
    (2,'Apple iPhone 12','Apple','iPhone 12', '128, 256GB, 512GB',
    168, 6.0, '1170x2532 pixels','iOS 14','3GB','3180mAh', '399$')

