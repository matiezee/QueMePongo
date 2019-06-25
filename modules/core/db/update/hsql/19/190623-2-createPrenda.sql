alter table QUEMEPONGO_PRENDA add constraint FK_QUEMEPONGO_PRENDA_ON_TIPO_DE_PRENDA foreign key (TIPO_DE_PRENDA_ID) references QUEMEPONGO_TIPO_PRENDA(ID);
alter table QUEMEPONGO_PRENDA add constraint FK_QUEMEPONGO_PRENDA_ON_MATERIAL foreign key (MATERIAL_ID) references QUEMEPONGO_MATERIAL(ID);
alter table QUEMEPONGO_PRENDA add constraint FK_QUEMEPONGO_PRENDA_ON_GUARDARROPA foreign key (GUARDARROPA_ID) references QUEMEPONGO_GUARDARROPA(ID);
create index IDX_QUEMEPONGO_PRENDA_ON_TIPO_DE_PRENDA on QUEMEPONGO_PRENDA (TIPO_DE_PRENDA_ID);
create index IDX_QUEMEPONGO_PRENDA_ON_MATERIAL on QUEMEPONGO_PRENDA (MATERIAL_ID);
create index IDX_QUEMEPONGO_PRENDA_ON_GUARDARROPA on QUEMEPONGO_PRENDA (GUARDARROPA_ID);