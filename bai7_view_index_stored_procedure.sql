create database demo;
use demo;

create table products (
id int primary key,
productCode int,
productName varchar(45),
productPrice double,
productAmount int,
productDescription varchar(45),
productStatus bit(1)
);

INSERT INTO products (`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) 
VALUES ('1', '1', 'Milk', '10', '3', 'abc', b'1');
INSERT INTO products (`id`, `productCode`, `productName`, `productPrice`, `productAmount`, `productDescription`, `productStatus`) 
VALUES ('2', '2', 'Bread', '15', '4', 'abc', b'1');


CREATE UNIQUE INDEX productCodeIndex
ON products(productCode);

CREATE INDEX productCodeIndexComposite ON products(productName, productPrice);

EXPLAIN SELECT * FROM products WHERE id = 1;

CREATE VIEW view_product AS
SELECT productCode, productName, productPrice, productStatus
FROM products;

INSERT INTO view_product VALUES(3, 'coke', 20, 1);

drop view view_product;

DELIMITER //
CREATE PROCEDURE procedure_get_information()
BEGIN
select * from products;
END;
//
DELIMITER ;

call procedure_get_information();

DELIMITER //
CREATE PROCEDURE procedure_insert_new_product(pro_id int, pro_productCode int, pro_productName varchar(45), pro_productPrice double, pro_productAmount int, pro_productDescription varchar(45), pro_productStatus bit(1))
BEGIN
insert into products
values (pro_id, pro_productCode, pro_productName, pro_productPrice, pro_productAmount, pro_productDescription, pro_productStatus);
END;
//
DELIMITER ;

call procedure_insert_new_product(4, 4, 'computer', 23, 5, 'a', 1);

DELIMITER //
CREATE PROCEDURE procedure_update_product(pro_id int)
BEGIN
UPDATE products
SET productName = 'fan'
WHERE id = pro_id;
END;
//
DELIMITER ;

call procedure_update_product(2);

DELIMITER //
CREATE PROCEDURE procedure_delete_product(pro_id int)
BEGIN
delete 
from products
where id = pro_id;
END;
//
DELIMITER ;

call procedure_delete_product(4);