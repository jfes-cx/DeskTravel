package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Curso generated by hbm2java
 */
public class Curso  implements java.io.Serializable {


     private BigDecimal idcurso;
     private String nombre;
     private BigDecimal idcolegio;

    public Curso() {
    }

	
    public Curso(BigDecimal idcurso, BigDecimal idcolegio) {
        this.idcurso = idcurso;
        this.idcolegio = idcolegio;
    }
    public Curso(BigDecimal idcurso, String nombre, BigDecimal idcolegio) {
       this.idcurso = idcurso;
       this.nombre = nombre;
       this.idcolegio = idcolegio;
    }
   
    public BigDecimal getIdcurso() {
        return this.idcurso;
    }
    
    public void setIdcurso(BigDecimal idcurso) {
        this.idcurso = idcurso;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public BigDecimal getIdcolegio() {
        return this.idcolegio;
    }
    
    public void setIdcolegio(BigDecimal idcolegio) {
        this.idcolegio = idcolegio;
    }




}

