create database db_springboot_prod;
use db_springboot_prod;
CREATE TABLE `db_springboot_prod`.`clientes` (
    `id_cliente` INT ZEROFILL NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(45) NOT NULL,
    `apellido` VARCHAR(45) NOT NULL,
    `correo` VARCHAR(45) NOT NULL,
    `fecha_registro` date NOT NULL,
    PRIMARY KEY (`id_cliente`));
    INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Walter', 'Rosero', 'ecuadorwalter@std.com', '2023-08-01');
    INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Juan', 'Espinoza', 'juanespi98@gmail.com', '2023-08-02');
    INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Kevin', 'Cantos', 'cantos99@hotmail.com', '2023-08-03');



create database db_springtoot_dev;
use db_springboot_dev;
CREATE TABLE `db_springboot_dev`.`clientes` (
    `id_cliente` INT ZEROFILL NOT NULL AUTO_INCREMENT,
    `nombre` VARCHAR(45) NOT NULL,
    `apellido` VARCHAR(45) NOT NULL,
    `correo` VARCHAR(45) NOT NULL,
    `fecha_registro` date NOT NULL,
    PRIMARY KEY (`id_cliente`));
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Joel', 'Jurado', 'juradoec@yahoo.com', '2023-08-01');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Carlos', 'Miranda', 'mirandaTr98@gmail.com', '2023-08-02');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Marcela', 'Sanchez', 'schMarce@itb.com', '2023-08-03');
INSERT INTO clientes (nombre, apellido, correo, fecha_registro) VALUES('Ben', 'Tennyson', 'beni0@cn.com', '2023-08-04');