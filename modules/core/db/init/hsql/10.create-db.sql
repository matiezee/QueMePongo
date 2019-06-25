-- begin QUEMEPONGO_CATEGORIA
create table QUEMEPONGO_CATEGORIA (
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
    --
    primary key (ID)
)^
-- end QUEMEPONGO_CATEGORIA
-- begin QUEMEPONGO_MATERIAL
create table QUEMEPONGO_MATERIAL (
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
    --
    primary key (ID)
)^
-- end QUEMEPONGO_MATERIAL
-- begin QUEMEPONGO_TIPO_PRENDA
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
)^
-- end QUEMEPONGO_TIPO_PRENDA
-- begin QUEMEPONGO_MATERIAL_POR_PRENDA
create table QUEMEPONGO_MATERIAL_POR_PRENDA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIPO_PRENDA_ID varchar(36) not null,
    MATERIAL_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end QUEMEPONGO_MATERIAL_POR_PRENDA
-- begin QUEMEPONGO_GUARDARROPA
create table QUEMEPONGO_GUARDARROPA (
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
    --
    primary key (ID)
)^
-- end QUEMEPONGO_GUARDARROPA
-- begin QUEMEPONGO_PRENDA
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
    COLORPRIMARIO varchar(255) not null,
    COLOR2 varchar(255),
    GUARDARROPA_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end QUEMEPONGO_PRENDA
-- begin QUEMEPONGO_SUGERENCIA
create table QUEMEPONGO_SUGERENCIA (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    GUARDARROPA_ID varchar(36) not null,
    --
    primary key (ID)
)^
-- end QUEMEPONGO_SUGERENCIA
-- begin QUEMEPONGO_SUGERENCIA_PRENDA_LINK
create table QUEMEPONGO_SUGERENCIA_PRENDA_LINK (
    PRENDA_ID varchar(36) not null,
    SUGERENCIA_ID varchar(36) not null,
    primary key (PRENDA_ID, SUGERENCIA_ID)
)^
-- end QUEMEPONGO_SUGERENCIA_PRENDA_LINK
-- begin QUEMEPONGO_EVENTO
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
)^
-- end QUEMEPONGO_EVENTO
