create database quan_li_ban_hang;
use quan_li_ban_hang;
create table Customer(
c_id int primary key,
c_name varchar(255),
c_age date
);

create table `Order`(
o_id int primary key,
c_id int,
o_date date,
o_total_price double,
foreign key (c_id) references Customer(c_id)
);

create table Product(
p_id int primary key,
p_age date,
p_name varchar(255)
);

create table OrderDetail(
o_id int,
p_id int,
od_qty int,
foreign key (o_id) references `Order`(o_id), 
foreign key (p_id) references Product(p_id)
);

