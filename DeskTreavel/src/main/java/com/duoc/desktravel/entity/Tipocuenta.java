package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Tipocuenta generated by hbm2java
 */
public class Tipocuenta  implements java.io.Serializable {


     private BigDecimal idtipocuenta;
     private String nombre;

    public Tipocuenta() {
    }

	
    public Tipocuenta(BigDecimal idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }
    public Tipocuenta(BigDecimal idtipocuenta, String nombre) {
       this.idtipocuenta = idtipocuenta;
       this.nombre = nombre;
    }
   
    public BigDecimal getIdtipocuenta() {
        return this.idtipocuenta;
    }
    
    public void setIdtipocuenta(BigDecimal idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}


