package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private BigDecimal idservicio;
     private BigDecimal tiposervicio;

    public Servicio() {
    }

    public Servicio(BigDecimal idservicio, BigDecimal tiposervicio) {
       this.idservicio = idservicio;
       this.tiposervicio = tiposervicio;
    }
   
    public BigDecimal getIdservicio() {
        return this.idservicio;
    }
    
    public void setIdservicio(BigDecimal idservicio) {
        this.idservicio = idservicio;
    }
    public BigDecimal getTiposervicio() {
        return this.tiposervicio;
    }
    
    public void setTiposervicio(BigDecimal tiposervicio) {
        this.tiposervicio = tiposervicio;
    }




}

