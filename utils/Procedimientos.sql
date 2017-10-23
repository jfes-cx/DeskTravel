create or replace procedure OBTENER_COMUNA_BYREG(prc out sys_refcursor,p_idregion IN NUMBER)
is
 begin
 open prc for select * from COMUNA where IDREGION = p_idregion ;
  end;
  
create or replace procedure INSERT_COLEGIO (p_idcolegio out NUMBER,p_nombre IN VARCHAR2, p_direccion IN VARCHAR2,p_telefono IN VARCHAR2,p_comuna IN NUMBER)
is
 begin
  INSERT INTO COLEGIO(NOMBRE,DIRECCION,TELEFONO,IDCOMUNA)
  VALUES (p_nombre,p_direccion,p_telefono,p_comuna) returning IDCOLEGIO into p_idcolegio;
  COMMIT;
  end;
  
  create or replace procedure INSERT_CURSO (p_idcurso out NUMBER,p_nombre IN VARCHAR2, p_profejefe IN VARCHAR2,p_idcolegio IN NUMBER)
is
 begin
  INSERT INTO CURSO(NOMBRE,PROFESORJEFE,IDCOLEGIO)
  VALUES (p_nombre,p_profejefe,p_idcolegio) returning IDCURSO into p_idcurso;
  COMMIT;
  end;
  
  create or replace procedure OBTENER_CURSO_BYCOL(prc out sys_refcursor,p_idcolegio IN NUMBER)
is
 begin
 open prc for select * from CURSO where IDCOLEGIO = p_idcolegio;
  end;
  
   create or replace procedure OBTENER_ALUMNO_BYCUR(prc out sys_refcursor,p_idcurso IN NUMBER)
is
 begin
    open prc for select al.*,ap.NOMBRE as "NOMBREAPODERADO" from ALUMNO al inner join APODERADO ap on al.IDAPODERADO = ap.IDAPODERADO  where IDCURSO = p_idcurso; 
  end;
  
select al.*,ap.NOMBRE as "NOMBREAPODERADO" from ALUMNO al inner join APODERADO ap on al.IDAPODERADO = ap.IDAPODERADO  where IDCURSO = 1; 

  create or replace procedure INSERT_ALUMNO (p_idalumno out NUMBER,p_nombre IN VARCHAR2, p_direccion IN VARCHAR2,p_telefono IN VARCHAR2,p_correo IN VARCHAR2, p_rut  IN VARCHAR2, p_idapoderado IN NUMBER,p_idcurso IN NUMBER)
is
 begin
  INSERT INTO ALUMNO(NOMBRE,DIRECCION,TELEFONO,CORREOELECTRONICO,RUT,IDAPODERADO,IDCURSO)
  VALUES (p_nombre,p_direccion,p_telefono,p_correo,p_rut,p_idapoderado,p_idcurso) returning IDALUMNO into p_idalumno;
  COMMIT;
  end;
  
  select cu.*,pe.DESCRIPCION from CUENTAUSUARIO cu inner join PERFIL pe on cu.IDPERFIL = pe.IDPERFIL
  
create or replace procedure OBTENER_CUENTA_BYNOM(prc out sys_refcursor,p_nombre IN VARCHAR2)
is
 begin
    open prc for select cu.*,pe.DESCRIPCION from CUENTAUSUARIO cu inner join PERFIL pe on cu.IDPERFIL = pe.IDPERFIL  where cu.NOMBREUSUARIO = p_nombre; 
  end;
  