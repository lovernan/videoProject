/*
SQLyog Ultimate v12.08 (64 bit)
MySQL - 5.0.96-community-nt : Database - videoproject
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`videoproject` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `videoproject`;

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `cid` int(11) unsigned NOT NULL auto_increment,
  `username1` varchar(255) character set utf8 default NULL,
  `username2` varchar(255) character set utf8 default NULL,
  `vid` int(11) unsigned default NULL,
  `content` varchar(11) character set utf8 default NULL,
  `verified` int(11) unsigned default NULL,
  `avator` varchar(255) character set utf8 default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `comment` */

insert  into `comment`(`cid`,`username1`,`username2`,`vid`,`content`,`verified`,`avator`) values (1,'幸福着你的幸福','幸福',4,'ddas',0,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132'),(2,'幸福着你的幸福','幸福',4,'d1',0,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132'),(3,'幸福着你的幸福','幸福',4,'d',0,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132'),(4,'幸福着你的幸福','幸福',4,'',0,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132');

/*Table structure for table `complaint` */

DROP TABLE IF EXISTS `complaint`;

CREATE TABLE `complaint` (
  `cid` int(11) unsigned NOT NULL auto_increment,
  `uid` int(11) unsigned default NULL,
  `vid` int(11) unsigned default NULL,
  `content` varchar(11) character set utf8 default NULL,
  `verified` int(11) unsigned default NULL,
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `complaint` */

insert  into `complaint`(`cid`,`uid`,`vid`,`content`,`verified`) values (1,6,4,'著什麽傻逼英文',NULL),(2,6,4,'的撒大苏打',0);

/*Table structure for table `history` */

DROP TABLE IF EXISTS `history`;

CREATE TABLE `history` (
  `hid` int(11) unsigned NOT NULL auto_increment,
  `vid` int(11) default NULL,
  `uid` int(11) default NULL,
  `top_class` int(11) default NULL,
  `sub_class` int(11) default NULL,
  PRIMARY KEY  (`hid`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1;

/*Data for the table `history` */

insert  into `history`(`hid`,`vid`,`uid`,`top_class`,`sub_class`) values (1,4,6,1,2),(2,4,6,1,2),(3,4,6,1,2),(4,11,6,2,0),(5,4,6,1,2),(6,4,6,1,2),(7,4,6,1,2),(8,4,6,1,2),(9,4,6,1,2),(10,4,6,1,2),(11,4,6,1,2),(12,4,6,1,2),(13,4,6,1,2),(14,4,6,1,2),(15,4,6,1,2),(16,4,6,1,2),(17,4,6,1,2),(18,4,6,1,2),(19,4,6,1,2),(20,8,6,1,2),(21,4,6,1,2),(22,4,6,1,2),(23,4,6,1,2),(24,4,6,1,2),(25,4,6,1,2),(26,4,6,1,2),(27,4,6,1,2),(28,4,6,1,2),(29,4,6,1,2),(30,4,6,1,2);

/*Table structure for table `manager` */

DROP TABLE IF EXISTS `manager`;

CREATE TABLE `manager` (
  `mid` int(11) unsigned NOT NULL auto_increment,
  `manager_name` varchar(11) default NULL,
  PRIMARY KEY  (`mid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manager` */

/*Table structure for table `sub_class` */

DROP TABLE IF EXISTS `sub_class`;

CREATE TABLE `sub_class` (
  `sub_id` int(11) unsigned NOT NULL auto_increment,
  `class_name` varchar(11) default NULL,
  `top_class` int(11) unsigned default NULL,
  PRIMARY KEY  (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sub_class` */

/*Table structure for table `top_class` */

DROP TABLE IF EXISTS `top_class`;

CREATE TABLE `top_class` (
  `top_id` int(11) unsigned NOT NULL auto_increment,
  `class_name` varchar(11) default NULL,
  PRIMARY KEY  (`top_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `top_class` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `uid` int(11) unsigned NOT NULL auto_increment,
  `avator` varchar(255) character set utf8 default NULL,
  `score` int(11) unsigned default NULL,
  `username` varchar(255) character set utf8 default NULL,
  PRIMARY KEY  (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert  into `user`(`uid`,`avator`,`score`,`username`) values (1,'ss',100,'hhh'),(6,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132',988,'undefined'),(7,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132',1000,NULL),(8,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132',1000,NULL),(9,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132',1000,NULL),(10,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132',1000,NULL),(11,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132',1000,'sssss'),(12,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132',1000,'幸福着你的幸福'),(13,'https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132',1000,'幸福着你的幸福');

/*Table structure for table `video` */

DROP TABLE IF EXISTS `video`;

CREATE TABLE `video` (
  `vid` int(11) unsigned NOT NULL auto_increment,
  `videoname` varchar(255) character set utf8 default NULL,
  `uid` int(11) default NULL,
  `verified` int(11) unsigned default NULL,
  `score` int(10) unsigned default NULL,
  `topclass` int(11) unsigned default NULL,
  `subclass` int(11) unsigned default NULL,
  `url` varchar(255) character set utf8 default NULL,
  `avator` varchar(255) character set utf8 default NULL,
  `username` varchar(255) character set utf8 default NULL,
  PRIMARY KEY  (`vid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `video` */

insert  into `video`(`vid`,`videoname`,`uid`,`verified`,`score`,`topclass`,`subclass`,`url`,`avator`,`username`) values (4,'sadads',1,0,12,1,2,'https://www.whxlover.cn/pic/mis/video/880dd65a-3885-454f-968e-0b1ea076e110.mp4','https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132','幸福'),(5,'dasdas',1,0,12,1,2,'https://www.whxlover.cn/pic/mis/video/307c82b3-b148-4878-b1af-4f923f1447c3.mp4','https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132','幸福'),(6,'sdada',1,0,12,1,2,'https://www.whxlover.cn/pic/mis/video/c9f241f0-edd6-4af6-9464-540349c3c27e.mp4','https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132','幸福'),(7,'1w',1,0,12,1,2,'https://www.whxlover.cn/pic/mis/video/21916ad5-23f4-4385-9130-65604e0c1cfb.mp4','https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132','幸福'),(8,'ewqeqwe',6,0,11,1,2,'https://www.whxlover.cn/pic/mis/video/90bacb3c-00dd-4c47-a610-7fadc331162b.mp4','https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132','幸福'),(9,'czxkhcjzkxhc',6,0,11,1,3,'https://www.whxlover.cn/pic/mis/video/b3d36d44-46ab-49b8-a30f-338115761bb8.mp4','https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132','幸福'),(11,'2esda',6,0,1,2,0,'https://www.whxlover.cn/pic/mis/video/017ac643-c8bf-40ef-8f5b-693f88391ae7.mp4','https://wx.qlogo.cn/mmopen/vi_32/2Wn9yHJT3F9YAmOYUBrvtFDqblHej16EvzMt5mVswnUZRGbZOVm4Eia8RibNRm6ibuqcxn01zhenibdoro9Q5QGOcg/132','幸福着你的幸福');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
