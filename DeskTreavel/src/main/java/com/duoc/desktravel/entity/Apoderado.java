package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Apoderado generated by hbm2java
 */
public class Apoderado  implements java.io.Serializable {


     private BigDecimal idapoderado;
     private String nombre;
     private String rut;
     private String direccion;
     private BigDecimal telefono;
     private String celular;

    public Apoderado() {
    }

	
    public Apoderado(BigDecimal idapoderado, String nombre) {
        this.idapoderado = idapoderado;
        this.nombre = nombre;
    }
    public Apoderado(BigDecimal idapoderado, String nombre, String rut, String direccion, BigDecimal telefono, String celular) {
       this.idapoderado = idapoderado;
       this.nombre = nombre;
       this.rut = rut;
       this.direccion = direccion;
       this.telefono = telefono;
       this.celular = celular;
    }
   
    public BigDecimal getIdapoderado() {
        return this.idapoderado;
    }
    
    public void setIdapoderado(BigDecimal idapoderado) {
        this.idapoderado = idapoderado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRut() {
        return this.rut;
    }
    
    public void setRut(String rut) {
        this.rut = rut;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public BigDecimal getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(BigDecimal telefono) {
        this.telefono = telefono;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }




}


