package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Itinerario generated by hbm2java
 */
public class Itinerario  implements java.io.Serializable {


     private ItinerarioId id;
     private Date fechainicio;
     private Date fechatermino;
     private BigDecimal contrato;

    public Itinerario() {
    }

	
    public Itinerario(ItinerarioId id, BigDecimal contrato) {
        this.id = id;
        this.contrato = contrato;
    }
    public Itinerario(ItinerarioId id, Date fechainicio, Date fechatermino, BigDecimal contrato) {
       this.id = id;
       this.fechainicio = fechainicio;
       this.fechatermino = fechatermino;
       this.contrato = contrato;
    }
   
    public ItinerarioId getId() {
        return this.id;
    }
    
    public void setId(ItinerarioId id) {
        this.id = id;
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
    public BigDecimal getContrato() {
        return this.contrato;
    }
    
    public void setContrato(BigDecimal contrato) {
        this.contrato = contrato;
    }




}

