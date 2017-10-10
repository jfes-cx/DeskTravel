-- Generado por Oracle SQL Developer Data Modeler 17.2.0.188.1059
--   en:        2017-09-25 21:05:27 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



CREATE TABLE actividad (
    idactividad     INTEGER
        CONSTRAINT nnc_actividad_idactividad NOT NULL,
    curso_idcurso   INTEGER
        CONSTRAINT nnc_actividad_curso_idcurso NOT NULL,
    tipoactividad   INTEGER NOT NULL
);

COMMENT ON COLUMN actividad.idactividad IS
    'PK';

ALTER TABLE actividad ADD CONSTRAINT actividad_pk PRIMARY KEY ( idactividad );

CREATE TABLE actividadaportes (
    actividad       INTEGER NOT NULL,
    cuentaalumnos   INTEGER NOT NULL,
    monto           INTEGER,
    aporte          INTEGER NOT NULL
);

ALTER TABLE actividadaportes
    ADD CONSTRAINT actividadaportes_pk PRIMARY KEY ( aporte,actividad,cuentaalumnos );

CREATE TABLE actividadviaje (
    idactividadviaje     INTEGER NOT NULL,
    nombre               VARCHAR2(100),
    descripcion          VARCHAR2(200),
    fechainicio          DATE,
    fechatermino         DATE,
    tipoactividadviaje   INTEGER NOT NULL
);

ALTER TABLE actividadviaje ADD CONSTRAINT actividadviaje_pk PRIMARY KEY ( idactividadviaje );

CREATE TABLE alumno (
    idalumno            INTEGER NOT NULL,
    nombre              VARCHAR2(200),
    dirección           VARCHAR2(200),
    apoderado           INTEGER NOT NULL,
    telefono            INTEGER,
    correoelectronico   VARCHAR2(200) NOT NULL,
    curso               INTEGER NOT NULL
);

CREATE UNIQUE INDEX alumno__idx ON
    alumno ( apoderado ASC );

ALTER TABLE alumno ADD CONSTRAINT alumno_pk PRIMARY KEY ( idalumno );

CREATE TABLE anexos (
    idanexo    INTEGER NOT NULL,
    "File"     VARCHAR2(300) NOT NULL,
    contrato   INTEGER NOT NULL,
    token      VARCHAR2(300)
);

ALTER TABLE anexos ADD CONSTRAINT anexos_pk PRIMARY KEY ( idanexo );

CREATE TABLE apoderado (
    idapoderado   INTEGER NOT NULL,
    nombre        VARCHAR2(200) NOT NULL,
    rut           NCHAR(15),
    direccion     VARCHAR2(200),
    telefono      INTEGER,
    celular       NCHAR(20)
);

ALTER TABLE apoderado ADD CONSTRAINT apoderado_pk PRIMARY KEY ( idapoderado );

CREATE TABLE aseguradora (
    nombre        VARCHAR2(200),
    direccion     VARCHAR2(200),
    aseguradora   INTEGER NOT NULL
);

ALTER TABLE aseguradora ADD CONSTRAINT aseguradoraseguro_pk PRIMARY KEY ( aseguradora );

CREATE TABLE colegio (
    idcolegio         INTEGER NOT NULL,
    nombre            VARCHAR2(200),
    direccion         VARCHAR2(200),
    telefono          INTEGER,
    comuna_idcomuna   INTEGER NOT NULL
);

ALTER TABLE colegio ADD CONSTRAINT colegio_pk PRIMARY KEY ( idcolegio );

CREATE TABLE comuna (
    idcomuna   INTEGER NOT NULL,
    nombre     VARCHAR2(200),
    region     INTEGER NOT NULL
);

ALTER TABLE comuna ADD CONSTRAINT comuna_pk PRIMARY KEY ( idcomuna );

CREATE TABLE contrato (
    idcontrato     INTEGER NOT NULL,
    tipocontrato   INTEGER NOT NULL,
    vendedor       INTEGER NOT NULL,
    fechainicio    DATE,
    fechatermino   DATE,
    alumno         INTEGER NOT NULL,
    garantia       INTEGER NOT NULL
);

ALTER TABLE contrato ADD CONSTRAINT contrato_pk PRIMARY KEY ( idcontrato );

CREATE TABLE cuenta (
    idusuario           INTEGER NOT NULL,
    conexion            NVARCHAR2(40) NOT NULL,
    contrasena          VARCHAR2(20) NOT NULL,
    nombre              INTEGER NOT NULL,
    apellido            VARCHAR2(100),
    correoelectronico   VARCHAR2(100)
);

