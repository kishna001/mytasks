use joinsdb;
-- Day2 Assignment1

select * from customers;

-- output
/*
 CustomerId		CustomerName		ContactNo		city		 email
8241			Ravi				9876543210      Hyderabad	 ravi123@gmail.com
8242			Laya				9792742853		Chennai		 laya54@gmail.com
8243			Nani				5333353664		Vizag		 nani2002@gmail.com
8244			Bhavya				4544693930		Bengaluru	 bhavya56@gmail.com
8245			Sravya				6836489456		Hyderabad	 sravyasravs@gmail.com
*/


select customername,email from customers where city='Hyderabad';

/* output
customername	email
Ravi	  		ravi123@gmail.com
Sravya			sravyasravs@gmail.com
*/

select customername,email from customers where city='Chennai';

/* output
customername	email
Laya			laya54@gmail.com
*/

select customername,email from customers where city='Mumbai';

/* output
 customername, email
 */


