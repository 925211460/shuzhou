create database test;
USE test;
CREATE TABLE user(
  `id` int(11) NOT NULL,
  `username` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;