ALTER TABLE cuenta ADD CONSTRAINT usuario_pk PRIMARY KEY ( idusuario );

CREATE TABLE cuentaalumno (
    idcuentaalumnos   INTEGER NOT NULL,
    cupototal         INTEGER,
    cupoutilizado     INTEGER,
    tipocuenta        INTEGER NOT NULL,
    alumno            INTEGER NOT NULL,
    aporte            INTEGER NOT NULL,
    saldo             INTEGER
);

CREATE UNIQUE INDEX cuentaalumno__idx ON
    cuentaalumno ( alumno ASC );

ALTER TABLE cuentaalumno ADD CONSTRAINT cuentaalumno_pk PRIMARY KEY ( idcuentaalumnos );

CREATE TABLE cuentacurso (
    idcuentacurso   INTEGER NOT NULL,
    curso           INTEGER NOT NULL,
    saldo           INTEGER
);

ALTER TABLE cuentacurso ADD CONSTRAINT cuentacurso_pk PRIMARY KEY ( idcuentacurso );

CREATE TABLE curso (
    idcurso   INTEGER NOT NULL,
    nombre    VARCHAR2(100),
    colegio   INTEGER NOT NULL
);

ALTER TABLE curso ADD CONSTRAINT curso_pk PRIMARY KEY ( idcurso );

CREATE TABLE destino (
    iddestino   INTEGER NOT NULL,
    nombre      VARCHAR2(100),
    pais        INTEGER NOT NULL
);

ALTER TABLE destino ADD CONSTRAINT destino_pk PRIMARY KEY ( iddestino );

CREATE TABLE estadocuenta (
    id             INTEGER NOT NULL,
    cuentaalumno   INTEGER NOT NULL,
    detalle        VARCHAR2(200)
);

ALTER TABLE estadocuenta ADD CONSTRAINT estadocuenta_pk PRIMARY KEY ( id );

CREATE TABLE itinerario (
    destino          INTEGER NOT NULL,
    origen           INTEGER NOT NULL,
    actividadviaje   INTEGER NOT NULL,
    fechainicio      DATE,
    fechatermino     DATE,
    contrato         INTEGER NOT NULL
);

ALTER TABLE itinerario
    ADD CONSTRAINT itinerario_pk PRIMARY KEY ( destino,actividadviaje,origen );

CREATE TABLE origen (
    idorigen   INTEGER NOT NULL,
    pais       INTEGER NOT NULL
);

ALTER TABLE origen ADD CONSTRAINT origen_pk PRIMARY KEY ( idorigen );

CREATE TABLE pago (
    idpago           INTEGER NOT NULL,
    cuentacurso      INTEGER NOT NULL,
    fechapago        DATE,
    detalle          VARCHAR2(200),
    montocancelado   VARCHAR2(100)
    ,
    tipopago         INTEGER NOT NULL,
    cuentaalumno     INTEGER NOT NULL
);

ALTER TABLE pago ADD CONSTRAINT pago_pk PRIMARY KEY ( idpago );

CREATE TABLE pais (
    idpais   INTEGER NOT NULL,
    nombre   VARCHAR2(200)
);

ALTER TABLE pais ADD CONSTRAINT pais_pk PRIMARY KEY ( idpais );

CREATE TABLE perfil (
    idperfil      INTEGER NOT NULL,
    descripción   VARCHAR2(200),
    estado        VARCHAR2(200)
);

ALTER TABLE perfil ADD CONSTRAINT perfil_pk PRIMARY KEY ( idperfil );

CREATE TABLE permiso (
    idpermiso     INTEGER NOT NULL,
    nombre        VARCHAR2(100),
    descripcion   VARCHAR2(200),
    perfil        INTEGER NOT NULL
);

ALTER TABLE permiso ADD CONSTRAINT permiso_pk PRIMARY KEY ( idpermiso );

CREATE TABLE polizaseguro (
    idpolizaseguros     INTEGER NOT NULL,
    descripción         INTEGER,
    tiposeguro          INTEGER NOT NULL,
    aseguradora         INTEGER NOT NULL,
    alumno              INTEGER NOT NULL,
    vigenciainicio      DATE,
    vigenciatermino     DATE,
    fechacontratacion   DATE,
    montoasegurado      INTEGER
);

ALTER TABLE polizaseguro ADD CONSTRAINT polizaseguro_pk PRIMARY KEY ( idpolizaseguros );

