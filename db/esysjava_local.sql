CREATE DATABASE  IF NOT EXISTS `esysjava` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `esysjava`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: esysjava
-- ------------------------------------------------------
-- Server version	5.7.17-log

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
-- Table structure for table `local`
--

DROP TABLE IF EXISTS `local`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `local` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `description` text,
  `name` varchar(255) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `postal_code` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `owner_id` varchar(16) NOT NULL DEFAULT '1294987747236027',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `local`
--

LOCK TABLES `local` WRITE;
/*!40000 ALTER TABLE `local` DISABLE KEYS */;
INSERT INTO `local` VALUES (1,'Wrocław','Jest nas trzech i lubimy się napić DOBREGO PIWA. W związku z tym, że we Wrocławiu jest wciąż za mało miejsc, w których takowe się leje, postanowiliśmy otworzyć własne. Można? Można! Dlaczego KONTYNUACJA? Są dwa powody: Po pierwsze primo: lokal, w którym znajduje się multi-tap KONTYNUACJA to miejsce o bardzo ciekawej historii… piwnej. Od 1888 r. do 1945 r. przy Ofiar Oświęcimskich 17 (wówczas Junkernstrasse) działały piwiarnie Kisslinga. Ich założyciel, Conrad Kissling, jako pierwszy, sprowadzał do Wrocławia bawarskie piwo „echt Bayrisches Bier”. W mieście zapanowała mania picia tego piwa. Jak pisze Grzegorz Sobel w „Dziejach wrocławskiej gastronomii”: „Powiadano, iż piwiarnie Kisslinga stały się dla wielu wręcz drugim domem […] wielu dobrze sytuowanych wrocławian nie wyobrażało sobie popołudnia po pracy bez kufla wyśmienitego piwa wypitego wśród przyjaciół […]. Wpadali tu od czasu do czasu studenci, zwłaszcza zaś kupcy, ludzie wolnych zawodów i przedstawiciele arystokracji.\". Czego i sobie życzymy:] Po drugie primo: chcemy kontynuować i wspierać piwolucję, a także szerzyć (tu padną wzniosłe słowa): kulturę picia piwa. Marzy nam się, by każdy wrocławianin znał więcej stylów piwa niż jasne pełne i potrafił określić, który styl jest tym ulubionym. Roboty mamy kupę, ponieważ na świecie jest około 100 stylów piwa... Tak więc Panie i Panowie zapraszamy w piwną podróż. Obiecujemy, że będzie ciekawie i smacznie. Bez koncernowej ściemy!','Kontynuacja',17,'50-069','Ofiar Oświęcimskich','1294987747236027'),(2,'Wrocław',NULL,'Przedwojenna Bistro',11,'11-400','Świętego Mikołaja','1294987747236027'),(3,'Wrocław','Miejsce o zaostrzonym klimacie 13 Igieł zamkniętych w starej maszynie do szycia Twojej prababci kontrastowo zestawione ze zwykle rockowymi brzmieniami. Tu topią smutki studenci, a jak im się poszczęści to nawet randkę opijają błękitnym ponczem. Codziennie do godziny 18 wspieramy studenta w ciężkiej nauce Tyskim za 6,50. W razie potrzeby udzielamy bezpłatnych porad Savoir-vivre zbłąkanym duszyczkom ponieważ nie boimy się pomagać. Zapraszamy studenta małego i dużego, szerokiego i wąskiego też, tego z wąsem i łysego, w szpilkach czy w pikolakach pomieścimy się wszyscy!','13 Igieł',13,'50-117','Igielna','1294987747236027'),(4,'Wrocław',NULL,'Czeski Film',2,'11-400','Kiełbaśnicza','1294987747236027'),(5,'Wrocław',NULL,'Łubu Dubu Bistro',24,'50-114','Odrzańska','1294987747236027');
/*!40000 ALTER TABLE `local` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-05-07  0:29:56
