/*
Navicat MySQL Data Transfer

Source Server         : local-88
Source Server Version : 50728
Source Host           : 192.168.244.88:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50728
File Encoding         : 65001

Date: 2020-01-07 18:16:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
