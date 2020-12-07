/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : student

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 23/11/2020 17:02:12
*/
create database student;

use student;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for intern
-- ----------------------------
DROP TABLE IF EXISTS `intern`;

CREATE TABLE `intern`  (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学生姓名',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `age` int(10) NOT NULL COMMENT '年龄',
  `school` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学校',
  `sno` int(20) NOT NULL COMMENT '学号',
  `phone` int(30) NOT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '电子邮件',
  `project` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '项目部门',
  `start_time` timestamp(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '开始时间',
  `end_time` timestamp(0) NULL DEFAULT NULL COMMENT '结束时间',
  `state` int(10) NOT NULL DEFAULT 0 COMMENT '是否还在培训 0表示还在培训 1表示已经离开',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of intern
-- ----------------------------
INSERT INTO `intern` VALUES (1, '张三', '男', 21, '牛津大学', 17568854, 1586697745, '55741698@qq.com', '质量安全部', '2020-11-23 00:00:00', NULL, 0);
INSERT INTO `intern` VALUES (2, '李四', '男', 22, '麻省理工学院', 16874258, 1775698842, '1123687459@qq.com', '销售部', '2020-11-21 00:00:00', NULL, 0);
INSERT INTO `intern` VALUES (3, '刘红', '女', 20, '清华大学', 17268458, 1804825697, '1257423685@qq.com', '软件测试部门', '2020-10-10 00:00:00', NULL, 0);
INSERT INTO `intern` VALUES (4, '小刚', '男', 22, '北京大学', 17652358, 1584528874, 'xiaoganggang223@163.com', '前端开发部', '2020-09-30 00:00:00', NULL, 0);
INSERT INTO `intern` VALUES (5, '小明', '男', 21, '西安交通大学', 17568425, 1775236984, '552489625@qq.com', '后端开发部', '2020-09-30 00:00:00', NULL, 0);

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record`  (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '操作人id',
  `done` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '操作项',
  `time` datetime(0) NOT NULL COMMENT '操作时间',
  `iid` int(20) NOT NULL COMMENT '被操作的实习员工的id',
  `iname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '被操作的实习员工姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of record
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
