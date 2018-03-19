/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : test_app

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-03-19 18:02:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `mobile` varchar(30) NOT NULL COMMENT '手机号',
  `password` varchar(30) NOT NULL COMMENT '密码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `gender` int(11) DEFAULT NULL COMMENT '性别   \r\n0 : 男   \r\n1 : 女  ',
  `token` varchar(255) DEFAULT NULL COMMENT '登录口令',
  `login_count` int(11) DEFAULT NULL COMMENT '登录次数',
  `last_login_time` datetime DEFAULT NULL COMMENT '上次登录时间',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户姓名',
  `login_account` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123456', '123456', null, '2018-03-19 10:28:02', '0', null, null, null, 'vencc', null);
INSERT INTO `user` VALUES ('2', '1111111', '123456', null, '2018-03-19 13:46:00', '1', null, null, null, 'vencc1', null);
INSERT INTO `user` VALUES ('3', '7897897', '123456', null, '2018-03-19 13:46:23', '0', null, null, null, 'vencc2', null);
