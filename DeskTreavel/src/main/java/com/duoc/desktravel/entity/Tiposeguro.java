package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Tiposeguro generated by hbm2java
 */
public class Tiposeguro  implements java.io.Serializable {


     private BigDecimal idtiposeguro;
     private String nombre;
     private String descripcion;

    public Tiposeguro() {
    }

	
    public Tiposeguro(BigDecimal idtiposeguro) {
        this.idtiposeguro = idtiposeguro;
    }
    public Tiposeguro(BigDecimal idtiposeguro, String nombre, String descripcion) {
       this.idtiposeguro = idtiposeguro;
       this.nombre = nombre;
       this.descripcion = descripcion;
    }
   
    public BigDecimal getIdtiposeguro() {
        return this.idtiposeguro;
    }
    
    public void setIdtiposeguro(BigDecimal idtiposeguro) {
        this.idtiposeguro = idtiposeguro;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }




}


