/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : rentme

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 26/03/2022 21:49:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for area
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `city_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `city_state_id`(`city_id`) USING BTREE,
  CONSTRAINT `area_ibfk_1` FOREIGN KEY (`city_id`) REFERENCES `state` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 92 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of area
-- ----------------------------

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `state_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `city_state_id`(`state_id`) USING BTREE,
  CONSTRAINT `city_state_id` FOREIGN KEY (`state_id`) REFERENCES `state` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 91 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, 'Sydney', 1);
INSERT INTO `city` VALUES (2, 'Albury', 1);
INSERT INTO `city` VALUES (3, 'Armidale', 1);
INSERT INTO `city` VALUES (4, 'Bathurst', 1);
INSERT INTO `city` VALUES (5, 'Broken Hill', 1);
INSERT INTO `city` VALUES (6, 'Cessnock', 1);
INSERT INTO `city` VALUES (7, 'Coffs Harbour', 1);
INSERT INTO `city` VALUES (8, 'Dubbo', 1);
INSERT INTO `city` VALUES (9, 'Gosford', 1);
INSERT INTO `city` VALUES (10, 'Goulburn', 1);
INSERT INTO `city` VALUES (11, 'Grafton', 1);
INSERT INTO `city` VALUES (12, 'Griffith', 1);
INSERT INTO `city` VALUES (13, 'Lake Macquarie', 1);
INSERT INTO `city` VALUES (14, 'Lismore', 1);
INSERT INTO `city` VALUES (15, 'Maitland', 1);
INSERT INTO `city` VALUES (16, 'Newcastle', 1);
INSERT INTO `city` VALUES (17, 'Nowra', 1);
INSERT INTO `city` VALUES (18, 'Orange', 1);
INSERT INTO `city` VALUES (19, 'Port Macquarie', 1);
INSERT INTO `city` VALUES (20, 'Queanbeyan', 1);
INSERT INTO `city` VALUES (21, 'Tamworth', 1);
INSERT INTO `city` VALUES (22, 'Tweed Heads', 1);
INSERT INTO `city` VALUES (23, 'Wagga Wagga', 1);
INSERT INTO `city` VALUES (24, 'Wollongong', 1);
INSERT INTO `city` VALUES (25, 'Wyong', 1);
INSERT INTO `city` VALUES (26, 'Melbourne', 2);
INSERT INTO `city` VALUES (27, 'Ararat', 2);
INSERT INTO `city` VALUES (28, 'Benalla', 2);
INSERT INTO `city` VALUES (29, 'Ballarat', 2);
INSERT INTO `city` VALUES (30, 'Bendigo', 2);
INSERT INTO `city` VALUES (31, 'Geelong', 2);
INSERT INTO `city` VALUES (32, 'Mildura', 2);
INSERT INTO `city` VALUES (33, 'Shepparton', 2);
INSERT INTO `city` VALUES (34, 'Swan Hill', 2);
INSERT INTO `city` VALUES (35, 'Wangaratta', 2);
INSERT INTO `city` VALUES (36, 'Warrnambool', 2);
INSERT INTO `city` VALUES (37, 'Wodonga', 2);
INSERT INTO `city` VALUES (38, 'Maryborough', 2);
INSERT INTO `city` VALUES (39, 'Brisbane', 3);
INSERT INTO `city` VALUES (40, 'Bundaberg', 3);
INSERT INTO `city` VALUES (41, 'Cairns', 3);
INSERT INTO `city` VALUES (42, 'Coolangatta', 3);
INSERT INTO `city` VALUES (43, 'Gladstone', 3);
INSERT INTO `city` VALUES (44, 'Gold Coast region', 3);
INSERT INTO `city` VALUES (45, 'Gympie', 3);
INSERT INTO `city` VALUES (46, 'Hervey Bay region', 3);
INSERT INTO `city` VALUES (47, 'Ipswich', 3);
INSERT INTO `city` VALUES (48, 'Logan', 3);
INSERT INTO `city` VALUES (49, 'Mackay', 3);
INSERT INTO `city` VALUES (50, 'Maryborough', 3);
INSERT INTO `city` VALUES (51, 'Mount Isa', 3);
INSERT INTO `city` VALUES (52, 'Southport', 3);
INSERT INTO `city` VALUES (53, 'Rockhampton', 3);
INSERT INTO `city` VALUES (54, 'Sunshine Coast region', 3);
INSERT INTO `city` VALUES (55, 'Toowoomba', 3);
INSERT INTO `city` VALUES (56, 'Townsville', 3);
INSERT INTO `city` VALUES (57, 'Perth', 4);
INSERT INTO `city` VALUES (58, 'Albany', 4);
INSERT INTO `city` VALUES (59, 'Broome', 4);
INSERT INTO `city` VALUES (60, 'Bunbury', 4);
INSERT INTO `city` VALUES (61, 'Geraldton', 4);
INSERT INTO `city` VALUES (62, 'Fremantle', 4);
INSERT INTO `city` VALUES (63, 'Kalgoorlie', 4);
INSERT INTO `city` VALUES (64, 'Mandurah', 4);
INSERT INTO `city` VALUES (65, 'Port Hedland', 4);
INSERT INTO `city` VALUES (66, 'Adelaide', 5);
INSERT INTO `city` VALUES (67, 'Mount gambier', 5);
INSERT INTO `city` VALUES (68, 'Merry bridge', 5);
INSERT INTO `city` VALUES (69, 'Augusta Port', 5);
INSERT INTO `city` VALUES (70, 'Piedang', 5);
INSERT INTO `city` VALUES (71, 'Lincoln Port', 5);
INSERT INTO `city` VALUES (72, 'Victor Harbor', 5);
INSERT INTO `city` VALUES (73, 'Whyalla', 5);
INSERT INTO `city` VALUES (74, 'Hobart', 6);
INSERT INTO `city` VALUES (75, 'Burnie', 6);
INSERT INTO `city` VALUES (76, 'Calnens', 6);
INSERT INTO `city` VALUES (77, 'Devonport', 6);
INSERT INTO `city` VALUES (78, 'Port Arthur', 6);
INSERT INTO `city` VALUES (79, 'Grannech', 6);
INSERT INTO `city` VALUES (80, 'Launceston', 6);
INSERT INTO `city` VALUES (81, 'Ross', 6);
INSERT INTO `city` VALUES (82, 'Richmon', 6);
INSERT INTO `city` VALUES (83, 'Bruny Island', 6);
INSERT INTO `city` VALUES (84, 'Wengelas Bay', 6);
INSERT INTO `city` VALUES (85, 'Cradle mountain', 6);
INSERT INTO `city` VALUES (86, 'Gordon Dam', 6);
INSERT INTO `city` VALUES (87, 'Stran', 6);
INSERT INTO `city` VALUES (88, 'Darwin', 7);
INSERT INTO `city` VALUES (89, 'Alice Springs', 7);
INSERT INTO `city` VALUES (90, 'Katherine', 7);
INSERT INTO `city` VALUES (91, 'Palmerston', 7);
INSERT INTO `city` VALUES (92, 'Canberra\r\n', 8);

