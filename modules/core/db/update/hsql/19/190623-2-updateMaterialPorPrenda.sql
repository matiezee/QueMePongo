-- alter table QUEMEPONGO_MATERIAL_POR_PRENDA add column MATERIAL_ID varchar(36) ^
-- update QUEMEPONGO_MATERIAL_POR_PRENDA set MATERIAL_ID = <default_value> ;
-- alter table QUEMEPONGO_MATERIAL_POR_PRENDA alter column MATERIAL_ID set not null ;
alter table QUEMEPONGO_MATERIAL_POR_PRENDA add column MATERIAL_ID varchar(36) not null ;
-- alter table QUEMEPONGO_MATERIAL_POR_PRENDA add column TIPO_PRENDA_ID varchar(36) ^
-- update QUEMEPONGO_MATERIAL_POR_PRENDA set TIPO_PRENDA_ID = <default_value> ;
-- alter table QUEMEPONGO_MATERIAL_POR_PRENDA alter column TIPO_PRENDA_ID set not null ;
alter table QUEMEPONGO_MATERIAL_POR_PRENDA add column TIPO_PRENDA_ID varchar(36) not null ;
