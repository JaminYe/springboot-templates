/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50096
 Source Host           : localhost:3306
 Source Schema         : springboot

 Target Server Type    : MySQL
 Target Server Version : 50096
 File Encoding         : 65001

 Date: 27/04/2019 12:56:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for s_user
-- ----------------------------
DROP TABLE IF EXISTS `s_user`;
CREATE TABLE `s_user`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY USING BTREE (`user_id`)
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of s_user
-- ----------------------------
INSERT INTO `s_user` VALUES (2, 'aaaaaa', 'aaaaaaaaa');
INSERT INTO `s_user` VALUES (3, 'aaaaaaaaa', 'aaaaaaaaa');
INSERT INTO `s_user` VALUES (4, 'qwdqw', 'wqdqw');
INSERT INTO `s_user` VALUES (5, 'asdas', 'asdas');
INSERT INTO `s_user` VALUES (6, '123', '123');
INSERT INTO `s_user` VALUES (7, '123', '123');
INSERT INTO `s_user` VALUES (8, 'asdas', 'asdas');
INSERT INTO `s_user` VALUES (9, 'qweqw', 'wqeqw');
INSERT INTO `s_user` VALUES (10, '21312', '321312');

SET FOREIGN_KEY_CHECKS = 1;
