-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: d2_db
-- ------------------------------------------------------
-- Server version	5.7.29

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
-- Current Database: `d2_db`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `d2_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `d2_db`;

--
-- Table structure for table `d2_category`
--

DROP TABLE IF EXISTS `d2_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d2_category` (
  `category_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d2_category`
--

LOCK TABLES `d2_category` WRITE;
/*!40000 ALTER TABLE `d2_category` DISABLE KEYS */;
INSERT INTO `d2_category` VALUES (1,'home'),(2,'hello world'),(3,'news');
/*!40000 ALTER TABLE `d2_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `d2_member`
--

DROP TABLE IF EXISTS `d2_member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d2_member` (
  `member_id` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `avatar_url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `department` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `position` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `profile` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d2_member`
--

LOCK TABLES `d2_member` WRITE;
/*!40000 ALTER TABLE `d2_member` DISABLE KEYS */;
INSERT INTO `d2_member` VALUES ('258','/image/20200219/680454544304.jpg','네이버 Clova','','이준행','','2016년 네이버 입사 후 메인 플랫폼을 거쳐 현재 Clova에서 NAVER AiCall의 백엔드 개발을 담당하고 있습니다.');
/*!40000 ALTER TABLE `d2_member` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `d2_post`
--

DROP TABLE IF EXISTS `d2_post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d2_post` (
  `post_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `body` longtext COLLATE utf8mb4_unicode_ci,
  `image` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `publication_date` datetime(6) DEFAULT NULL,
  `social_url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `title` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `view_count` int(11) NOT NULL,
  `category_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`post_id`),
  KEY `FKb2nw8c4208tmmtqu4h1nlillb` (`category_id`),
  CONSTRAINT `FKb2nw8c4208tmmtqu4h1nlillb` FOREIGN KEY (`category_id`) REFERENCES `d2_category` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=669 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d2_post`
--

LOCK TABLES `d2_post` WRITE;
/*!40000 ALTER TABLE `d2_post` DISABLE KEYS */;
INSERT INTO `d2_post` VALUES (668,'<p> 아키텍처는 오랫동안 많은 개발자들이 좋아하며 사용한 아키텍처입니다. </p>','/content/images/2020/02/spring-mvc-and-webflux-venn-1.png','2020-04-09 13:49:53.000000','http://d2.naver.com/helloworld/6080222','이것은 제목이다',5825,2);
/*!40000 ALTER TABLE `d2_post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `d2_post_reply`
--

DROP TABLE IF EXISTS `d2_post_reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d2_post_reply` (
  `reply_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `bad_count` int(11) NOT NULL,
  `comments` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `good_count` int(11) NOT NULL,
  `reply_at` datetime(6) DEFAULT NULL,
  `replyer` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `text` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `post_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`reply_id`),
  KEY `FKhvnf61wqphejmbwouobghtnu7` (`post_id`),
  CONSTRAINT `FKhvnf61wqphejmbwouobghtnu7` FOREIGN KEY (`post_id`) REFERENCES `d2_post` (`post_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d2_post_reply`
--

LOCK TABLES `d2_post_reply` WRITE;
/*!40000 ALTER TABLE `d2_post_reply` DISABLE KEYS */;
/*!40000 ALTER TABLE `d2_post_reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `d2_posting`
--

DROP TABLE IF EXISTS `d2_posting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d2_posting` (
  `posting_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `posting_member_id` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `posting_post_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`posting_id`),
  KEY `FKdx9saq753c0atak8dtelhar6c` (`posting_member_id`),
  KEY `FK8m71sbrix25846sdtl29aw79g` (`posting_post_id`),
  CONSTRAINT `FK8m71sbrix25846sdtl29aw79g` FOREIGN KEY (`posting_post_id`) REFERENCES `d2_post` (`post_id`),
  CONSTRAINT `FKdx9saq753c0atak8dtelhar6c` FOREIGN KEY (`posting_member_id`) REFERENCES `d2_member` (`member_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d2_posting`
--

LOCK TABLES `d2_posting` WRITE;
/*!40000 ALTER TABLE `d2_posting` DISABLE KEYS */;
INSERT INTO `d2_posting` VALUES (1,'258',668);
/*!40000 ALTER TABLE `d2_posting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `d2_tag`
--

DROP TABLE IF EXISTS `d2_tag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d2_tag` (
  `tag_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `url` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d2_tag`
--

LOCK TABLES `d2_tag` WRITE;
/*!40000 ALTER TABLE `d2_tag` DISABLE KEYS */;
INSERT INTO `d2_tag` VALUES (1,'rpc','/search?keyword=rpc'),(2,'Spring','/search?keyword=Spring'),(3,'Spring WebFlux','/search?keyword=Spring WebFlux'),(4,'Armeria','/search?keyword=Armeria'),(5,'Microservice','/search?keyword=Microservice'),(6,'Reactive','/search?keyword=Reactive');
/*!40000 ALTER TABLE `d2_tag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `d2_tag_post`
--

DROP TABLE IF EXISTS `d2_tag_post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `d2_tag_post` (
  `tag_id` bigint(20) NOT NULL,
  `post_id` bigint(20) NOT NULL,
  KEY `FK9wn71qj277bltjk513b46jfrg` (`post_id`),
  KEY `FKf16pqf8roo7usd14mus0ple37` (`tag_id`),
  CONSTRAINT `FK9wn71qj277bltjk513b46jfrg` FOREIGN KEY (`post_id`) REFERENCES `d2_post` (`post_id`),
  CONSTRAINT `FKf16pqf8roo7usd14mus0ple37` FOREIGN KEY (`tag_id`) REFERENCES `d2_tag` (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `d2_tag_post`
--

LOCK TABLES `d2_tag_post` WRITE;
/*!40000 ALTER TABLE `d2_tag_post` DISABLE KEYS */;
INSERT INTO `d2_tag_post` VALUES (1,668),(2,668),(3,668),(3,668),(4,668),(5,668),(6,668);
/*!40000 ALTER TABLE `d2_tag_post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `test_table`
--

DROP TABLE IF EXISTS `test_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `test_table` (
  `test_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`test_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `test_table`
--

LOCK TABLES `test_table` WRITE;
/*!40000 ALTER TABLE `test_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `test_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-09 13:56:58