CREATE TABLE region (
    idregion   INTEGER NOT NULL,
    nombre     VARCHAR2(200) NOT NULL,
    pais       INTEGER NOT NULL
);

ALTER TABLE region ADD CONSTRAINT region_pk PRIMARY KEY ( idregion );

CREATE TABLE servicio (
    idservicio     INTEGER NOT NULL,
    tiposervicio   INTEGER NOT NULL
);

ALTER TABLE servicio ADD CONSTRAINT servicios_pk PRIMARY KEY ( idservicio );

CREATE TABLE tipoactividad (
    idtipoactividad   INTEGER NOT NULL,
    nombre            VARCHAR2(300)
);

ALTER TABLE tipoactividad ADD CONSTRAINT tipoactividad_pk PRIMARY KEY ( idtipoactividad );

CREATE TABLE tipoactividadviaje (
    idtipoactividadviaje   INTEGER NOT NULL,
    nombre                 VARCHAR2(100),
    descripcion            VARCHAR2(200)
);

ALTER TABLE tipoactividadviaje ADD CONSTRAINT tipoactividadviaje_pk PRIMARY KEY ( idtipoactividadviaje );

CREATE TABLE tipocontrato (
    idtipocontrato   INTEGER NOT NULL,
    nombre           VARCHAR2(200) NOT NULL
);

ALTER TABLE tipocontrato ADD CONSTRAINT tipocontrato_pk PRIMARY KEY ( idtipocontrato );

CREATE TABLE tipocuenta (
    idtipocuenta   INTEGER NOT NULL,
    nombre         VARCHAR2(200)
);

ALTER TABLE tipocuenta ADD CONSTRAINT tipocuenta_pk PRIMARY KEY ( idtipocuenta );

CREATE TABLE tipopago (
    idtipopago    INTEGER NOT NULL,
    descripcion   VARCHAR2(200)
);

ALTER TABLE tipopago ADD CONSTRAINT tipopago_pk PRIMARY KEY ( idtipopago );

CREATE TABLE tiposeguro (
    idtiposeguro   INTEGER NOT NULL,
    nombre         VARCHAR2(100),
    descripcion    VARCHAR2(200)
);

ALTER TABLE tiposeguro ADD CONSTRAINT tiposeguro_pk PRIMARY KEY ( idtiposeguro );

CREATE TABLE tiposervicio (
    idtiposervicio   INTEGER NOT NULL,
    nombre           VARCHAR2(200),
    descripcion      VARCHAR2(200)
);

ALTER TABLE tiposervicio ADD CONSTRAINT tiposervicios_pk PRIMARY KEY ( idtiposervicio );

ALTER TABLE actividad
    ADD CONSTRAINT actividad_curso_fk FOREIGN KEY ( curso_idcurso )
        REFERENCES curso ( idcurso );

ALTER TABLE actividadaportes
    ADD CONSTRAINT actividadaportes_actividad_fk FOREIGN KEY ( actividad )
        REFERENCES actividad ( idactividad );

ALTER TABLE alumno
    ADD CONSTRAINT alumno_apoderado_fk FOREIGN KEY ( apoderado )
        REFERENCES apoderado ( idapoderado );

ALTER TABLE alumno
    ADD CONSTRAINT alumno_curso_fk FOREIGN KEY ( curso )
        REFERENCES curso ( idcurso );

ALTER TABLE anexos
    ADD CONSTRAINT anexos_contrato_fk FOREIGN KEY ( contrato )
        REFERENCES contrato ( idcontrato );

ALTER TABLE colegio
    ADD CONSTRAINT colegio_comuna_fk FOREIGN KEY ( comuna_idcomuna )
        REFERENCES comuna ( idcomuna );

ALTER TABLE comuna
    ADD CONSTRAINT comuna_region_fk FOREIGN KEY ( region )
        REFERENCES region ( idregion );

ALTER TABLE contrato
    ADD CONSTRAINT contrato_alumno_fk FOREIGN KEY ( alumno )
        REFERENCES alumno ( idalumno );

ALTER TABLE contrato
    ADD CONSTRAINT contrato_polizaseguros_fk FOREIGN KEY ( garantia )
        REFERENCES servicio ( idservicio );

ALTER TABLE contrato
    ADD CONSTRAINT contrato_tipocontrato_fk FOREIGN KEY ( tipocontrato )
        REFERENCES tipocontrato ( idtipocontrato );

ALTER TABLE cuentaalumno
    ADD CONSTRAINT cuentaalumno_alumno_fk FOREIGN KEY ( alumno )
        REFERENCES alumno ( idalumno );

