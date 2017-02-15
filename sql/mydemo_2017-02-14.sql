# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: 127.0.0.1 (MySQL 5.7.16)
# Database: mydemo
# Generation Time: 2017-02-14 09:29:03 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table user
# ------------------------------------------------------------

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(5) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_name` varchar(20) DEFAULT NULL COMMENT '用户名称',
  `password` varchar(30) DEFAULT NULL COMMENT '密码',
  `salt` varchar(10) DEFAULT NULL,
  `is_avaliable` int(1) DEFAULT '1' COMMENT '是否可用 1可用 0不可以',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;

INSERT INTO `user` (`id`, `user_name`, `password`, `salt`, `is_avaliable`)
VALUES
	(1,'name1','gdhcoc','salt',1),
	(2,'name2','y5iyai','salt',1),
	(3,'name3','hzlwbi','salt',1),
	(4,'name4','in8ul3','salt',1),
	(5,'name5','9jtjt7','salt',1),
	(6,'name6','0lrok7','salt',1),
	(7,'name7','i3678d','salt',1),
	(8,'name8','r6qqmr','salt',1),
	(9,'name9','sihp2a','salt',1),
	(10,'name10','7mulpx','salt',1),
	(11,'name11','qselk3','salt',1),
	(12,'name12','4pgdxf','salt',1),
	(13,'name13','8xm8jw','salt',1),
	(14,'name14','11ss0d','salt',1),
	(15,'name15','3k1vrg','salt',1),
	(16,'name16','knmmnc','salt',1),
	(17,'name17','zg6gc3','salt',1),
	(18,'name18','5wctxn','salt',1),
	(19,'name19','hqfei3','salt',1),
	(20,'name20','ruy94f','salt',1),
	(21,'name21','zupf7b','salt',1),
	(22,'name22','yqlslh','salt',1),
	(23,'name23','ckysip','salt',1),
	(24,'name24','ogj1t7','salt',1),
	(25,'name25','lnt6j4','salt',1),
	(26,'name26','kyim3k','salt',1),
	(27,'name27','ry07th','salt',1),
	(28,'name28','g379si','salt',1),
	(29,'name29','jbf4yw','salt',1),
	(30,'name30','2ax9xh','salt',1),
	(31,'name31','3c4xam','salt',1),
	(32,'name32','f87dti','salt',1),
	(33,'name33','1wh9n2','salt',1),
	(34,'name34','vdm5sv','salt',1),
	(35,'name35','gfse19','salt',1),
	(36,'name36','qdexhu','salt',1),
	(37,'name37','kycz2j','salt',1),
	(38,'name38','l3hbcm','salt',1),
	(39,'name39','yn7le8','salt',1),
	(40,'name40','xjemd1','salt',1),
	(41,'name41','qqzu5g','salt',1),
	(42,'name42','qznypc','salt',1),
	(43,'name43','tow0wv','salt',1),
	(44,'name44','haxa42','salt',1),
	(45,'name45','f4hche','salt',1),
	(46,'name46','z5gzyj','salt',1),
	(47,'name47','kgr69m','salt',1),
	(48,'name48','2aqye9','salt',1),
	(49,'name49','307lxh','salt',1),
	(50,'name50','qh5dc0','salt',1),
	(51,'name51','6jv5o7','salt',1),
	(52,'name52','me0olp','salt',1),
	(53,'name53','xi3b6b','salt',1),
	(54,'name54','tvqvjn','salt',1),
	(55,'name55','1ngsv5','salt',1),
	(56,'name56','3r2762','salt',1),
	(57,'name57','hpxc1a','salt',1),
	(58,'name58','homd9c','salt',1),
	(59,'name59','uunos8','salt',1),
	(60,'name60','dgvplq','salt',1),
	(61,'name61','0r9uq2','salt',1),
	(62,'name62','0607l8','salt',1),
	(63,'name63','r5716l','salt',1),
	(64,'name64','tlt7az','salt',1),
	(65,'name65','up69pr','salt',1),
	(66,'name66','qyhx3d','salt',1),
	(67,'name67','r0g9uf','salt',1),
	(68,'name68','v75mqb','salt',1),
	(69,'name69','zt62b6','salt',1),
	(70,'name70','jnqhlv','salt',1),
	(71,'name71','r4z00t','salt',1),
	(72,'name72','qg1wvz','salt',1),
	(73,'name73','5rywdt','salt',1),
	(74,'name74','8vwhfw','salt',1),
	(75,'name75','txmbuv','salt',1),
	(76,'name76','8yd0ck','salt',1),
	(77,'name77','35qquc','salt',1),
	(78,'name78','tog2ts','salt',1),
	(79,'name79','5kd9ou','salt',1),
	(80,'name80','p3znd4','salt',1),
	(81,'name81','sowh0a','salt',1),
	(82,'name82','vx9379','salt',1),
	(83,'name83','dvkpgn','salt',1),
	(84,'name84','yztvz7','salt',1),
	(85,'name85','2q8gsx','salt',1),
	(86,'name86','4dzkkz','salt',1),
	(87,'name87','j37nsg','salt',1),
	(88,'name88','wchq2c','salt',1),
	(89,'name89','dbojrn','salt',1),
	(90,'name90','4s81xs','salt',1),
	(91,'name91','i74bxi','salt',1),
	(92,'name92','3ijob4','salt',1),
	(93,'name93','ebmu4r','salt',1),
	(94,'name94','7pfr37','salt',1),
	(95,'name95','gc2bpa','salt',1),
	(96,'name96','380oth','salt',1),
	(97,'name97','je958p','salt',1),
	(98,'name98','opiips','salt',1),
	(99,'name99','pukn11','salt',1),
	(100,'name100','nfnom9','salt',1);

/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
