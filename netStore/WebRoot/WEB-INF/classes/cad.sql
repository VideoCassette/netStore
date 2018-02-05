/*
Navicat MySQL Data Transfer

Source Server         : Test
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : aas

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-02-04 00:15:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address` (
  `aId` varchar(255) NOT NULL,
  `aCity` varchar(255) DEFAULT NULL,
  `aDetail` varchar(255) DEFAULT NULL,
  `aProvince` varchar(255) DEFAULT NULL,
  `aTown` varchar(255) DEFAULT NULL,
  `adefault` bit(1) DEFAULT NULL,
  `user_uId` int(11) DEFAULT NULL,
  PRIMARY KEY (`aId`),
  KEY `FKav22c63x9qdu465n8ybhwvl96` (`user_uId`),
  CONSTRAINT `FKav22c63x9qdu465n8ybhwvl96` FOREIGN KEY (`user_uId`) REFERENCES `user` (`uId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of address
-- ----------------------------

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `cId` varchar(255) NOT NULL,
  `cColor` varchar(255) DEFAULT NULL,
  `cDesc` varchar(255) DEFAULT NULL,
  `cName` varchar(255) DEFAULT NULL,
  `cRom` int(11) DEFAULT NULL,
  `cScreenSize` int(11) DEFAULT NULL,
  PRIMARY KEY (`cId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------

-- ----------------------------
-- Table structure for discuss
-- ----------------------------
DROP TABLE IF EXISTS `discuss`;
CREATE TABLE `discuss` (
  `dId` varchar(255) NOT NULL,
  `dContext` varchar(255) DEFAULT NULL,
  `dDate` datetime DEFAULT NULL,
  `dScore` int(11) DEFAULT NULL,
  `product_pId` varchar(255) DEFAULT NULL,
  `user_uId` int(11) DEFAULT NULL,
  PRIMARY KEY (`dId`),
  KEY `FKgct84s1whkwv079gg9li3r5gy` (`product_pId`),
  KEY `FKtq7rdaja0mih3uxibjhbm9987` (`user_uId`),
  CONSTRAINT `FKgct84s1whkwv079gg9li3r5gy` FOREIGN KEY (`product_pId`) REFERENCES `product` (`pId`),
  CONSTRAINT `FKtq7rdaja0mih3uxibjhbm9987` FOREIGN KEY (`user_uId`) REFERENCES `user` (`uId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of discuss
-- ----------------------------

-- ----------------------------
-- Table structure for item
-- ----------------------------
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
  `iId` varchar(255) NOT NULL,
  `iDate` datetime DEFAULT NULL,
  `iNumber` int(11) DEFAULT NULL,
  `iPrice` double DEFAULT NULL,
  `iSale` bit(1) DEFAULT NULL,
  `orderlist_oId` varchar(255) DEFAULT NULL,
  `product_pId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`iId`),
  KEY `FKcs9x7hs7qv62j8owo1xwcc3p8` (`orderlist_oId`),
  KEY `FKq50wyq6lg3gu1hxdv6i9o6ub5` (`product_pId`),
  CONSTRAINT `FKcs9x7hs7qv62j8owo1xwcc3p8` FOREIGN KEY (`orderlist_oId`) REFERENCES `orderlist` (`oId`),
  CONSTRAINT `FKq50wyq6lg3gu1hxdv6i9o6ub5` FOREIGN KEY (`product_pId`) REFERENCES `product` (`pId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of item
-- ----------------------------

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `mId` varchar(255) NOT NULL,
  `mAcceptor` varchar(255) DEFAULT NULL,
  `mContext` varchar(255) DEFAULT NULL,
  `mSender` varchar(255) DEFAULT NULL,
  `mStatus` bit(1) DEFAULT NULL,
  PRIMARY KEY (`mId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for orderlist
-- ----------------------------
DROP TABLE IF EXISTS `orderlist`;
CREATE TABLE `orderlist` (
  `oId` varchar(255) NOT NULL,
  `oStatus` int(11) DEFAULT NULL,
  `oTotal` double DEFAULT NULL,
  `address_aId` varchar(255) DEFAULT NULL,
  `user_uId` int(11) DEFAULT NULL,
  PRIMARY KEY (`oId`),
  KEY `FKsgaogh1vylcbp8ue0ohqvcsqv` (`address_aId`),
  KEY `FKh4mdbvcflsvt88cedv1eub5ej` (`user_uId`),
  CONSTRAINT `FKh4mdbvcflsvt88cedv1eub5ej` FOREIGN KEY (`user_uId`) REFERENCES `user` (`uId`),
  CONSTRAINT `FKsgaogh1vylcbp8ue0ohqvcsqv` FOREIGN KEY (`address_aId`) REFERENCES `address` (`aId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderlist
-- ----------------------------

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `picId` varchar(255) NOT NULL,
  `pCount` int(11) DEFAULT NULL,
  `pUrl` varchar(255) DEFAULT NULL,
  `product_pId` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`picId`),
  KEY `FK3y2jyn46b0o6l1mpkcitvh455` (`product_pId`),
  CONSTRAINT `FK3y2jyn46b0o6l1mpkcitvh455` FOREIGN KEY (`product_pId`) REFERENCES `product` (`pId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture
-- ----------------------------

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `pId` varchar(255) NOT NULL,
  `pDesc` varchar(255) DEFAULT NULL,
  `pName` varchar(255) DEFAULT NULL,
  `pNumber` int(11) DEFAULT NULL,
  `pPrice` double DEFAULT NULL,
  `pSaleNum` int(11) DEFAULT NULL,
  `pTemp` int(11) DEFAULT NULL,
  `category_cId` varchar(255) DEFAULT NULL,
  `user_uId` int(11) DEFAULT NULL,
  PRIMARY KEY (`pId`),
  KEY `FKa48ewlch47gesm3eacjcecbor` (`category_cId`),
  KEY `FKhto8dsrthuabshyi9qc8g7s5s` (`user_uId`),
  CONSTRAINT `FKa48ewlch47gesm3eacjcecbor` FOREIGN KEY (`category_cId`) REFERENCES `category` (`cId`),
  CONSTRAINT `FKhto8dsrthuabshyi9qc8g7s5s` FOREIGN KEY (`user_uId`) REFERENCES `user` (`uId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uId` int(11) NOT NULL,
  `uGrade` int(11) DEFAULT NULL,
  `uName` varchar(255) DEFAULT NULL,
  `uPassword` varchar(255) DEFAULT NULL,
  `uSign` varchar(255) DEFAULT NULL,
  `uStatus` bit(1) NOT NULL,
  PRIMARY KEY (`uId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
