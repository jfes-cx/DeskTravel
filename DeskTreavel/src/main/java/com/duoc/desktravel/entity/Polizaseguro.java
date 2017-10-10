package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Polizaseguro generated by hbm2java
 */
public class Polizaseguro  implements java.io.Serializable {


     private BigDecimal idpolizaseguro;
     private BigDecimal descripcion;
     private BigDecimal tiposeguro;
     private BigDecimal aseguradora;
     private BigDecimal alumno;
     private Date vigenciainicio;
     private Date vigenciatermino;
     private Date fechacontratacion;
     private BigDecimal montoasegurado;

    public Polizaseguro() {
    }

	
    public Polizaseguro(BigDecimal idpolizaseguro, BigDecimal tiposeguro, BigDecimal aseguradora, BigDecimal alumno) {
        this.idpolizaseguro = idpolizaseguro;
        this.tiposeguro = tiposeguro;
        this.aseguradora = aseguradora;
        this.alumno = alumno;
    }
    public Polizaseguro(BigDecimal idpolizaseguro, BigDecimal descripcion, BigDecimal tiposeguro, BigDecimal aseguradora, BigDecimal alumno, Date vigenciainicio, Date vigenciatermino, Date fechacontratacion, BigDecimal montoasegurado) {
       this.idpolizaseguro = idpolizaseguro;
       this.descripcion = descripcion;
       this.tiposeguro = tiposeguro;
       this.aseguradora = aseguradora;
       this.alumno = alumno;
       this.vigenciainicio = vigenciainicio;
       this.vigenciatermino = vigenciatermino;
       this.fechacontratacion = fechacontratacion;
       this.montoasegurado = montoasegurado;
    }
   
    public BigDecimal getIdpolizaseguro() {
        return this.idpolizaseguro;
    }
    
    public void setIdpolizaseguro(BigDecimal idpolizaseguro) {
        this.idpolizaseguro = idpolizaseguro;
    }
    public BigDecimal getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(BigDecimal descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getTiposeguro() {
        return this.tiposeguro;
    }
    
    public void setTiposeguro(BigDecimal tiposeguro) {
        this.tiposeguro = tiposeguro;
    }
    public BigDecimal getAseguradora() {
        return this.aseguradora;
    }
    
    public void setAseguradora(BigDecimal aseguradora) {
        this.aseguradora = aseguradora;
    }
    public BigDecimal getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(BigDecimal alumno) {
        this.alumno = alumno;
    }
    public Date getVigenciainicio() {
        return this.vigenciainicio;
    }
    
    public void setVigenciainicio(Date vigenciainicio) {
        this.vigenciainicio = vigenciainicio;
    }
    public Date getVigenciatermino() {
        return this.vigenciatermino;
    }
    
    public void setVigenciatermino(Date vigenciatermino) {
        this.vigenciatermino = vigenciatermino;
    }
    public Date getFechacontratacion() {
        return this.fechacontratacion;
    }
    
    public void setFechacontratacion(Date fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }
    public BigDecimal getMontoasegurado() {
        return this.montoasegurado;
    }
    
    public void setMontoasegurado(BigDecimal montoasegurado) {
        this.montoasegurado = montoasegurado;
    }




}


