
insert into store (name) values ('costco');
insert into store (name) values ('Best Buy');
insert into location (address,storeid) values ('heartland-costco',1);
insert into location (address,storeid) values ('dixie-costco',1);
insert into location (address,storeid) values ('bramlea-bestbuy',2);
insert into location (address,storeid) values ('heartland-bestbuy',2);

insert into category (name ) values('electronic');
insert into category (name ) values('appliance');
insert into category (name ) values('food');

insert into product (name ) values('S7');
insert into product (name ) values('iPhone');
insert into product (name ) values('LG');

insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('A','Extreme right', 1,1);
insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('B','Middle', 1,2);
insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('C','Extreme left', 1,3);


insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('A','Center', 2,1);
insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('B','Left', 2,2);
insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('C','Right', 2,3);

insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('1','Front', 3,1);
insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('1','Front', 3,2);

insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('2','Front left', 4,1);
insert into aisle_category_at_location (aisle_name,description,locationid,categoryid) values('2','Back', 4,2);


insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('A','Extreme right', 1,1);
insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('B','Middle', 1,2);
insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('C','Extreme left', 1,3);

insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('A','Center', 2,1);
insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('B','Left', 2,2);
insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('C','Right', 2,3);

insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('1','Front', 3,1);
insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('1','Front', 3,2);

insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('2','Front left', 4,1);
insert into aisle_product_at_location (aisle_name,description,locationid,productid) values('2','Back', 4,2);
