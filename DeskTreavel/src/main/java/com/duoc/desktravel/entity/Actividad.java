package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Actividad generated by hbm2java
 */
public class Actividad  implements java.io.Serializable {


     private BigDecimal idactividad;
     private BigDecimal cursoIdcurso;
     private BigDecimal tipoactividad;
     private String nombre;
     private Date fechainicio;
     private Date fechatermino;
     private BigDecimal capacidadpersona;
     private BigDecimal montorecaudado;

    public Actividad() {
    }

	
    public Actividad(BigDecimal idactividad, BigDecimal cursoIdcurso, BigDecimal tipoactividad) {
        this.idactividad = idactividad;
        this.cursoIdcurso = cursoIdcurso;
        this.tipoactividad = tipoactividad;
    }
    public Actividad(BigDecimal idactividad, BigDecimal cursoIdcurso, BigDecimal tipoactividad, String nombre, Date fechainicio, Date fechatermino, BigDecimal capacidadpersona, BigDecimal montorecaudado) {
       this.idactividad = idactividad;
       this.cursoIdcurso = cursoIdcurso;
       this.tipoactividad = tipoactividad;
       this.nombre = nombre;
       this.fechainicio = fechainicio;
       this.fechatermino = fechatermino;
       this.capacidadpersona = capacidadpersona;
       this.montorecaudado = montorecaudado;
    }
   
    public BigDecimal getIdactividad() {
        return this.idactividad;
    }
    
    public void setIdactividad(BigDecimal idactividad) {
        this.idactividad = idactividad;
    }
    public BigDecimal getCursoIdcurso() {
        return this.cursoIdcurso;
    }
    
    public void setCursoIdcurso(BigDecimal cursoIdcurso) {
        this.cursoIdcurso = cursoIdcurso;
    }
    public BigDecimal getTipoactividad() {
        return this.tipoactividad;
    }
    
    public void setTipoactividad(BigDecimal tipoactividad) {
        this.tipoactividad = tipoactividad;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechainicio() {
        return this.fechainicio;
    }
    
    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }
    public Date getFechatermino() {
        return this.fechatermino;
    }
    
    public void setFechatermino(Date fechatermino) {
        this.fechatermino = fechatermino;
    }
    public BigDecimal getCapacidadpersona() {
        return this.capacidadpersona;
    }
    
    public void setCapacidadpersona(BigDecimal capacidadpersona) {
        this.capacidadpersona = capacidadpersona;
    }
    public BigDecimal getMontorecaudado() {
        return this.montorecaudado;
    }
    
    public void setMontorecaudado(BigDecimal montorecaudado) {
        this.montorecaudado = montorecaudado;
    }




}


