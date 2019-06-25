alter table QUEMEPONGO_PRENDA alter column COLOR1 rename to COLOR1__U15453 ^
alter table QUEMEPONGO_PRENDA alter column COLOR1__U15453 set null ;
alter table QUEMEPONGO_PRENDA add column COLORPRIMARIO varchar(255) ^
update QUEMEPONGO_PRENDA set COLORPRIMARIO = '' where COLORPRIMARIO is null ;
alter table QUEMEPONGO_PRENDA alter column COLORPRIMARIO set not null ;
