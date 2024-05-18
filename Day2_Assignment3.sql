-- Day2 assignment3

use joinsdb;

-- sub query a query inside another query

select c.customerid,c.customername,o.orderid,o.OrderItem,o.ordervalue from customers c inner join orders o on c.CustomerId=o.CustomerId 
where o.ordervalue > (select avg(ordervalue) from orders);

/* output
customerid	customername	orderid	OrderItem	ordervalue
8242		Laya			128		Laptop		17
8241		Ravi			129		Shoe		25
*/


select c.customername,o.orderid,o.OrderItem,o.price from customers c inner join orders o on c.CustomerId=o.CustomerId 
where o.price > (select min(price) from orders);

/* output
customername	orderid		OrderItem	price
Ravi			121			Mobile		23500
Laya			128			Laptop		64500
Nani			130			Watch		4600
*/


-- union will execute two select queries 

select c.customername,c.city,o.orderitem,o.price from customers c inner join orders o on (c.customerid=o.customerid)
union
select c.customername,c.contactno,c.city,o.orderitem from customers c cross join orders o on (c.customerid=o.customerid) where OrderItem='shoe'; 

/* output
customername	city		orderitem	price
Ravi			Hyderabad	Mobile		23500
Laya			Chennai		Laptop		64500
Ravi			Hyderabad	Shoe		2000
Nani			Vizag		Watch		4600
*/







