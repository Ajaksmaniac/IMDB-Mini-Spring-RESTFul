/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 100411
Source Host           : localhost:3306
Source Database       : imdbmini

Target Server Type    : MYSQL
Target Server Version : 100411
File Encoding         : 65001

Date: 2020-06-16 15:05:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `comment_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `text` varchar(255) NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `date_posted` date NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  `commented_by` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('1', 'Good movie', '1', '2020-06-01', null, null);
INSERT INTO `comment` VALUES ('2', 'Very Good Movie', '2', '2020-06-12', null, null);
INSERT INTO `comment` VALUES ('3', 'ASDDA', '1', '2020-06-12', null, null);
INSERT INTO `comment` VALUES ('4', 'Nice', '1', '2020-06-12', null, null);
INSERT INTO `comment` VALUES ('5', 'Nice', '1', '2020-06-12', null, null);
INSERT INTO `comment` VALUES ('6', 'Nice 2', '1', '2020-06-12', null, null);
INSERT INTO `comment` VALUES ('7', 'aaaaaaaaaaaaaa', '1', '2020-06-12', null, null);
INSERT INTO `comment` VALUES ('8', 'Veoma lep film', '8', '2020-06-13', null, null);
INSERT INTO `comment` VALUES ('9', 'Nice movie', '1', '2020-06-13', null, null);

-- ----------------------------
-- Table structure for group
-- ----------------------------
DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
  `group_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of group
-- ----------------------------
INSERT INTO `group` VALUES ('1', 'admin');
INSERT INTO `group` VALUES ('2', 'moderator');
INSERT INTO `group` VALUES ('3', 'member');

-- ----------------------------
-- Table structure for movie
-- ----------------------------
DROP TABLE IF EXISTS `movie`;
CREATE TABLE `movie` (
  `movie_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `date_of_release` varchar(4) NOT NULL,
  `rating` int(11) NOT NULL,
  `image_url` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of movie
-- ----------------------------
INSERT INTO `movie` VALUES ('1', 'Harry Potter and the Philosopher\'s Stone', '2001', '10', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT_9nrOnN8sYfZZHJ06EIBSoEO5qjx7uHHEs6VtKNplGVuGhZuC');
INSERT INTO `movie` VALUES ('2', 'Harry Potter and the Chamber of Secrets', '2002', '6', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTltzcooPkGcy1fKKqzSuO8U6S9XBpNDR9MuYc9SS_L5AbAn66O');
INSERT INTO `movie` VALUES ('3', 'Harry Potter and the Prisoner of Azkaban', '2006', '10', 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSkFf3MN_oao6q3gysHpVfJA2lICz2ckgXE2VoKRWEGk0huoKnQ');
INSERT INTO `movie` VALUES ('4', 'Harry Potter and the Goblet of Fire', '2008', '10', 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcSyXO9PGwU8Y2lv7JONiXLR7jHW4e8PyiCE6lTIVzWrZ8NvKpms');
INSERT INTO `movie` VALUES ('5', 'Harry Potter and the Order of the Phoenix', '4500', '10', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fencrypted-tbn2.gstatic.com%2Fimages%3Fq%3Dtbn%3AANd9GcQZ10ZR6pT7zu8NL5SZwy3CD0MT4Na0nthYik3CINP5fBhK1S2I&psig=AOvVaw2FvOEMSfc5CV_N68ZaaCux&ust=1592056281760000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCNDIq_y');
INSERT INTO `movie` VALUES ('6', 'Harry Potter and the Half-Blood Prince', '3005', '5', 'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcSkOhQV4xAUHlp179grxIcLZzu16ojGMNu0O7_Bqibvj6UsI-uk');
INSERT INTO `movie` VALUES ('7', 'Harry Potter and the Deathly Hallows - Part I', '3424', '2', 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTobkzVSJU5oZ9Pv_6bM0_o4RF_zFA9jyNwdHATG90vKxyhOk5x');
INSERT INTO `movie` VALUES ('8', 'Harry Potter and the Deathly Hallows – Part 2', '4500', '4', 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcTgXSuLAFerQGZdPCWv8EHI_ucQq6RTl3xf91F4aN54PDA_oCtB');
INSERT INTO `movie` VALUES ('9', 'The Lord of the Rings: The Fellowship of the Ring', '2004', '5', 'https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT9J7XACn3tlD6v4UXRMvT2wJN8FGCCPeh8U3RkZ6__tR4wGhSo');
INSERT INTO `movie` VALUES ('10', 'The Lord of the Rings: The Two Towers', '2002', '9', 'https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRQ8FDyks__YDKFPRm3Oj4Dd-yMl7pcGtgIM5IX-nd_6oJQrPiN');
INSERT INTO `movie` VALUES ('11', 'The Hobbit', '2012', '7', 'https://upload.wikimedia.org/wikipedia/en/thumb/a/a9/The_Hobbit_trilogy_dvd_cover.jpg/220px-The_Hobbit_trilogy_dvd_cover.jpg');

-- ----------------------------
-- Table structure for movie_comment
-- ----------------------------
DROP TABLE IF EXISTS `movie_comment`;
CREATE TABLE `movie_comment` (
  `movie_comment_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `movie_id` int(10) unsigned NOT NULL,
  `comment_id` int(10) unsigned NOT NULL,
  `user_id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`movie_comment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of movie_comment
-- ----------------------------
INSERT INTO `movie_comment` VALUES ('1', '1', '1', '1');
INSERT INTO `movie_comment` VALUES ('2', '1', '2', '2');
INSERT INTO `movie_comment` VALUES ('3', '1', '3', '1');
INSERT INTO `movie_comment` VALUES ('4', '2', '5', '1');
INSERT INTO `movie_comment` VALUES ('5', '2', '6', '1');
INSERT INTO `movie_comment` VALUES ('6', '4', '7', '1');
INSERT INTO `movie_comment` VALUES ('7', '2', '8', '8');
INSERT INTO `movie_comment` VALUES ('8', '11', '9', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL DEFAULT '',
  `token` varchar(255) DEFAULT NULL,
  `group_id` int(10) unsigned NOT NULL,
  `is_admin` bit(1) NOT NULL,
  PRIMARY KEY (`user_id`),
  KEY `fk_user_group_id` (`group_id`),
  CONSTRAINT `fk_user_group_id` FOREIGN KEY (`group_id`) REFERENCES `group` (`group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'ajakaca@gmail.com', 'Ajaksmaniac', '123', 'x0xJJUteKVfP3vp44pVkpQA', '1', '');
INSERT INTO `user` VALUES ('2', 'test@mail.com', 'test', '123', null, '2', '\0');
INSERT INTO `user` VALUES ('3', 'admin@mail.com', 'admin', '123', null, '1', '\0');
INSERT INTO `user` VALUES ('4', 'TestMail', 'admin1', 'admin', 'ENK8NHtdRj6PrVLNHpKUj33', '3', '\0');
INSERT INTO `user` VALUES ('5', 'test5', 'test5', 'test', null, '3', '\0');
INSERT INTO `user` VALUES ('6', 'test3', 'test4', 'test', null, '3', '\0');
INSERT INTO `user` VALUES ('7', 'test', 'test4', 'tet', null, '3', '\0');
INSERT INTO `user` VALUES ('8', 'isidora@mail.com', 'isidora', '123', 'tasY3ujXt7Ar2Ac21QQr07u', '3', '\0');
SET FOREIGN_KEY_CHECKS=1;
