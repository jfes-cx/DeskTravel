package com.duoc.desktravel.entity;
// Generated 15-10-2017 19:02:40 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Contrato generated by hbm2java
 */
public class Contrato  implements java.io.Serializable {


     private BigDecimal idcontrato;
     private Alumno alumno;
     private Colaborador colaborador;
     private Polizaseguro polizaseguro;
     private Servicio servicio;
     private Tipocontrato tipocontrato;
     private Date fechainicio;
     private Date fechatermino;
     private String nombre;
     private Set itinerarios = new HashSet(0);
     private Set anexoses = new HashSet(0);

    public Contrato() {
    }

	
    public Contrato(BigDecimal idcontrato, Alumno alumno, Colaborador colaborador, Polizaseguro polizaseguro, Servicio servicio, Tipocontrato tipocontrato) {
        this.idcontrato = idcontrato;
        this.alumno = alumno;
        this.colaborador = colaborador;
        this.polizaseguro = polizaseguro;
        this.servicio = servicio;
        this.tipocontrato = tipocontrato;
    }
    public Contrato(BigDecimal idcontrato, Alumno alumno, Colaborador colaborador, Polizaseguro polizaseguro, Servicio servicio, Tipocontrato tipocontrato, Date fechainicio, Date fechatermino, String nombre, Set itinerarios, Set anexoses) {
       this.idcontrato = idcontrato;
       this.alumno = alumno;
       this.colaborador = colaborador;
       this.polizaseguro = polizaseguro;
       this.servicio = servicio;
       this.tipocontrato = tipocontrato;
       this.fechainicio = fechainicio;
       this.fechatermino = fechatermino;
       this.nombre = nombre;
       this.itinerarios = itinerarios;
       this.anexoses = anexoses;
    }
   
    public BigDecimal getIdcontrato() {
        return this.idcontrato;
    }
    
    public void setIdcontrato(BigDecimal idcontrato) {
        this.idcontrato = idcontrato;
    }
    public Alumno getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Colaborador getColaborador() {
        return this.colaborador;
    }
    
    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    public Polizaseguro getPolizaseguro() {
        return this.polizaseguro;
    }
    
    public void setPolizaseguro(Polizaseguro polizaseguro) {
        this.polizaseguro = polizaseguro;
    }
    public Servicio getServicio() {
        return this.servicio;
    }
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public Tipocontrato getTipocontrato() {
        return this.tipocontrato;
    }
    
    public void setTipocontrato(Tipocontrato tipocontrato) {
        this.tipocontrato = tipocontrato;
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
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getItinerarios() {
        return this.itinerarios;
    }
    
    public void setItinerarios(Set itinerarios) {
        this.itinerarios = itinerarios;
    }
    public Set getAnexoses() {
        return this.anexoses;
    }
    
    public void setAnexoses(Set anexoses) {
        this.anexoses = anexoses;
    }




}


