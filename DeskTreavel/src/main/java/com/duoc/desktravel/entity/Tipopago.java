package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Tipopago generated by hbm2java
 */
public class Tipopago  implements java.io.Serializable {


     private BigDecimal idtipopago;
     private String descripcion;

    public Tipopago() {
    }

	
    public Tipopago(BigDecimal idtipopago) {
        this.idtipopago = idtipopago;
    }
    public Tipopago(BigDecimal idtipopago, String descripcion) {
       this.idtipopago = idtipopago;
       this.descripcion = descripcion;
    }
   
    public BigDecimal getIdtipopago() {
        return this.idtipopago;
    }
    
    public void setIdtipopago(BigDecimal idtipopago) {
        this.idtipopago = idtipopago;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


