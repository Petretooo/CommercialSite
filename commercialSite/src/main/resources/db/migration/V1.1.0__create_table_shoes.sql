create table shoes(
shoes_id varchar(36) not null primary key,
shoes_quantity int not null,
shoes_brand varchar(100) not null,
shoes_model varchar(100) not null,
description varchar(200) not null,
in_stock boolean  not null,
shoes_size int not null
)