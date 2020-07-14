/*
 Navicat Premium Data Transfer

 Source Server         : GB
 Source Server Type    : MySQL
 Source Server Version : 50642
 Source Host           : localhost:3306
 Source Schema         : android1

 Target Server Type    : MySQL
 Target Server Version : 50642
 File Encoding         : 65001

 Date: 08/07/2020 11:28:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student`  (
  `college` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `specialty` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `studentId` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(12) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `grade` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `class` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `dormitory` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `dorm` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `telephonenum` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`studentId`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010102', '黄晴燕', '男', '2016', '计科一班', '九舍', '203', '');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010103', '于晓洋', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010110', '高宇', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010117', '邹硕', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010118', '刘琳琳', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010135', '顾雪', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010205', '王海波', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010207', '冯楠', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010209', '张子一', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010210', '孟佳欣', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010221', '张如梦', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010302', '贾茹', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010303', '孙宝根', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010309', '刘宝鹤', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010310', '李颖', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010312', '刘佳文', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010317', '李惠子', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010320', '李天舒', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010321', '张婧文', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010324', '张馨雨', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010325', '张嘉钰', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010329', '赵雨松', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010333', '叶冬青', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010405', '叶琳', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010406', '刘智达', '男', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010407', '陈蕾', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010408', '袁政', '男', '2016', '计科二班', '一舍', '203', '');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010412', '穆珍珍', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010416', '李鑫', '男', '2016', '计科二班', '一舍', '203', '');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010418', '张爽', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010424', '郭煜博', '男', '2015', '计科二班', '十舍', '254', '15776547151');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010428', '向琳', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010434', '孙雨', '女', '2016', '计科二班', '一舍', '203', '');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010503', '白云霄', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010508', '刘雪晴', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010511', '邢向前', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010521', '陈正槐', '男', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES ('计算机学院', '计科', '1614010527', '沈玉莹', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010532', '朱俊超', '男', '2016', '计科二班', '一舍', '203', '15776546795');
INSERT INTO `student` VALUES (NULL, '计科', '1614010533', '康凯', '男', '2016', '计科二班', '一舍', '203', '');
INSERT INTO `student` VALUES (NULL, '计科', '1614010535', '卜嵇成', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010536', '刘胜宇', '男', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010556', '胡歌', '男', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010558', '李小龙', '男', '2016', '入错误', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010601', '姚冬雪', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010602', '沈同杰', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010603', '尹鑫超', '男', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010604', '阎鹏', '男', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010608', '谭雯月', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010609', '苏泽峰', '男', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010610', '孙玉然', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010613', '周杰', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010614', '刘晗', '男', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010619', '赵萌萌', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010621', '莫金萍', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010623', '王美玲', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010626', '袁福东', '男', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010627', '孙国强', '男', '2016', '计科三班', '四舍', '203', '');
INSERT INTO `student` VALUES (NULL, '计科', '1614010628', '蔡添玉', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010629', '李彤', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010630', '刘长健', '男', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010633', '孔博文', '男', '2016', '计科三班', '一舍', '203', '');
INSERT INTO `student` VALUES (NULL, '计科', '1614010637', '马洪瑞', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010666', '林丹', '男', '2016', '下一步是按班级查询', '一舍', '203', '');
INSERT INTO `student` VALUES (NULL, '计科', '1614010703', '于淼', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010714', '贾宇欣', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010716', '张雪', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010720', '姜雨生', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010725', '张宇轩', '男', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010730', '王鑫', '男', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010735', '王璐', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010806', '朱翼轩', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010809', '吴延凤', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010817', '徐美琪', '女', '2016', '计科二班', '一舍', '203', '');
INSERT INTO `student` VALUES (NULL, '计科', '1614010820', '孙泽', '女', '2016', '计科二班', '一舍', '203', '');
INSERT INTO `student` VALUES (NULL, '计科', '1614010823', '靳宇琦', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010826', '刘卓明.', '男', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010827', '徐婧文', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010832', '薛雪红', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010903', '孙嘉慧', '女', '2016', '计科三班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010907', '韩婷婷', '男', '2016', '计科二班', '九舍', '203', '');
INSERT INTO `student` VALUES (NULL, '计科', '1614010910', '王盼利', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010913', '任思仪', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010917', '郭晨晔', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010920', '马雪', '女', '2016', '计科二班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010921', '韩岱良', '男', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010925', '李鑫', '女', '2016', '计科一班', '-1', '-1', '-1');
INSERT INTO `student` VALUES (NULL, '计科', '1614010928', '祝琳', '女', '2016', '计科一班', '-1', '-1', '-1');

SET FOREIGN_KEY_CHECKS = 1;
