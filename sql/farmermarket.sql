/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : farmermarket

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 16/09/2021 14:52:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for market
-- ----------------------------
DROP TABLE IF EXISTS `market`;
CREATE TABLE `market`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `market_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '市场名称',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '市场地址',
  `fzr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '负责人',
  `telphone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '联系电话',
  `stall_count` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '摊位总数',
  `rent_count` int NULL DEFAULT NULL COMMENT '已租摊位',
  `not_rent` int NULL DEFAULT NULL COMMENT '未租摊位',
  `time` datetime NULL DEFAULT NULL COMMENT '投资时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '农贸市场表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of market
-- ----------------------------
INSERT INTO `market` VALUES (1, '三墩农贸市场', '三墩', '张三', '18715582750', '100', 50, 50, '2021-09-14 17:16:06');
INSERT INTO `market` VALUES (2, '蒋庄农贸市场', '蒋庄', '李四', '18055280956', '100', 49, 51, '2021-09-14 17:16:56');

-- ----------------------------
-- Table structure for stall
-- ----------------------------
DROP TABLE IF EXISTS `stall`;
CREATE TABLE `stall`  (
  `id` int NOT NULL,
  `market_id` int NOT NULL COMMENT '市场id',
  `place` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '摊位位置',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '出租状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = '摊位表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stall
-- ----------------------------
INSERT INTO `stall` VALUES (1, 1, '杭州', '已租');
INSERT INTO `stall` VALUES (2, 1, '杭州', '已租');

-- ----------------------------
-- Table structure for vendor
-- ----------------------------
DROP TABLE IF EXISTS `vendor`;
CREATE TABLE `vendor`  (
  `id` int NOT NULL,
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '姓名',
  `telphone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '联系电话',
  `working_group` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '类别',
  `signing` datetime NULL DEFAULT NULL COMMENT '签约日期',
  `expire` datetime NULL DEFAULT NULL COMMENT '到期日期',
  `rental` int NULL DEFAULT NULL COMMENT '摊位租金',
  `mode` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收费方式',
  `charging_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '收费时间',
  `shunt` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '分润比例',
  `bank` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '开户银行',
  `card_no` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '银行卡号',
  `market_id` int NULL DEFAULT NULL COMMENT '市场id',
  `stall_id` int NULL DEFAULT NULL COMMENT '摊位号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of vendor
-- ----------------------------
INSERT INTO `vendor` VALUES (1, '张三', '123456789', NULL, '2021-09-15 08:37:49', '2022-04-02 08:37:53', 100, '现金', '15', '80%', '中国农业银行', '123456789', 1, 1);
INSERT INTO `vendor` VALUES (3, 'zhangsan', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 2);

SET FOREIGN_KEY_CHECKS = 1;
