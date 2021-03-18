create table tshirt(
tshirt_id varchar(36) not null primary key,
tshirt_quantity int not null,
tshirt_brand varchar(100) not null,
tshirt_model varchar(100) not null,
description varchar(200) not null,
in_stock boolean not null,
size int not null,
colour varchar(100) not null
)