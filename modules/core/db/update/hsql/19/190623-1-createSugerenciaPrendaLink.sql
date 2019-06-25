create table QUEMEPONGO_SUGERENCIA_PRENDA_LINK (
    PRENDA_ID varchar(36) not null,
    SUGERENCIA_ID varchar(36) not null,
    primary key (PRENDA_ID, SUGERENCIA_ID)
);
