create table bag(
bag_id varchar(36) not null primary key,
bag_quantity int not null,
bag_brand varchar(100) not null,
bag_model varchar(100) not null,
description varchar(200) not null,
in_stock boolean  not null
)