-- ----------------------------
-- Table structure for state
-- ----------------------------
DROP TABLE IF EXISTS `state`;
CREATE TABLE `state`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `state` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of state
-- ----------------------------
INSERT INTO `state` VALUES (1, 'New South Wales');
INSERT INTO `state` VALUES (2, 'Victoria');
INSERT INTO `state` VALUES (3, 'Queensland');
INSERT INTO `state` VALUES (4, 'Western Australia');
INSERT INTO `state` VALUES (5, 'South Australia（SA）');
INSERT INTO `state` VALUES (6, 'Tasmania');
INSERT INTO `state` VALUES (7, 'Northern Territory');
INSERT INTO `state` VALUES (8, 'ACT');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `account` varchar(55) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `password` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `phone` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `email` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `city_id` int NULL DEFAULT NULL,
  `base_search` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `search_input_val` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `search_input_text` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `hid_type_val` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `users_city_id`(`city_id`) USING BTREE,
  CONSTRAINT `users_city_id` FOREIGN KEY (`city_id`) REFERENCES `city` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 26 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (13, 'admin', '111', '18079838928', '20393489@qq.com', 27, 'allhomes:Apartment,propertyTypes:UNIT,Bedrooms:,Bathrooms:,Parking:,', '', '', '');

SET FOREIGN_KEY_CHECKS = 1;
