-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springboot9a097266
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `springboot9a097266`
--

/*!40000 DROP DATABASE IF EXISTS `springboot9a097266`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `springboot9a097266` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `springboot9a097266`;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `address` varchar(200) NOT NULL COMMENT '地址',
  `name` varchar(200) NOT NULL COMMENT '收货人',
  `phone` varchar(200) NOT NULL COMMENT '电话',
  `isdefault` varchar(200) NOT NULL COMMENT '是否默认地址[是/否]',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COMMENT='地址';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'2023-12-15 07:41:35',11,'宇宙银河系金星1号','金某','13823888881','是'),(2,'2023-12-15 07:41:35',12,'宇宙银河系木星1号','木某','13823888882','是'),(3,'2023-12-15 07:41:35',13,'宇宙银河系水星1号','水某','13823888883','是'),(4,'2023-12-15 07:41:35',14,'宇宙银河系火星1号','火某','13823888884','是'),(5,'2023-12-15 07:41:35',15,'宇宙银河系土星1号','土某','13823888885','是'),(6,'2023-12-15 07:41:35',16,'宇宙银河系月球1号','月某','13823888886','是'),(7,'2023-12-15 07:41:35',17,'宇宙银河系黑洞1号','黑某','13823888887','是'),(8,'2023-12-15 07:41:35',18,'宇宙银河系地球1号','地某','13823888888','是');
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COMMENT '提问',
  `reply` longtext COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=150 DEFAULT CHARSET=utf8 COMMENT='健康咨询';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (141,'2023-12-15 07:41:35',1,1,'提问1','回复1',1),(142,'2023-12-15 07:41:35',2,2,'提问2','回复2',2),(143,'2023-12-15 07:41:35',3,3,'提问3','回复3',3),(144,'2023-12-15 07:41:35',4,4,'提问4','回复4',4),(145,'2023-12-15 07:41:35',5,5,'提问5','回复5',5),(146,'2023-12-15 07:41:35',6,6,'提问6','回复6',6),(147,'2023-12-15 07:41:35',7,7,'提问7','回复7',7),(148,'2023-12-15 07:41:35',8,8,'提问8','回复8',8),(149,'2023-12-15 07:51:31',1702626497399,NULL,'咨询客服',NULL,1);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL),(2,'picture2','upload/picture2.jpg',NULL),(3,'picture3','upload/picture3.jpg',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussjiankangzhishiku`
--

DROP TABLE IF EXISTS `discussjiankangzhishiku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussjiankangzhishiku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COMMENT '头像',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='健康知识库评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussjiankangzhishiku`
--

LOCK TABLES `discussjiankangzhishiku` WRITE;
/*!40000 ALTER TABLE `discussjiankangzhishiku` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussjiankangzhishiku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `forum`
--

DROP TABLE IF EXISTS `forum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `forum` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) DEFAULT NULL COMMENT '帖子标题',
  `content` longtext NOT NULL COMMENT '帖子内容',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父节点id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `avatarurl` longtext COMMENT '头像',
  `isdone` varchar(200) DEFAULT NULL COMMENT '状态',
  `istop` int(11) DEFAULT '0' COMMENT '是否置顶',
  `toptime` datetime DEFAULT NULL COMMENT '置顶时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=utf8 COMMENT='社区互动';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `forum`
--

LOCK TABLES `forum` WRITE;
/*!40000 ALTER TABLE `forum` DISABLE KEYS */;
INSERT INTO `forum` VALUES (151,'2023-12-15 07:41:35','帖子标题1','帖子内容1',0,1,'用户名1','upload/forum_avatarurl1.jpg,upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg','开放',0,'2023-12-15 15:41:35'),(152,'2023-12-15 07:41:35','帖子标题2','帖子内容2',0,2,'用户名2','upload/forum_avatarurl2.jpg,upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg','开放',0,'2023-12-15 15:41:35'),(153,'2023-12-15 07:41:35','帖子标题3','帖子内容3',0,3,'用户名3','upload/forum_avatarurl3.jpg,upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg','开放',0,'2023-12-15 15:41:35'),(154,'2023-12-15 07:41:35','帖子标题4','帖子内容4',0,4,'用户名4','upload/forum_avatarurl4.jpg,upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg','开放',0,'2023-12-15 15:41:35'),(155,'2023-12-15 07:41:35','帖子标题5','帖子内容5',0,5,'用户名5','upload/forum_avatarurl5.jpg,upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg','开放',0,'2023-12-15 15:41:35'),(156,'2023-12-15 07:41:35','帖子标题6','帖子内容6',0,6,'用户名6','upload/forum_avatarurl6.jpg,upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg','开放',0,'2023-12-15 15:41:35'),(157,'2023-12-15 07:41:35','帖子标题7','帖子内容7',0,7,'用户名7','upload/forum_avatarurl7.jpg,upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg','开放',0,'2023-12-15 15:41:35'),(158,'2023-12-15 07:41:35','帖子标题8','帖子内容8',0,8,'用户名8','upload/forum_avatarurl8.jpg,upload/forum_avatarurl9.jpg,upload/forum_avatarurl10.jpg','开放',0,'2023-12-15 15:41:35');
/*!40000 ALTER TABLE `forum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangpinggu`
--

DROP TABLE IF EXISTS `jiankangpinggu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangpinggu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` varchar(200) DEFAULT NULL COMMENT '日期',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `pinggudengji` varchar(200) DEFAULT NULL COMMENT '评估等级',
  `pinggubaogao` longtext COMMENT '评估报告',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COMMENT='健康评估';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangpinggu`
--

LOCK TABLES `jiankangpinggu` WRITE;
/*!40000 ALTER TABLE `jiankangpinggu` DISABLE KEYS */;
INSERT INTO `jiankangpinggu` VALUES (101,'2023-12-15 07:41:35','日期1','状态1','★','评估报告1','用户1',1),(102,'2023-12-15 07:41:35','日期2','状态2','★','评估报告2','用户2',2),(103,'2023-12-15 07:41:35','日期3','状态3','★','评估报告3','用户3',3),(104,'2023-12-15 07:41:35','日期4','状态4','★','评估报告4','用户4',4),(105,'2023-12-15 07:41:35','日期5','状态5','★','评估报告5','用户5',5),(106,'2023-12-15 07:41:35','日期6','状态6','★','评估报告6','用户6',6),(107,'2023-12-15 07:41:35','日期7','状态7','★','评估报告7','用户7',7),(108,'2023-12-15 07:41:35','日期8','状态8','★','评估报告8','用户8',8);
/*!40000 ALTER TABLE `jiankangpinggu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangtixing`
--

DROP TABLE IF EXISTS `jiankangtixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangtixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `tixingxiangmu` varchar(200) DEFAULT NULL COMMENT '提醒项目',
  `tixingneirong` longtext COMMENT '提醒内容',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=119 DEFAULT CHARSET=utf8 COMMENT='健康提醒';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangtixing`
--

LOCK TABLES `jiankangtixing` WRITE;
/*!40000 ALTER TABLE `jiankangtixing` DISABLE KEYS */;
INSERT INTO `jiankangtixing` VALUES (111,'2023-12-15 07:41:35','2023-12-15','提醒项目1','提醒内容1','用户1',1),(112,'2023-12-15 07:41:35','2023-12-15','提醒项目2','提醒内容2','用户2',2),(113,'2023-12-15 07:41:35','2023-12-15','提醒项目3','提醒内容3','用户3',3),(114,'2023-12-15 07:41:35','2023-12-15','提醒项目4','提醒内容4','用户4',4),(115,'2023-12-15 07:41:35','2023-12-15','提醒项目5','提醒内容5','用户5',5),(116,'2023-12-15 07:41:35','2023-12-15','提醒项目6','提醒内容6','用户6',6),(117,'2023-12-15 07:41:35','2023-12-15','提醒项目7','提醒内容7','用户7',7),(118,'2023-12-15 07:41:35','2023-12-15','提醒项目8','提醒内容8','用户8',8);
/*!40000 ALTER TABLE `jiankangtixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangxinxi`
--

DROP TABLE IF EXISTS `jiankangxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` varchar(200) DEFAULT NULL COMMENT '日期',
  `zhuangtai` varchar(200) DEFAULT NULL COMMENT '状态',
  `tizhong` double DEFAULT NULL COMMENT '体重(kg)',
  `xueya` double DEFAULT NULL COMMENT '血压(mmHg)',
  `xuezhi` double DEFAULT NULL COMMENT '血脂(mg/dL)',
  `xuetang` double DEFAULT NULL COMMENT '血糖(mg/dL)',
  `xinlv` double DEFAULT NULL COMMENT '心率(次/分)',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8 COMMENT='健康信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangxinxi`
--

LOCK TABLES `jiankangxinxi` WRITE;
/*!40000 ALTER TABLE `jiankangxinxi` DISABLE KEYS */;
INSERT INTO `jiankangxinxi` VALUES (91,'2023-12-15 07:41:35','日期1','良好',1,1,1,1,1,'用户1',1),(92,'2023-12-15 07:41:35','日期2','良好',2,2,2,2,2,'用户2',2),(93,'2023-12-15 07:41:35','日期3','良好',3,3,3,3,3,'用户3',3),(94,'2023-12-15 07:41:35','日期4','良好',4,4,4,4,4,'用户4',4),(95,'2023-12-15 07:41:35','日期5','良好',5,5,5,5,5,'用户5',5),(96,'2023-12-15 07:41:35','日期6','良好',6,6,6,6,6,'用户6',6),(97,'2023-12-15 07:41:35','日期7','良好',7,7,7,7,7,'用户7',7),(98,'2023-12-15 07:41:35','日期8','良好',8,8,8,8,8,'用户8',8),(99,'2023-12-15 07:50:46','18号','良好',136,80,80,80,60,'111',1702626497399);
/*!40000 ALTER TABLE `jiankangxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiankangzhishiku`
--

DROP TABLE IF EXISTS `jiankangzhishiku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiankangzhishiku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhishimingcheng` varchar(200) DEFAULT NULL COMMENT '知识名称',
  `zhishileixing` varchar(200) DEFAULT NULL COMMENT '知识类型',
  `zhishijianjie` longtext COMMENT '知识简介',
  `zhishishipin` longtext COMMENT '知识视频',
  `fabushijian` date DEFAULT NULL COMMENT '发布时间',
  `zhishitupian` longtext COMMENT '知识图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8 COMMENT='健康知识库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiankangzhishiku`
--

LOCK TABLES `jiankangzhishiku` WRITE;
/*!40000 ALTER TABLE `jiankangzhishiku` DISABLE KEYS */;
INSERT INTO `jiankangzhishiku` VALUES (21,'2023-12-15 07:41:34','知识名称1','知识类型1','知识简介1','','2023-12-15','upload/jiankangzhishiku_zhishitupian1.jpg,upload/jiankangzhishiku_zhishitupian2.jpg,upload/jiankangzhishiku_zhishitupian3.jpg',2,1,0,2),(22,'2023-12-15 07:41:34','知识名称2','知识类型2','知识简介2','','2023-12-15','upload/jiankangzhishiku_zhishitupian2.jpg,upload/jiankangzhishiku_zhishitupian3.jpg,upload/jiankangzhishiku_zhishitupian4.jpg',2,2,0,2),(23,'2023-12-15 07:41:34','知识名称3','知识类型3','知识简介3','','2023-12-15','upload/jiankangzhishiku_zhishitupian3.jpg,upload/jiankangzhishiku_zhishitupian4.jpg,upload/jiankangzhishiku_zhishitupian5.jpg',3,3,0,3),(24,'2023-12-15 07:41:34','知识名称4','知识类型4','知识简介4','','2023-12-15','upload/jiankangzhishiku_zhishitupian4.jpg,upload/jiankangzhishiku_zhishitupian5.jpg,upload/jiankangzhishiku_zhishitupian6.jpg',4,4,0,4),(25,'2023-12-15 07:41:34','知识名称5','知识类型5','知识简介5','','2023-12-15','upload/jiankangzhishiku_zhishitupian5.jpg,upload/jiankangzhishiku_zhishitupian6.jpg,upload/jiankangzhishiku_zhishitupian7.jpg',5,5,0,5),(26,'2023-12-15 07:41:34','知识名称6','知识类型6','知识简介6','','2023-12-15','upload/jiankangzhishiku_zhishitupian6.jpg,upload/jiankangzhishiku_zhishitupian7.jpg,upload/jiankangzhishiku_zhishitupian8.jpg',6,6,0,6),(27,'2023-12-15 07:41:34','知识名称7','知识类型7','知识简介7','','2023-12-15','upload/jiankangzhishiku_zhishitupian7.jpg,upload/jiankangzhishiku_zhishitupian8.jpg,upload/jiankangzhishiku_zhishitupian9.jpg',7,7,0,7),(28,'2023-12-15 07:41:34','知识名称8','知识类型8','知识简介8','','2023-12-15','upload/jiankangzhishiku_zhishitupian8.jpg,upload/jiankangzhishiku_zhishitupian9.jpg,upload/jiankangzhishiku_zhishitupian10.jpg',8,8,0,8);
/*!40000 ALTER TABLE `jiankangzhishiku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meiriyinshi`
--

DROP TABLE IF EXISTS `meiriyinshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `meiriyinshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `zaocan` varchar(200) DEFAULT NULL COMMENT '早餐',
  `wancan` varchar(200) DEFAULT NULL COMMENT '晚餐',
  `zhongcan` varchar(200) DEFAULT NULL COMMENT '中餐',
  `beizhu` varchar(200) DEFAULT NULL COMMENT '备注',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COMMENT='每日饮食';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meiriyinshi`
--

LOCK TABLES `meiriyinshi` WRITE;
/*!40000 ALTER TABLE `meiriyinshi` DISABLE KEYS */;
INSERT INTO `meiriyinshi` VALUES (51,'2023-12-15 07:41:34','2023-12-15','早餐1','晚餐1','中餐1','备注1','用户1',1),(52,'2023-12-15 07:41:34','2023-12-15','早餐2','晚餐2','中餐2','备注2','用户2',2),(53,'2023-12-15 07:41:34','2023-12-15','早餐3','晚餐3','中餐3','备注3','用户3',3),(54,'2023-12-15 07:41:34','2023-12-15','早餐4','晚餐4','中餐4','备注4','用户4',4),(55,'2023-12-15 07:41:34','2023-12-15','早餐5','晚餐5','中餐5','备注5','用户5',5),(56,'2023-12-15 07:41:34','2023-12-15','早餐6','晚餐6','中餐6','备注6','用户6',6),(57,'2023-12-15 07:41:34','2023-12-15','早餐7','晚餐7','中餐7','备注7','用户7',7),(58,'2023-12-15 07:41:34','2023-12-15','早餐8','晚餐8','中餐8','备注8','用户8',8),(59,'2023-12-15 07:49:22','2023-12-15','XX','XX','XX','XX','111',1702626497399);
/*!40000 ALTER TABLE `meiriyinshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mubiaogenzongyubaogao`
--

DROP TABLE IF EXISTS `mubiaogenzongyubaogao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mubiaogenzongyubaogao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `mubiaotizhong` varchar(200) DEFAULT NULL COMMENT '目标体重',
  `dangqiantizhong` varchar(200) DEFAULT NULL COMMENT '当前体重',
  `jinzhanqingkuang` longtext COMMENT '进展情况',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=140 DEFAULT CHARSET=utf8 COMMENT='目标跟踪与报告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mubiaogenzongyubaogao`
--

LOCK TABLES `mubiaogenzongyubaogao` WRITE;
/*!40000 ALTER TABLE `mubiaogenzongyubaogao` DISABLE KEYS */;
INSERT INTO `mubiaogenzongyubaogao` VALUES (131,'2023-12-15 07:41:35','2023-12-15','目标体重1','当前体重1','进展情况1','用户1',1),(132,'2023-12-15 07:41:35','2023-12-15','目标体重2','当前体重2','进展情况2','用户2',2),(133,'2023-12-15 07:41:35','2023-12-15','目标体重3','当前体重3','进展情况3','用户3',3),(134,'2023-12-15 07:41:35','2023-12-15','目标体重4','当前体重4','进展情况4','用户4',4),(135,'2023-12-15 07:41:35','2023-12-15','目标体重5','当前体重5','进展情况5','用户5',5),(136,'2023-12-15 07:41:35','2023-12-15','目标体重6','当前体重6','进展情况6','用户6',6),(137,'2023-12-15 07:41:35','2023-12-15','目标体重7','当前体重7','进展情况7','用户7',7),(138,'2023-12-15 07:41:35','2023-12-15','目标体重8','当前体重8','进展情况8','用户8',8),(139,'2023-12-15 07:51:15','2023-12-15','130','132','xxxx','111',1702626497399);
/*!40000 ALTER TABLE `mubiaogenzongyubaogao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shishibushuhehuodongzhuizong`
--

DROP TABLE IF EXISTS `shishibushuhehuodongzhuizong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shishibushuhehuodongzhuizong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `huodongxiangmu` varchar(200) DEFAULT NULL COMMENT '活动项目',
  `huodongbushu` varchar(200) DEFAULT NULL COMMENT '活动步数',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=utf8 COMMENT='实时步数和活动追踪';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shishibushuhehuodongzhuizong`
--

LOCK TABLES `shishibushuhehuodongzhuizong` WRITE;
/*!40000 ALTER TABLE `shishibushuhehuodongzhuizong` DISABLE KEYS */;
INSERT INTO `shishibushuhehuodongzhuizong` VALUES (121,'2023-12-15 07:41:35','2023-12-15','活动项目1','活动步数1','用户1',1),(122,'2023-12-15 07:41:35','2023-12-15','活动项目2','活动步数2','用户2',2),(123,'2023-12-15 07:41:35','2023-12-15','活动项目3','活动步数3','用户3',3),(124,'2023-12-15 07:41:35','2023-12-15','活动项目4','活动步数4','用户4',4),(125,'2023-12-15 07:41:35','2023-12-15','活动项目5','活动步数5','用户5',5),(126,'2023-12-15 07:41:35','2023-12-15','活动项目6','活动步数6','用户6',6),(127,'2023-12-15 07:41:35','2023-12-15','活动项目7','活动步数7','用户7',7),(128,'2023-12-15 07:41:35','2023-12-15','活动项目8','活动步数8','用户8',8),(129,'2023-12-15 07:51:02','2023-12-15','XX项目','25555','111',1702626497399);
/*!40000 ALTER TABLE `shishibushuhehuodongzhuizong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiwuyingyang`
--

DROP TABLE IF EXISTS `shiwuyingyang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiwuyingyang` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `mingcheng` varchar(200) DEFAULT NULL COMMENT '名称',
  `leixing` varchar(200) DEFAULT NULL COMMENT '类型',
  `danbaizhi` varchar(200) DEFAULT NULL COMMENT '蛋白质',
  `reliang` varchar(200) DEFAULT NULL COMMENT '热量',
  `zhifang` varchar(200) DEFAULT NULL COMMENT '脂肪',
  `tanshuihuahewu` varchar(200) DEFAULT NULL COMMENT '碳水化合物',
  `kuangwuzhi` varchar(200) DEFAULT NULL COMMENT '矿物质',
  `weishengsu` varchar(200) DEFAULT NULL COMMENT '维生素',
  `tupian` longtext COMMENT '图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=49 DEFAULT CHARSET=utf8 COMMENT='食物营养';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiwuyingyang`
--

LOCK TABLES `shiwuyingyang` WRITE;
/*!40000 ALTER TABLE `shiwuyingyang` DISABLE KEYS */;
INSERT INTO `shiwuyingyang` VALUES (41,'2023-12-15 07:41:34','名称1','脂肪类','蛋白质1','热量1','脂肪1','碳水化合物1','矿物质1','维生素1','upload/shiwuyingyang_tupian1.jpg,upload/shiwuyingyang_tupian2.jpg,upload/shiwuyingyang_tupian3.jpg'),(42,'2023-12-15 07:41:34','名称2','脂肪类','蛋白质2','热量2','脂肪2','碳水化合物2','矿物质2','维生素2','upload/shiwuyingyang_tupian2.jpg,upload/shiwuyingyang_tupian3.jpg,upload/shiwuyingyang_tupian4.jpg'),(43,'2023-12-15 07:41:34','名称3','脂肪类','蛋白质3','热量3','脂肪3','碳水化合物3','矿物质3','维生素3','upload/shiwuyingyang_tupian3.jpg,upload/shiwuyingyang_tupian4.jpg,upload/shiwuyingyang_tupian5.jpg'),(44,'2023-12-15 07:41:34','名称4','脂肪类','蛋白质4','热量4','脂肪4','碳水化合物4','矿物质4','维生素4','upload/shiwuyingyang_tupian4.jpg,upload/shiwuyingyang_tupian5.jpg,upload/shiwuyingyang_tupian6.jpg'),(45,'2023-12-15 07:41:34','名称5','脂肪类','蛋白质5','热量5','脂肪5','碳水化合物5','矿物质5','维生素5','upload/shiwuyingyang_tupian5.jpg,upload/shiwuyingyang_tupian6.jpg,upload/shiwuyingyang_tupian7.jpg'),(46,'2023-12-15 07:41:34','名称6','脂肪类','蛋白质6','热量6','脂肪6','碳水化合物6','矿物质6','维生素6','upload/shiwuyingyang_tupian6.jpg,upload/shiwuyingyang_tupian7.jpg,upload/shiwuyingyang_tupian8.jpg'),(47,'2023-12-15 07:41:34','名称7','脂肪类','蛋白质7','热量7','脂肪7','碳水化合物7','矿物质7','维生素7','upload/shiwuyingyang_tupian7.jpg,upload/shiwuyingyang_tupian8.jpg,upload/shiwuyingyang_tupian9.jpg'),(48,'2023-12-15 07:41:34','名称8','脂肪类','蛋白质8','热量8','脂肪8','碳水化合物8','矿物质8','维生素8','upload/shiwuyingyang_tupian8.jpg,upload/shiwuyingyang_tupian9.jpg,upload/shiwuyingyang_tupian10.jpg');
/*!40000 ALTER TABLE `shiwuyingyang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '名称',
  `picture` longtext NOT NULL COMMENT '图片',
  `type` varchar(200) DEFAULT '1' COMMENT '类型(1:收藏,21:赞,22:踩,31:竞拍参与,41:关注)',
  `inteltype` varchar(200) DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1,'2023-12-15 07:48:27',1702626497399,21,'jiankangzhishiku','知识名称1','upload/jiankangzhishiku_zhishitupian1.jpg','1',NULL,NULL),(2,'2023-12-15 07:48:34',1702626497399,21,'jiankangzhishiku','知识名称1','upload/jiankangzhishiku_zhishitupian1.jpg','21',NULL,NULL),(3,'2023-12-15 07:48:54',1702626497399,151,'forum','帖子标题1','','21',NULL,NULL);
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1702626497399,'111','yonghu','用户','4kmkhoerchvfdkvgy7wym4ihlkzycb7z','2023-12-15 07:48:20','2023-12-15 08:48:21');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `image` varchar(200) DEFAULT NULL COMMENT '头像',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','admin','upload/image1.jpg','管理员','2023-12-15 07:41:35');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yinshijihua`
--

DROP TABLE IF EXISTS `yinshijihua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yinshijihua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `riqi` date DEFAULT NULL COMMENT '日期',
  `zhifanglei` varchar(200) DEFAULT NULL COMMENT '脂肪类',
  `danbailei` varchar(200) DEFAULT NULL COMMENT '蛋白类',
  `shuguolei` varchar(200) DEFAULT NULL COMMENT '蔬果类',
  `yinshijianyi` longtext COMMENT '饮食建议',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=69 DEFAULT CHARSET=utf8 COMMENT='饮食计划';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yinshijihua`
--

LOCK TABLES `yinshijihua` WRITE;
/*!40000 ALTER TABLE `yinshijihua` DISABLE KEYS */;
INSERT INTO `yinshijihua` VALUES (61,'2023-12-15 07:41:34','2023-12-15','脂肪类1','蛋白类1','蔬果类1','饮食建议1','用户1',1),(62,'2023-12-15 07:41:34','2023-12-15','脂肪类2','蛋白类2','蔬果类2','饮食建议2','用户2',2),(63,'2023-12-15 07:41:34','2023-12-15','脂肪类3','蛋白类3','蔬果类3','饮食建议3','用户3',3),(64,'2023-12-15 07:41:34','2023-12-15','脂肪类4','蛋白类4','蔬果类4','饮食建议4','用户4',4),(65,'2023-12-15 07:41:34','2023-12-15','脂肪类5','蛋白类5','蔬果类5','饮食建议5','用户5',5),(66,'2023-12-15 07:41:34','2023-12-15','脂肪类6','蛋白类6','蔬果类6','饮食建议6','用户6',6),(67,'2023-12-15 07:41:34','2023-12-15','脂肪类7','蛋白类7','蔬果类7','饮食建议7','用户7',7),(68,'2023-12-15 07:41:34','2023-12-15','脂肪类8','蛋白类8','蔬果类8','饮食建议8','用户8',8);
/*!40000 ALTER TABLE `yinshijihua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yonghu`
--

DROP TABLE IF EXISTS `yonghu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yonghu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) NOT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `nianling` int(11) DEFAULT NULL COMMENT '年龄',
  `shengao` varchar(200) DEFAULT NULL COMMENT '身高(cm)',
  `tizhong` varchar(200) DEFAULT NULL COMMENT '体重(kg)',
  `yinshixiguan` varchar(200) DEFAULT NULL COMMENT '饮食习惯',
  `mubiaotizhong` varchar(200) DEFAULT NULL COMMENT '目标体重',
  `jianshenmubiao` varchar(200) DEFAULT NULL COMMENT '健身目标',
  `dianhua` varchar(200) DEFAULT NULL COMMENT '电话',
  `touxiang` longtext COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1702626497400 DEFAULT CHARSET=utf8 COMMENT='用户';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yonghu`
--

LOCK TABLES `yonghu` WRITE;
/*!40000 ALTER TABLE `yonghu` DISABLE KEYS */;
INSERT INTO `yonghu` VALUES (11,'2023-12-15 07:41:34','用户账号1','123456','用户姓名1','男',1,'身高(cm)1','体重(kg)1','饮食习惯1','目标体重1','健身目标1','13823888881','upload/yonghu_touxiang1.jpg'),(12,'2023-12-15 07:41:34','用户账号2','123456','用户姓名2','男',2,'身高(cm)2','体重(kg)2','饮食习惯2','目标体重2','健身目标2','13823888882','upload/yonghu_touxiang2.jpg'),(13,'2023-12-15 07:41:34','用户账号3','123456','用户姓名3','男',3,'身高(cm)3','体重(kg)3','饮食习惯3','目标体重3','健身目标3','13823888883','upload/yonghu_touxiang3.jpg'),(14,'2023-12-15 07:41:34','用户账号4','123456','用户姓名4','男',4,'身高(cm)4','体重(kg)4','饮食习惯4','目标体重4','健身目标4','13823888884','upload/yonghu_touxiang4.jpg'),(15,'2023-12-15 07:41:34','用户账号5','123456','用户姓名5','男',5,'身高(cm)5','体重(kg)5','饮食习惯5','目标体重5','健身目标5','13823888885','upload/yonghu_touxiang5.jpg'),(16,'2023-12-15 07:41:34','用户账号6','123456','用户姓名6','男',6,'身高(cm)6','体重(kg)6','饮食习惯6','目标体重6','健身目标6','13823888886','upload/yonghu_touxiang6.jpg'),(17,'2023-12-15 07:41:34','用户账号7','123456','用户姓名7','男',7,'身高(cm)7','体重(kg)7','饮食习惯7','目标体重7','健身目标7','13823888887','upload/yonghu_touxiang7.jpg'),(18,'2023-12-15 07:41:34','用户账号8','123456','用户姓名8','男',8,'身高(cm)8','体重(kg)8','饮食习惯8','目标体重8','健身目标8','13823888888','upload/yonghu_touxiang8.jpg'),(1702626497399,'2023-12-15 07:48:17','111','111','张三','男',25,'175','135','XXX','130','XXXX','18155566666','upload/1702626496286.jpg');
/*!40000 ALTER TABLE `yonghu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yundongjihua`
--

DROP TABLE IF EXISTS `yundongjihua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yundongjihua` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jihuamubiao` varchar(200) DEFAULT NULL COMMENT '计划目标',
  `jihuaneirong` longtext COMMENT '计划内容',
  `kaishishijian` date DEFAULT NULL COMMENT '开始时间',
  `jieshushijian` date DEFAULT NULL COMMENT '结束时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=90 DEFAULT CHARSET=utf8 COMMENT='运动计划';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yundongjihua`
--

LOCK TABLES `yundongjihua` WRITE;
/*!40000 ALTER TABLE `yundongjihua` DISABLE KEYS */;
INSERT INTO `yundongjihua` VALUES (81,'2023-12-15 07:41:35','计划目标1','计划内容1','2023-12-15','2023-12-15','用户1',1),(82,'2023-12-15 07:41:35','计划目标2','计划内容2','2023-12-15','2023-12-15','用户2',2),(83,'2023-12-15 07:41:35','计划目标3','计划内容3','2023-12-15','2023-12-15','用户3',3),(84,'2023-12-15 07:41:35','计划目标4','计划内容4','2023-12-15','2023-12-15','用户4',4),(85,'2023-12-15 07:41:35','计划目标5','计划内容5','2023-12-15','2023-12-15','用户5',5),(86,'2023-12-15 07:41:35','计划目标6','计划内容6','2023-12-15','2023-12-15','用户6',6),(87,'2023-12-15 07:41:35','计划目标7','计划内容7','2023-12-15','2023-12-15','用户7',7),(88,'2023-12-15 07:41:35','计划目标8','计划内容8','2023-12-15','2023-12-15','用户8',8),(89,'2023-12-15 07:50:18','XX目标','','2023-12-15','2023-12-15','111',1702626497399);
/*!40000 ALTER TABLE `yundongjihua` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yundongrizhi`
--

DROP TABLE IF EXISTS `yundongrizhi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yundongrizhi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yundongxiangmu` varchar(200) DEFAULT NULL COMMENT '运动项目',
  `yundongshizhang` varchar(200) DEFAULT NULL COMMENT '运动时长',
  `yundongqiangdu` varchar(200) DEFAULT NULL COMMENT '运动强度',
  `kaishishijian` datetime DEFAULT NULL COMMENT '开始时间',
  `jieshushijian` datetime DEFAULT NULL COMMENT '结束时间',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户',
  `userid` bigint(20) DEFAULT NULL COMMENT '用户id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=80 DEFAULT CHARSET=utf8 COMMENT='运动日志';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yundongrizhi`
--

LOCK TABLES `yundongrizhi` WRITE;
/*!40000 ALTER TABLE `yundongrizhi` DISABLE KEYS */;
INSERT INTO `yundongrizhi` VALUES (71,'2023-12-15 07:41:34','运动项目1','运动时长1','运动强度1','2023-12-15 15:41:34','2023-12-15 15:41:34','用户1',1),(72,'2023-12-15 07:41:34','运动项目2','运动时长2','运动强度2','2023-12-15 15:41:34','2023-12-15 15:41:34','用户2',2),(73,'2023-12-15 07:41:34','运动项目3','运动时长3','运动强度3','2023-12-15 15:41:34','2023-12-15 15:41:34','用户3',3),(74,'2023-12-15 07:41:35','运动项目4','运动时长4','运动强度4','2023-12-15 15:41:35','2023-12-15 15:41:35','用户4',4),(75,'2023-12-15 07:41:35','运动项目5','运动时长5','运动强度5','2023-12-15 15:41:35','2023-12-15 15:41:35','用户5',5),(76,'2023-12-15 07:41:35','运动项目6','运动时长6','运动强度6','2023-12-15 15:41:35','2023-12-15 15:41:35','用户6',6),(77,'2023-12-15 07:41:35','运动项目7','运动时长7','运动强度7','2023-12-15 15:41:35','2023-12-15 15:41:35','用户7',7),(78,'2023-12-15 07:41:35','运动项目8','运动时长8','运动强度8','2023-12-15 15:41:35','2023-12-15 15:41:35','用户8',8),(79,'2023-12-15 07:49:53','慢跑','2小时','中等','2023-12-15 15:49:32','2023-12-15 17:49:32','111',1702626497399);
/*!40000 ALTER TABLE `yundongrizhi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhishileixing`
--

DROP TABLE IF EXISTS `zhishileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhishileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhishileixing` varchar(200) DEFAULT NULL COMMENT '知识类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8 COMMENT='知识类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhishileixing`
--

LOCK TABLES `zhishileixing` WRITE;
/*!40000 ALTER TABLE `zhishileixing` DISABLE KEYS */;
INSERT INTO `zhishileixing` VALUES (31,'2023-12-15 07:41:34','知识类型1'),(32,'2023-12-15 07:41:34','知识类型2'),(33,'2023-12-15 07:41:34','知识类型3'),(34,'2023-12-15 07:41:34','知识类型4'),(35,'2023-12-15 07:41:34','知识类型5'),(36,'2023-12-15 07:41:34','知识类型6'),(37,'2023-12-15 07:41:34','知识类型7'),(38,'2023-12-15 07:41:34','知识类型8');
/*!40000 ALTER TABLE `zhishileixing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-15 16:55:28
