CREATE DATABASE springcloud CHARACTER SET UTF8 ;
USE springcloud ;
CREATE TABLE product (
prodcutId BIGINT AUTO_INCREMENT ,
productName VARCHAR(50) ,
 productDesc VARCHAR(50) ,
CONSTRAINT pk_prodcut_id PRIMARY KEY(prodcutId)
) ;

INSERT INTO product(productName,productDesc) VALUES ('java编程',database()) ;
INSERT INTO product(productName,productDesc) VALUES ('Springboot',database()) ;
INSERT INTO product(productName,productDesc) VALUES ('西游记',database()) ;
INSERT INTO product(productName,productDesc) VALUES ('水浒传',database()) ;
INSERT INTO product(productName,productDesc) VALUES ('西厢记',database()) ;