package com.duoc.desktravel.model;
// Generated 15-10-2017 19:02:40 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Servicio generated by hbm2java
 */
public class Servicio  implements java.io.Serializable {


     private BigDecimal idservicio;
     private Tiposervicio tiposervicio;
     private Set contratos = new HashSet(0);

    public Servicio() {
    }

	
    public Servicio(BigDecimal idservicio, Tiposervicio tiposervicio) {
        this.idservicio = idservicio;
        this.tiposervicio = tiposervicio;
    }
    public Servicio(BigDecimal idservicio, Tiposervicio tiposervicio, Set contratos) {
       this.idservicio = idservicio;
       this.tiposervicio = tiposervicio;
       this.contratos = contratos;
    }
   
    public BigDecimal getIdservicio() {
        return this.idservicio;
    }
    
    public void setIdservicio(BigDecimal idservicio) {
        this.idservicio = idservicio;
    }
    public Tiposervicio getTiposervicio() {
        return this.tiposervicio;
    }
    
    public void setTiposervicio(Tiposervicio tiposervicio) {
        this.tiposervicio = tiposervicio;
    }
    public Set getContratos() {
        return this.contratos;
    }
    
    public void setContratos(Set contratos) {
        this.contratos = contratos;
    }




}


