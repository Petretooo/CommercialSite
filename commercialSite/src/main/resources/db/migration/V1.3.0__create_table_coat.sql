create table coat(
coat_id varchar(36) not null primary key,
coat_quantity int not null,
coat_brand varchar(100) not null,
coat_model varchar(100) not null,
description varchar(200) not null,
inStock boolean not null,
size int not null,
colour varchar(100) not null
)