ALTER TABLE actividadaportes
    ADD CONSTRAINT cuentaalumno_fk FOREIGN KEY ( cuentaalumnos )
        REFERENCES cuentaalumno ( idcuentaalumnos );

ALTER TABLE cuentaalumno
    ADD CONSTRAINT cuentaalumno_tipocuenta_fk FOREIGN KEY ( tipocuenta )
        REFERENCES tipocuenta ( idtipocuenta );

ALTER TABLE cuentacurso
    ADD CONSTRAINT cuentacurso_curso_fk FOREIGN KEY ( curso )
        REFERENCES curso ( idcurso );

ALTER TABLE curso
    ADD CONSTRAINT curso_colegio_fk FOREIGN KEY ( colegio )
        REFERENCES colegio ( idcolegio );

ALTER TABLE destino
    ADD CONSTRAINT destino_pais_fk FOREIGN KEY ( pais )
        REFERENCES pais ( idpais );

ALTER TABLE estadocuenta
    ADD CONSTRAINT estadocuenta_cuentaalumno_fk FOREIGN KEY ( cuentaalumno )
        REFERENCES cuentaalumno ( idcuentaalumnos );

ALTER TABLE itinerario
    ADD CONSTRAINT itinerario_actividadviaje_fk FOREIGN KEY ( actividadviaje )
        REFERENCES actividadviaje ( idactividadviaje );

ALTER TABLE itinerario
    ADD CONSTRAINT itinerario_contrato_fk FOREIGN KEY ( contrato )
        REFERENCES contrato ( idcontrato );

ALTER TABLE itinerario
    ADD CONSTRAINT itinerario_destino_fk FOREIGN KEY ( destino )
        REFERENCES destino ( iddestino );

ALTER TABLE itinerario
    ADD CONSTRAINT itinerario_origen_fk FOREIGN KEY ( origen )
        REFERENCES origen ( idorigen );

ALTER TABLE origen
    ADD CONSTRAINT origen_pais_fk FOREIGN KEY ( pais )
        REFERENCES pais ( idpais );

ALTER TABLE pago
    ADD CONSTRAINT pago_cuentaalumno_fk FOREIGN KEY ( cuentaalumno )
        REFERENCES cuentaalumno ( idcuentaalumnos );

ALTER TABLE pago
    ADD CONSTRAINT pago_cuentacurso_fk FOREIGN KEY ( cuentacurso )
        REFERENCES cuentacurso ( idcuentacurso );

ALTER TABLE pago
    ADD CONSTRAINT pago_tipopago_fk FOREIGN KEY ( tipopago )
        REFERENCES tipopago ( idtipopago );

ALTER TABLE permiso
    ADD CONSTRAINT permiso_perfil_fk FOREIGN KEY ( perfil )
        REFERENCES perfil ( idperfil );

ALTER TABLE polizaseguro
    ADD CONSTRAINT polizaseguro_alumno_fk FOREIGN KEY ( alumno )
        REFERENCES alumno ( idalumno );

ALTER TABLE polizaseguro
    ADD CONSTRAINT polizaseguro_aseguradora_fk FOREIGN KEY ( aseguradora )
        REFERENCES aseguradora ( aseguradora );

ALTER TABLE polizaseguro
    ADD CONSTRAINT polizaseguro_tiposeguro_fk FOREIGN KEY ( tiposeguro )
        REFERENCES tiposeguro ( idtiposeguro );

ALTER TABLE region
    ADD CONSTRAINT region_pais_fk FOREIGN KEY ( pais )
        REFERENCES pais ( idpais );

ALTER TABLE servicio
    ADD CONSTRAINT servicios_tiposervicios_fk FOREIGN KEY ( tiposervicio )
        REFERENCES tiposervicio ( idtiposervicio );

ALTER TABLE actividad
    ADD CONSTRAINT tipoactividad_fk FOREIGN KEY ( tipoactividad )
        REFERENCES tipoactividad ( idtipoactividad );

ALTER TABLE actividadviaje
    ADD CONSTRAINT tipoactividadviaje_fk FOREIGN KEY ( tipoactividadviaje )
        REFERENCES tipoactividadviaje ( idtipoactividadviaje );

ALTER TABLE cuenta
    ADD CONSTRAINT usuario_perfil_fk FOREIGN KEY ( nombre )
        REFERENCES perfil ( idperfil );



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            32
-- CREATE INDEX                             2
-- ALTER TABLE                             66
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   2
-- WARNINGS                                 0
