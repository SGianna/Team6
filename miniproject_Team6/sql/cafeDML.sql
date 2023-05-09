use fisa;



-- 주문 테이블
insert into grade (grade_id, grade_name ,standard) values (10,'Family',0);
insert into grade (grade_id, grade_name ,standard) values (20,'Gold',5000);
insert into grade (grade_id, grade_name ,standard) values (30,'VIP',10000);
select * from grade;

-- 고객 테이블
insert into customer (cust_id,cust_name,cust_phone,cust_birth,gender,amount,grade_id) values ('00001','고재민','010-4512-6065','1998-07-31','M',0,10);
insert into customer (cust_id,cust_name,cust_phone,cust_birth,gender,amount,grade_id) values ('00002','김하늘','010-4100-5335','1999-05-06','F',0,20);
select * from customer;

-- 메뉴 테이블
insert into menu (menu_id,menu_name,price,categories,calorie) values (1000,'에스프레소',5500,1000,5);
insert into menu (menu_id,menu_name,price,categories,calorie) values (1001,'아메리카노',4500,1000,10);
insert into menu (menu_id,menu_name,price,categories,calorie) values (1002,'카페라떼',5000,1000,110);
insert into menu (menu_id,menu_name,price,categories,calorie) values (1003,'돌체콜드브루',6000,1000,265);
insert into menu (menu_id,menu_name,price,categories,calorie) values (2000,'유스베리티',7000,2000,175);
insert into menu (menu_id,menu_name,price,categories,calorie) values (2001,'유자민트티',5900,2000,145);
insert into menu (menu_id,menu_name,price,categories,calorie) values (2002,'자몽허니블랙티',5700,2000,125);
insert into menu (menu_id,menu_name,price,categories,calorie) values (3000,'유자에이드',5900,3000,65);
insert into menu (menu_id,menu_name,price,categories,calorie) values (3001,'레몬에이드',5400,3000,65);
select * from menu;


-- 주문 테이블

insert into sale(order_id,order_date,total,cust_id) values (1,'2023/05/04',9500,null);
insert into sale(order_id,order_date,total,cust_id) values (2,'2023/05/05',10500,'CM001');
insert into sale(order_id,order_date,total,cust_id) values (3,'2023/05/06',4500,'CM002');
select * from sale;


