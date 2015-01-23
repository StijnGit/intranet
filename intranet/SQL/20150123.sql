CREATE DATABASE  IF NOT EXISTS `intranet` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `intranet`;
-- MySQL dump 10.13  Distrib 5.6.13, for osx10.6 (i386)
--
-- Host: 127.0.0.1    Database: intranet
-- ------------------------------------------------------
-- Server version	5.6.12

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
-- Table structure for table `Input`
--

DROP TABLE IF EXISTS `Input`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Input` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `word` int(11) NOT NULL,
  `bit` int(11) NOT NULL,
  `nr` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=190 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Input`
--

LOCK TABLES `Input` WRITE;
/*!40000 ALTER TABLE `Input` DISABLE KEYS */;
INSERT INTO `Input` VALUES (1,'Thermostaat living',10,0,0),(143,'Thermostaat badkamer',10,1,1),(144,'Thermostaat zolder',10,2,2),(145,'DK Alles uit',10,3,3),(146,'DK1 licht gang gelijkvl',10,4,4),(147,'DK2 licht gang gelijkvl',10,5,5),(148,'DK3 licht gang gelijkvl',10,6,6),(149,'DK licht berging',10,7,7),(150,'DK licht WC',11,0,8),(151,'DK1 licht living 1',11,1,9),(152,'DK2 licht living 1',11,2,10),(153,'DK1 licht living 2',11,3,11),(154,'DK2 licht living 2',11,4,12),(155,'DK1 licht living 3',11,5,13),(156,'DK2 licht living 3',11,6,14),(157,'DK1 licht achterbouw 1',11,7,15),(158,'DK2 licht achterbouw 1',13,0,23),(159,'DK1 licht achterbouw 2',13,1,24),(160,'DK2 licht achterbouw 2',13,2,25),(161,'DK1 licht achterbouw 3',13,3,26),(162,'DK2 licht achterbouw 3',13,4,27),(163,'DK licht buiten 1',13,5,28),(164,'DK licht buiten 2',13,6,29),(165,'DK1 licht gang 1e',13,7,30),(166,'DK2 licht gang 1e',14,0,31),(167,'DK1 licht slaapkamer 1',14,1,32),(168,'DK2 licht slaapkamer 1',14,2,33),(169,'DK nachtlamp rechts',14,3,34),(170,'DK nachtlamp links',14,4,35),(171,'DK licht dressing',14,5,36),(172,'DK licht badkamer 1',14,6,37),(173,'DK licht badkamer 2',14,7,38),(174,'DK1 licht gang zolder',15,0,39),(175,'DK2 licht gang zolder',15,1,40),(176,'DK slaapkamer 2',15,2,41),(177,'DK slaapkamer 3',15,3,42),(178,'DK1 geschakeld stopk living',15,4,43),(179,'DK2 geschakeld stopk living',15,5,44),(180,'DK geschakeld stopk badk',15,6,45),(181,'HP waterput',15,7,46),(182,'LP waterput',16,0,47),(183,'DK licht kelder',16,1,48),(184,'DK3 licht gang 1e',16,2,49),(185,'Pulden KWH PV',16,3,50),(186,'reserve',16,4,51),(187,'reserve',16,5,52),(188,'reserve',16,6,53),(189,'reserve',16,7,54);
/*!40000 ALTER TABLE `Input` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `heating`
--

DROP TABLE IF EXISTS `heating`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `heating` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `zone` varchar(45) NOT NULL,
  `starttime` time NOT NULL,
  `stoptime` time NOT NULL,
  `ma` tinyint(1) NOT NULL,
  `di` tinyint(1) NOT NULL,
  `woe` tinyint(1) NOT NULL,
  `don` tinyint(1) NOT NULL,
  `vrij` tinyint(1) NOT NULL,
  `za` tinyint(1) NOT NULL,
  `zo` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `heating`
--

LOCK TABLES `heating` WRITE;
/*!40000 ALTER TABLE `heating` DISABLE KEYS */;
INSERT INTO `heating` VALUES (39,'living','11:15:00','11:20:00',0,0,1,0,0,0,0),(40,'zolder','01:00:00','02:00:00',0,0,0,1,0,0,0),(41,'zolder','00:30:00','02:00:00',1,1,0,0,0,0,0);
/*!40000 ALTER TABLE `heating` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `merker`
--

DROP TABLE IF EXISTS `merker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `merker` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `word` int(11) DEFAULT NULL,
  `bit` int(11) DEFAULT NULL,
  `nr` int(11) DEFAULT NULL,
  `value` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merker`
--

LOCK TABLES `merker` WRITE;
/*!40000 ALTER TABLE `merker` DISABLE KEYS */;
INSERT INTO `merker` VALUES (1,'Zoneventiel zolder',0,0,0,1),(2,'Zoneventiel leefruimte',0,1,1,1),(3,'Zoneventiel badkamer',0,2,2,1),(4,'Ketel',0,3,3,1),(5,'Licht gang 1e',0,4,4,1),(6,'Licht slaapkamer 1e',0,5,5,1),(7,'Ventilator WC',0,6,6,1),(8,'Vrije output',0,7,7,1),(9,'Nachtlamp rechts',1,0,8,1),(10,'Nachtlamp links',1,1,9,1),(11,'Licht dressing',1,2,10,1),(12,'Licht badkamer 1',1,3,11,1),(13,'Licht badkamer 2',1,4,12,1),(14,'Licht gang zolder',1,5,13,1),(15,'Licht zolderk straatkant',1,6,14,1),(16,'Licht zolderk achterkant',1,7,15,1),(17,'Gesch stopc living',3,0,24,1),(18,'Stopc + licht wastafel',3,1,25,1),(19,'Vrije output',3,2,26,1),(20,'Vrije output',3,3,27,1),(21,'Licht gang gelijkvloer',3,4,28,1),(22,'Licht berging',3,5,29,1),(23,'Licht WC',3,6,30,1),(24,'Licht living 1',3,7,31,1),(25,'Licht living 2',5,0,40,1),(26,'Licht living 3',5,1,41,1),(27,'Licht achterbouw',5,2,42,1),(28,'Licht achterbouw 2',5,3,43,1),(29,'Licht achterbouw 3',5,4,44,1),(30,'Licht buiten 1',5,5,45,1),(31,'Licht buiten 2',5,6,46,1),(32,'Licht kelder',5,7,47,1),(33,'Tijdsturing leefruimte',6,0,48,1),(34,'Tijdsturing badkamer',6,1,49,1),(35,'Tijdsturing badkamer',6,2,50,1);
/*!40000 ALTER TABLE `merker` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `output`
--

DROP TABLE IF EXISTS `output`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `output` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `word` int(11) NOT NULL,
  `bit` int(11) NOT NULL,
  `nr` int(11) NOT NULL,
  `value` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `output`
--

LOCK TABLES `output` WRITE;
/*!40000 ALTER TABLE `output` DISABLE KEYS */;
INSERT INTO `output` VALUES (1,'Zoneventiel zolder',0,0,0,1),(2,'Zoneventiel leefruimte',0,1,1,1),(3,'Zoneventiel badkamer',0,2,2,1),(4,'Ketel',0,3,3,1),(5,'Licht gang 1e',0,4,4,1),(6,'Licht slaapkamer 1e',0,5,5,1),(7,'Ventilator WC',0,6,6,1),(8,'Vrije output',0,7,7,1),(9,'Nachtlamp rechts',1,0,8,1),(10,'Nachtlamp links',1,1,9,1),(11,'Licht dressing',1,2,10,1),(12,'Licht badkamer 1',1,3,11,1),(13,'Licht badkamer 2',1,4,12,1),(14,'Licht gang zolder',1,5,13,1),(15,'Licht zolderk straatkant',1,6,14,1),(16,'Licht zolderk achterkant',1,7,15,1),(17,'Gesch stopc living',3,0,24,1),(18,'Stopc + licht wastafel',3,1,25,1),(19,'Vrije output',3,2,26,1),(20,'Vrije output',3,3,27,1),(21,'Licht gang gelijkvloer',3,4,28,1),(22,'Licht berging',3,5,29,1),(23,'Licht WC',3,6,30,1),(24,'Licht living 1',3,7,31,1),(25,'Licht living 2',5,0,32,1),(26,'Licht living 3',5,1,33,1),(27,'Licht achterbouw',5,2,34,1),(28,'Licht achterbouw 2',5,3,35,1),(29,'Licht achterbouw 3',5,4,36,1),(30,'Licht buiten 1',5,5,37,1),(31,'Licht buiten 2',5,6,38,1),(32,'Licht kelder',5,7,39,1);
/*!40000 ALTER TABLE `output` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(45) DEFAULT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'test','test');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-01-23 15:42:14
