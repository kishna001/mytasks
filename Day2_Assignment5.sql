

set autocommit=0;

start transaction;

insert into orders values(134,8246,'sofa','2024-03-15',300000,7);
savepoint sp1;

insert into orders values(135,8248,'Dressing table','2024-05-23',3000,8);
insert into orders values(140,8249,'TV','2024-05-23',45000,9);
savepoint sp2;
 
 
insert into orders values(138,8243,'fridge','2023-05-16',35000,15);
savepoint sp3;

select * from orders;
/* output
OrderId		CustomerId	OrderItem		OrderDate	Price	ordervalue
121			8241		Mobile			2024-01-23	23500	5
128			8242		Laptop			2023-12-25	64500	17
129			8241		Shoe			2024-02-07	2000	25
130			8243		Watch			2024-02-16	4600	11
132			8246		Table			2024-05-16	3000	4
134			8246		sofa			2024-03-15	300000	7
135			8248		Dressing table	2024-05-23	3000	8
138			8243		fridge			2023-05-16	35000	15
139			8247		bag				2023-05-11	3000	2
140			8249		TV	            2024-05-23	45000	9
*/


rollback to savepoint sp2;

select * from orders;

/*output
OrderId	CustomerId		OrderItem		OrderDate	Price	ordervalue
111	      8241			Mobile			2024-01-25	  		 23545
112	      8242			Laptop			2023-12-21 		64500
113	    8241			Shoe			2024-02-07	2000	25
114  		8243			Watch			2024-02-16	4600	11
115 		8246			Table			2024-05-16	3000	4
116	   	8246			sofa			2024-03-15	300000	
117		8248			Dressing table	2024-05-23	3000	8
118		8247			bag				2023-05-11	 		3000	



commit;
