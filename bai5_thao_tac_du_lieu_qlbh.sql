use quan_li_ban_hang;

select o_id, o_date, o_total_price from `order`;

select c_name, p_name
from (customer
join `order`
on  customer.c_id = `order`.c_id )
join orderdetail
on `order`.o_id = orderdetail.o_id
join product
on product.p_id = orderdetail.p_id;

select c_name 
from customer 
where customer.c_id not in (
      select c_id
      from `order`
);

select `order`.o_id, `order`.o_date, SUM(product.p_price * orderdetail.od_qty) as total_price
from (`order`
join orderdetail
on `order`.o_id = orderdetail.o_id)
join product
on product.p_id = orderdetail.p_id
group by `order`.o_id;
