package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Origen generated by hbm2java
 */
public class Origen  implements java.io.Serializable {


     private BigDecimal idorigen;
     private BigDecimal idpais;

    public Origen() {
    }

    public Origen(BigDecimal idorigen, BigDecimal idpais) {
       this.idorigen = idorigen;
       this.idpais = idpais;
    }
   
    public BigDecimal getIdorigen() {
        return this.idorigen;
    }
    
    public void setIdorigen(BigDecimal idorigen) {
        this.idorigen = idorigen;
    }
    public BigDecimal getIdpais() {
        return this.idpais;
    }
    
    public void setIdpais(BigDecimal idpais) {
        this.idpais = idpais;
    }




}


