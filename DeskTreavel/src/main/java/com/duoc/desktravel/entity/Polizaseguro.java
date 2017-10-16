package com.duoc.desktravel.entity;
// Generated 15-10-2017 19:02:40 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Polizaseguro generated by hbm2java
 */
public class Polizaseguro  implements java.io.Serializable {


     private BigDecimal idpolizaseguros;
     private Alumno alumno;
     private Aseguradora aseguradora;
     private Tiposeguro tiposeguro;
     private String descripcion;
     private Date vigenciainicio;
     private Date vigenciatermino;
     private Date fechacontratacion;
     private BigDecimal montoasegurado;
     private Set contratos = new HashSet(0);

    public Polizaseguro() {
    }

	
    public Polizaseguro(BigDecimal idpolizaseguros, Alumno alumno, Aseguradora aseguradora, Tiposeguro tiposeguro) {
        this.idpolizaseguros = idpolizaseguros;
        this.alumno = alumno;
        this.aseguradora = aseguradora;
        this.tiposeguro = tiposeguro;
    }
    public Polizaseguro(BigDecimal idpolizaseguros, Alumno alumno, Aseguradora aseguradora, Tiposeguro tiposeguro, String descripcion, Date vigenciainicio, Date vigenciatermino, Date fechacontratacion, BigDecimal montoasegurado, Set contratos) {
       this.idpolizaseguros = idpolizaseguros;
       this.alumno = alumno;
       this.aseguradora = aseguradora;
       this.tiposeguro = tiposeguro;
       this.descripcion = descripcion;
       this.vigenciainicio = vigenciainicio;
       this.vigenciatermino = vigenciatermino;
       this.fechacontratacion = fechacontratacion;
       this.montoasegurado = montoasegurado;
       this.contratos = contratos;
    }
   
    public BigDecimal getIdpolizaseguros() {
        return this.idpolizaseguros;
    }
    
    public void setIdpolizaseguros(BigDecimal idpolizaseguros) {
        this.idpolizaseguros = idpolizaseguros;
    }
    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Aseguradora getAseguradora() {
        return this.aseguradora;
    }
    
    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }
    public Tiposeguro getTiposeguro() {
        return this.tiposeguro;
    }
    
    public void setTiposeguro(Tiposeguro tiposeguro) {
        this.tiposeguro = tiposeguro;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
    public Set getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set contratos) {
        this.contratos = contratos;
    }




}


