DROP DATABASE jpqlexam;

CREATE DATABASE jpqlexam /*!40100 DEFAULT CHARACTER SET latin1 */;


CREATE TABLE `SEMESTER` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `DESCRIPTION` varchar(255) DEFAULT NULL,
  `NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*INSERT INTO `SEMESTER` VALUES (1,'Computer Science 3. sem','CLcos-v14e'),(2,'Datamatiker 3. sem','CLdat-a14e'),(3,'Datamatiker 3. sem','CLdat-b14e');*/


CREATE TABLE `STUDENT` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` varchar(255) DEFAULT NULL,
  `LASTNAME` varchar(255) DEFAULT NULL,
  `CURRENTSEMESTER_ID` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_STUDENT_CURRENTSEMESTER_ID` (`CURRENTSEMESTER_ID`),
  CONSTRAINT `FK_STUDENT_CURRENTSEMESTER_ID` FOREIGN KEY (`CURRENTSEMESTER_ID`) REFERENCES `SEMESTER` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*INSERT INTO `STUDENT` VALUES (1,'Jens','Jensen',1),(2,'Hans','Hansen',2),(3,'John','Doe',3),(4,'Jane','Doe',3),(5,'Andersine','And',2),(6,'Anders','And',1);*/


CREATE TABLE `TEACHER` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` varchar(255) DEFAULT NULL,
  `LASTNAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*INSERT INTO `TEACHER` VALUES (1,'Sofus','Albertsen'),(2,'Thomas','Hartmann'),(3,'Lars','Mortensen');*/


/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TEACHER_SEMESTER` (
  `teaching_ID` bigint(20) NOT NULL,
  `teachers_ID` bigint(20) NOT NULL,
  PRIMARY KEY (`teaching_ID`,`teachers_ID`),
  KEY `FK_TEACHER_SEMESTER_teachers_ID` (`teachers_ID`),
  CONSTRAINT `FK_TEACHER_SEMESTER_teaching_ID` FOREIGN KEY (`teaching_ID`) REFERENCES `SEMESTER` (`ID`),
  CONSTRAINT `FK_TEACHER_SEMESTER_teachers_ID` FOREIGN KEY (`teachers_ID`) REFERENCES `TEACHER` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;


/*INSERT INTO `TEACHER_SEMESTER` VALUES (1,1),(3,1),(1,2),(2,2),(1,3),(2,3),(3,3);*/