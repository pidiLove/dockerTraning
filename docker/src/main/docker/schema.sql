CREATE DATABASE `docker` CHARACTER SET 'utf8mb4';
grant all PRIVILEGES on docker.* to test@'%' identified by '123456';

flush privileges;

use docker;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
INSERT INTO `docker`.`user` (`id`, `user_name`, `password`) VALUES ('1', 'zhangsan', '123');


