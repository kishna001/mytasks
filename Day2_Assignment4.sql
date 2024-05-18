-- Day2 Assignment4

set autocommit=0;

start transaction;
insert into orders values(132,8246,'Table','2024-05-16',3000,4);
 commit;
select * from orders;
/* output
OrderId	  CustomerId	OrderItem	OrderDate	Price	ordervalue
121			8241		Mobile		2024-01-23	23500	5
128			8242		Laptop		2023-12-25	64500	17
129			8241		Shoe		2024-02-07	2000	25
130			8243		Watch		2024-02-16	4600	11
132			8246		Table		2024-05-16	3000	4
*/

 start transaction;
 
 update customers set customerid=8245 where customername='ramya;
  
select * from customers;

/* output
 CustomerId		CustomerName	ContactNo	city		email
8241			Ravi			1564324612	Hyderabad	
ravi123@gmail.com
8242			ramu		97925454133	Chennai		ramu
54@gmail.com
8243			rani		55453456354	Vizag		rani2002@gmail.com
8244			kavya			4544693930	Bengaluru	kavya56@gmail.com
8245			balam 	6836489456	Hyderabad	balamss@gmail.com
*/
 
 rollback;
 
 -- after rollback the uncomitted actions will remain same
 
 select *from customers;
 
 /* output
CustomerId	CustomerName	ContactNo	city		email
3241		ravi			1564324612	Hyderabad	ravi@gmail.com
8241		Ramu			97925454133	Hyderabad	ramu123@gmail.com
8242		rani		9792742853	Chennai		rani54@gmail.com
8243		rani			55453456354	Vizag		rani2002@gmail.com
8244		kavya			4544693930	Bengaluru	kavya56@gmail.com
*/
