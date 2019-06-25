create table QUEMEPONGO_PRENDA (
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
    DISPONIBILIDAD boolean not null,
    TIPO_DE_PRENDA_ID varchar(36) not null,
    MATERIAL_ID varchar(36) not null,
    COLOR1 varchar(255) not null,
    COLOR2 varchar(255),
    GUARDARROPA_ID varchar(36) not null,
    --
    primary key (ID)
);