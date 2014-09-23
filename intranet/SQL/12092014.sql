CREATE DATABASE  IF NOT EXISTS `intranet` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `intranet`;
-- MySQL dump 10.13  Distrib 5.6.17, for osx10.6 (i386)
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Input`
--

LOCK TABLES `Input` WRITE;
/*!40000 ALTER TABLE `Input` DISABLE KEYS */;
INSERT INTO `Input` VALUES (1,'Thermostaat living',0,0,0);
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
  `starttime` datetime NOT NULL,
  `stoptime` datetime NOT NULL,
  `day` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `heating`
--

LOCK TABLES `heating` WRITE;
/*!40000 ALTER TABLE `heating` DISABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `merker`
--

LOCK TABLES `merker` WRITE;
/*!40000 ALTER TABLE `merker` DISABLE KEYS */;
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
INSERT INTO `output` VALUES (1,'Zoneventiel zolder',0,0,0,1),(2,'Zoneventiel leefruimte',0,1,1,1),(3,'Zoneventiel badkamer',0,2,2,1),(4,'Ketel',0,3,3,1),(5,'Licht gang 1e',0,4,4,1),(6,'Licht slaapkamer 1e',0,5,5,1),(7,'Ventilator WC',0,6,6,1),(8,'Vrije output',0,7,7,1),(9,'Nachtlamp rechts',1,0,8,1),(10,'Nachtlamp links',1,1,9,1),(11,'Licht dressing',1,2,10,1),(12,'Licht badkamer 1',1,3,11,1),(13,'Licht badkamer 2',1,4,12,1),(14,'Licht gang zolder',1,5,13,1),(15,'Licht zolderkamer straatkant',1,6,14,1),(16,'Licht zolderkamer achterkant',1,7,15,1),(17,'Geschakeld stopcontact living',3,0,24,1),(18,'Stopcontact + licht wastafel',3,1,25,1),(19,'Vrije output',3,2,26,1),(20,'Vrije output',3,3,27,1),(21,'Licht gang gelijkvloer',3,4,28,1),(22,'Licht berging',3,5,29,1),(23,'Licht WC',3,6,30,1),(24,'Licht living 1',3,7,31,1),(25,'Licht living 2',4,0,32,1),(26,'Licht living 3',4,1,33,1),(27,'Licht achterbouw',4,2,34,1),(28,'Licht achterbouw 2',4,3,35,1),(29,'Licht achterbouw 3',4,4,36,1),(30,'Licht buiten 1',4,5,37,1),(31,'Licht buiten 2',4,6,38,1),(32,'Licht kelder',4,7,39,1);
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

-- Dump completed on 2014-09-12 20:30:57
