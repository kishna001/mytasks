use joinsdb;

-- inner join

select c.customername,c.city,o.orderitem,o.price from customers c inner join orders o on (c.customerid=o.customerid);
/* output
customername	city		orderitem	price
Ravi			Hyderabad	Mobile		23500
Laya			Chennai		Laptop		64500
Ravi			Hyderabad	Shoe		2000
Nani			Vizag		Watch		4600
*/

select c.customername,o.orderitem,o.price,o.orderdate from customers c inner join orders o on (c.customerid=o.customerid);
select c.customername,c.contactno,c.city,o.orderitem from customers c inner join orders o on (c.customerid=o.customerid) where OrderItem='shoe'; 
select c.customername,c.contactno,c.city,o.orderitem from customers c inner join orders o on (c.customerid=o.customerid) where city='vizag';

-- left join

select c.customerid,c.customername,c.city,o.orderitem,o.price from customers c left join orders o on (c.customerid=o.customerid);
/* output
customerid	customername	city		orderitem	price
8241		Ravi			Hyderabad	Shoe		2000
8241		Ravi			Hyderabad	Mobile		23500
8242		Laya			Chennai		Laptop		64500
8243		Nani			Vizag		Watch		4600
8244		Bhavya			Bengaluru	NULL        NULL
8245		Sravya			Hyderabad	NULL	    NULL
*/

select c.customername,o.orderitem,o.price,o.orderdate from customers c left join orders o on (c.customerid=o.customerid);
select c.customername,c.contactno,c.city,o.orderitem from customers c left join orders o on (c.customerid=o.customerid) where OrderItem='shoe'; 
select c.customername,c.contactno,c.city,o.orderitem from customers c left join orders o on (c.customerid=o.customerid) where city='vizag';






