/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : cad

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-01-30 15:06:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `a_city` varchar(255) DEFAULT NULL,
  `a_detail` varchar(255) DEFAULT NULL,
  `a_province` varchar(255) DEFAULT NULL,
  `a_town` varchar(255) DEFAULT NULL,
  `user` int(11) DEFAULT NULL,
  PRIMARY KEY (`a_id`),
  KEY `FKjqkiweovolae560fxj8ryjppg` (`user`),
  CONSTRAINT `FKjqkiweovolae560fxj8ryjppg` FOREIGN KEY (`user`) REFERENCES `user` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_desc` varchar(255) DEFAULT NULL,
  `category_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for discuss
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_discuss` varchar(255) DEFAULT NULL,
  `d_score` int(11) DEFAULT NULL,
  `product_p_id` int(11) DEFAULT NULL,
  `user_u_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`d_id`),
  KEY `FK5gd1ll1y7599nocv5oy3a4lmp` (`product_p_id`),
  KEY `FKf42bx9wv26j7j7efhbvrd02v5` (`user_u_id`),
  CONSTRAINT `FK5gd1ll1y7599nocv5oy3a4lmp` FOREIGN KEY (`product_p_id`) REFERENCES `product` (`p_id`),
  CONSTRAINT `FKf42bx9wv26j7j7efhbvrd02v5` FOREIGN KEY (`user_u_id`) REFERENCES `user` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `i_id` int(11) NOT NULL AUTO_INCREMENT,
  `i_number` int(11) DEFAULT NULL,
  `i_price` double DEFAULT NULL,
  `orderlist_o_id` int(11) DEFAULT NULL,
  `product_p_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`i_id`),
  KEY `FKg6grv9cf1pwqe09x0c91hmpo4` (`orderlist_o_id`),
  KEY `FKqsgig37p0ugjavggv2h9dyyol` (`product_p_id`),
  CONSTRAINT `FKg6grv9cf1pwqe09x0c91hmpo4` FOREIGN KEY (`orderlist_o_id`) REFERENCES `order_list` (`o_id`),
  CONSTRAINT `FKqsgig37p0ugjavggv2h9dyyol` FOREIGN KEY (`product_p_id`) REFERENCES `product` (`p_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `m_acceptor` int(11) DEFAULT NULL,
  `m_message` varchar(255) DEFAULT NULL,
  `m_sender` int(11) DEFAULT NULL,
  `m_status` bit(1) DEFAULT NULL,
  PRIMARY KEY (`m_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for order_list
-- ----------------------------
DROP TABLE IF EXISTS `order_list`;
CREATE TABLE `order_list` (
  `o_id` int(11) NOT NULL AUTO_INCREMENT,
  `o_status` int(11) DEFAULT NULL,
  `o_total` double DEFAULT NULL,
  `user_u_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`o_id`),
  KEY `FKr9rl5gt76w6w6ibfqhpfm98nq` (`user_u_id`),
  CONSTRAINT `FKr9rl5gt76w6w6ibfqhpfm98nq` FOREIGN KEY (`user_u_id`) REFERENCES `user` (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `p_id` int(11) NOT NULL AUTO_INCREMENT,
  `p_desc` varchar(255) DEFAULT NULL,
  `p_name` varchar(255) DEFAULT NULL,
  `p_number` int(11) DEFAULT NULL,
  `p_price` double DEFAULT NULL,
  `category_c_id` int(11) DEFAULT NULL,
  `vender_v_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`p_id`),
  KEY `FK6i0p76e6a6htioil0qtfcds3q` (`category_c_id`),
  KEY `FKg8jyh54ajl2ltwnu920fd1dmb` (`vender_v_id`),
  CONSTRAINT `FK6i0p76e6a6htioil0qtfcds3q` FOREIGN KEY (`category_c_id`) REFERENCES `category` (`c_id`),
  CONSTRAINT `FKg8jyh54ajl2ltwnu920fd1dmb` FOREIGN KEY (`vender_v_id`) REFERENCES `vender` (`v_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(255) DEFAULT NULL,
  `u_password` varchar(255) DEFAULT NULL,
  `u_sign` varchar(255) DEFAULT NULL,
  `u_status` bit(1) NOT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for vender
-- ----------------------------
DROP TABLE IF EXISTS `vender`;
CREATE TABLE `vender` (
  `v_id` int(11) NOT NULL AUTO_INCREMENT,
  `v_confirm` int(11) DEFAULT NULL,
  `v_desc` varchar(255) DEFAULT NULL,
  `v_name` varchar(255) DEFAULT NULL,
  `v_password` varchar(255) DEFAULT NULL,
  `v_status` bit(1) NOT NULL,
  PRIMARY KEY (`v_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
