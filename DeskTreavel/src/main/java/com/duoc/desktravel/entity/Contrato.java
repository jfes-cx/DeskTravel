package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Contrato generated by hbm2java
 */
public class Contrato  implements java.io.Serializable {


     private BigDecimal idcontrato;
     private BigDecimal tipocontrato;
     private BigDecimal vendedor;
     private Date fechainicio;
     private Date fechatermino;
     private BigDecimal alumno;
     private BigDecimal garantia;

    public Contrato() {
    }

	
    public Contrato(BigDecimal idcontrato, BigDecimal tipocontrato, BigDecimal vendedor, BigDecimal alumno, BigDecimal garantia) {
        this.idcontrato = idcontrato;
        this.tipocontrato = tipocontrato;
        this.vendedor = vendedor;
        this.alumno = alumno;
        this.garantia = garantia;
    }
    public Contrato(BigDecimal idcontrato, BigDecimal tipocontrato, BigDecimal vendedor, Date fechainicio, Date fechatermino, BigDecimal alumno, BigDecimal garantia) {
       this.idcontrato = idcontrato;
       this.tipocontrato = tipocontrato;
       this.vendedor = vendedor;
       this.fechainicio = fechainicio;
       this.fechatermino = fechatermino;
       this.alumno = alumno;
       this.garantia = garantia;
    }
   
    public BigDecimal getIdcontrato() {
        return this.idcontrato;
    }
    
    public void setIdcontrato(BigDecimal idcontrato) {
        this.idcontrato = idcontrato;
    }
    public BigDecimal getTipocontrato() {
        return this.tipocontrato;
    }
    
    public void setTipocontrato(BigDecimal tipocontrato) {
        this.tipocontrato = tipocontrato;
    }
    public BigDecimal getVendedor() {
        return this.vendedor;
    }
    
    public void setVendedor(BigDecimal vendedor) {
        this.vendedor = vendedor;
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
    public BigDecimal getAlumno() {
        return this.alumno;
    }
    
    public void setAlumno(BigDecimal alumno) {
        this.alumno = alumno;
    }
    public BigDecimal getGarantia() {
        return this.garantia;
    }
    
    public void setGarantia(BigDecimal garantia) {
        this.garantia = garantia;
    }




}

