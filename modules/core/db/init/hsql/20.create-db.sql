-- begin QUEMEPONGO_CATEGORIA
create unique index IDX_QUEMEPONGO_CATEGORIA_UNIQ_NOMBRE on QUEMEPONGO_CATEGORIA (NOMBRE) ^
-- end QUEMEPONGO_CATEGORIA
-- begin QUEMEPONGO_MATERIAL
create unique index IDX_QUEMEPONGO_MATERIAL_UNIQ_NOMBRE on QUEMEPONGO_MATERIAL (NOMBRE) ^
-- end QUEMEPONGO_MATERIAL
-- begin QUEMEPONGO_TIPO_PRENDA
alter table QUEMEPONGO_TIPO_PRENDA add constraint FK_QUEMEPONGO_TIPO_PRENDA_ON_CATEGORIA foreign key (CATEGORIA_ID) references QUEMEPONGO_CATEGORIA(ID)^
create unique index IDX_QUEMEPONGO_TIPO_PRENDA_UNIQ_NOMBRE on QUEMEPONGO_TIPO_PRENDA (NOMBRE) ^
create index IDX_QUEMEPONGO_TIPO_PRENDA_ON_CATEGORIA on QUEMEPONGO_TIPO_PRENDA (CATEGORIA_ID)^
-- end QUEMEPONGO_TIPO_PRENDA
-- begin QUEMEPONGO_MATERIAL_POR_PRENDA
alter table QUEMEPONGO_MATERIAL_POR_PRENDA add constraint FK_QUEMEPONGO_MATERIAL_POR_PRENDA_ON_TIPO_PRENDA foreign key (TIPO_PRENDA_ID) references QUEMEPONGO_TIPO_PRENDA(ID)^
alter table QUEMEPONGO_MATERIAL_POR_PRENDA add constraint FK_QUEMEPONGO_MATERIAL_POR_PRENDA_ON_MATERIAL foreign key (MATERIAL_ID) references QUEMEPONGO_MATERIAL(ID)^
create index IDX_QUEMEPONGO_MATERIAL_POR_PRENDA_ON_TIPO_PRENDA on QUEMEPONGO_MATERIAL_POR_PRENDA (TIPO_PRENDA_ID)^
create index IDX_QUEMEPONGO_MATERIAL_POR_PRENDA_ON_MATERIAL on QUEMEPONGO_MATERIAL_POR_PRENDA (MATERIAL_ID)^
-- end QUEMEPONGO_MATERIAL_POR_PRENDA

-- begin QUEMEPONGO_PRENDA
alter table QUEMEPONGO_PRENDA add constraint FK_QUEMEPONGO_PRENDA_ON_TIPO_DE_PRENDA foreign key (TIPO_DE_PRENDA_ID) references QUEMEPONGO_TIPO_PRENDA(ID)^
alter table QUEMEPONGO_PRENDA add constraint FK_QUEMEPONGO_PRENDA_ON_MATERIAL foreign key (MATERIAL_ID) references QUEMEPONGO_MATERIAL(ID)^
alter table QUEMEPONGO_PRENDA add constraint FK_QUEMEPONGO_PRENDA_ON_GUARDARROPA foreign key (GUARDARROPA_ID) references QUEMEPONGO_GUARDARROPA(ID)^
alter table QUEMEPONGO_PRENDA add constraint FK_QUEMEPONGO_PRENDA_ON_IMAGEN foreign key (IMAGEN) references SYS_FILE(ID)^
create index IDX_QUEMEPONGO_PRENDA_ON_TIPO_DE_PRENDA on QUEMEPONGO_PRENDA (TIPO_DE_PRENDA_ID)^
create index IDX_QUEMEPONGO_PRENDA_ON_MATERIAL on QUEMEPONGO_PRENDA (MATERIAL_ID)^
create index IDX_QUEMEPONGO_PRENDA_ON_GUARDARROPA on QUEMEPONGO_PRENDA (GUARDARROPA_ID)^
create index IDX_QUEMEPONGO_PRENDA_ON_IMAGEN on QUEMEPONGO_PRENDA (IMAGEN)^
-- end QUEMEPONGO_PRENDA
-- begin QUEMEPONGO_SUGERENCIA
alter table QUEMEPONGO_SUGERENCIA add constraint FK_QUEMEPONGO_SUGERENCIA_ON_GUARDARROPA foreign key (GUARDARROPA_ID) references QUEMEPONGO_GUARDARROPA(ID)^
create index IDX_QUEMEPONGO_SUGERENCIA_ON_GUARDARROPA on QUEMEPONGO_SUGERENCIA (GUARDARROPA_ID)^
-- end QUEMEPONGO_SUGERENCIA
-- begin QUEMEPONGO_SUGERENCIA_PRENDA_LINK
alter table QUEMEPONGO_SUGERENCIA_PRENDA_LINK add constraint FK_SUGPRE_ON_PRENDA foreign key (PRENDA_ID) references QUEMEPONGO_PRENDA(ID)^
alter table QUEMEPONGO_SUGERENCIA_PRENDA_LINK add constraint FK_SUGPRE_ON_SUGERENCIA foreign key (SUGERENCIA_ID) references QUEMEPONGO_SUGERENCIA(ID)^
-- end QUEMEPONGO_SUGERENCIA_PRENDA_LINK
-- begin QUEMEPONGO_EVENTO
alter table QUEMEPONGO_EVENTO add constraint FK_QUEMEPONGO_EVENTO_ON_GUARDARROPA foreign key (GUARDARROPA_ID) references QUEMEPONGO_GUARDARROPA(ID)^
create index IDX_QUEMEPONGO_EVENTO_ON_GUARDARROPA on QUEMEPONGO_EVENTO (GUARDARROPA_ID)^
-- end QUEMEPONGO_EVENTO
