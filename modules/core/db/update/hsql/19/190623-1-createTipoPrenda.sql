create table QUEMEPONGO_TIPO_PRENDA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NOMBRE varchar(255) not null,
    TEMPERATURA integer not null,
    LLUVIA boolean not null,
    VIENTO boolean not null,
    SOL boolean not null,
    CATEGORIA_ID varchar(36) not null,
    --
    primary key (ID)
);