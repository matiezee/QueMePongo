alter table QUEMEPONGO_SUGERENCIA_PRENDA_LINK add constraint FK_SUGPRE_ON_PRENDA foreign key (PRENDA_ID) references QUEMEPONGO_PRENDA(ID);
alter table QUEMEPONGO_SUGERENCIA_PRENDA_LINK add constraint FK_SUGPRE_ON_SUGERENCIA foreign key (SUGERENCIA_ID) references QUEMEPONGO_SUGERENCIA(ID);