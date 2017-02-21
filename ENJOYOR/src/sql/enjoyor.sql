/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : enjoyor

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-01-06 14:30:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `DEID` int(11) NOT NULL AUTO_INCREMENT,
  `DENAME` varchar(20) NOT NULL,
  `DEMSTATE` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`DEID`),
  KEY `DEID` (`DEID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '人事部', '1');
INSERT INTO `department` VALUES ('2', '技术部', '1');
INSERT INTO `department` VALUES ('3', '行政部', '1');
INSERT INTO `department` VALUES ('4', '财务部', '2');
INSERT INTO `department` VALUES ('5', '工程部', '1');
INSERT INTO `department` VALUES ('6', '测试1', '1');
INSERT INTO `department` VALUES ('7', '测试2', '1');
INSERT INTO `department` VALUES ('8', '测试3', '1');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `EID` int(11) NOT NULL AUTO_INCREMENT,
  `ENAME` varchar(30) NOT NULL,
  `SEX` varchar(1) NOT NULL,
  `EON` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `DEID` int(11) NOT NULL,
  PRIMARY KEY (`EID`),
  KEY `DE_DEID` (`DEID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '小明', '1', '001', '123456', '1');
INSERT INTO `employee` VALUES ('2', '小红', '2', '002', '123456', '1');
INSERT INTO `employee` VALUES ('3', '小钱', '1', '003', '123456', '2');
INSERT INTO `employee` VALUES ('4', '小候', '1', '004', '123456', '3');
INSERT INTO `employee` VALUES ('5', '明明', '1', '005', '123456', '1');
INSERT INTO `employee` VALUES ('6', '倩倩', '2', '006', '123456', '3');
INSERT INTO `employee` VALUES ('7', '王丽', '2', '007', '123456', '3');
INSERT INTO `employee` VALUES ('8', '天天', '1', '008', '123456', '2');
INSERT INTO `employee` VALUES ('9', '小九', '1', '009', '123456', '1');
INSERT INTO `employee` VALUES ('10', '花火', '2', '010', '123456', '1');
INSERT INTO `employee` VALUES ('11', '测试1', '1', '011', '123456', '1');
INSERT INTO `employee` VALUES ('12', '测试2', '1', '012', '123456', '2');
INSERT INTO `employee` VALUES ('13', '测试3', '1', '013', '123456', '1');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `USERID` int(11) NOT NULL AUTO_INCREMENT,
  `UNAME` varchar(20) NOT NULL,
  `UPASSWORD` varchar(20) NOT NULL,
  PRIMARY KEY (`USERID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin');
INSERT INTO `user` VALUES ('2', 'root', 'root');
