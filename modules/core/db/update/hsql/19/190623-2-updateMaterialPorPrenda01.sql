alter table QUEMEPONGO_MATERIAL_POR_PRENDA add constraint FK_QUEMEPONGO_MATERIAL_POR_PRENDA_ON_MATERIAL foreign key (MATERIAL_ID) references QUEMEPONGO_MATERIAL(ID);
create index IDX_QUEMEPONGO_MATERIAL_POR_PRENDA_ON_MATERIAL on QUEMEPONGO_MATERIAL_POR_PRENDA (MATERIAL_ID);
