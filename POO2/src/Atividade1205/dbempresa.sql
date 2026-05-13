CREATE DATABASE IF NOT EXISTS `dbempresa`;
USE `dbempresa`;

DROP TABLE IF EXISTS `gerenciamento_salario`;
DROP TABLE IF EXISTS `movimentos`;
DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nomeFuncionario` VARCHAR(100) NOT NULL,
  `salario` DOUBLE NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

CREATE TABLE `gerenciamento_salario` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `funcionarioid` INT NOT NULL,
  `bonus` DOUBLE NOT NULL,
  `hora_extra` INT NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`funcionarioid`) REFERENCES `funcionario`(`id`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
