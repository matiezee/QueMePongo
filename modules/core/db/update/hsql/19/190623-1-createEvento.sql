create table QUEMEPONGO_EVENTO (
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
    FECHA date not null,
    CIUDAD varchar(255) not null,
    GUARDARROPA_ID varchar(36) not null,
    --
    primary key (ID)
);