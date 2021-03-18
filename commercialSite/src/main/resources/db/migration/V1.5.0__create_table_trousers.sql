create table trousers(
trousers_id varchar(36) not null primary key,
trousers_quantity int not null,
trousers_brand varchar(100) not null,
trousers_model varchar(100) not null,
description varchar(200) not null,
in_stock boolean not null,
size int not null,
colour varchar(100) not null
)