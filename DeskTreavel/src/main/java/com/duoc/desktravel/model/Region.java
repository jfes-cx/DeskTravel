package com.duoc.desktravel.model;
// Generated 15-10-2017 19:02:40 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Region generated by hbm2java
 */
public class Region  implements java.io.Serializable {


     private BigDecimal idregion;
     private Pais pais;
     private String nombre;
     private Set comunas = new HashSet(0);

    public Region() {
    }

	
    public Region(BigDecimal idregion, Pais pais, String nombre) {
        this.idregion = idregion;
        this.pais = pais;
        this.nombre = nombre;
    }
    public Region(BigDecimal idregion, Pais pais, String nombre, Set comunas) {
       this.idregion = idregion;
       this.pais = pais;
       this.nombre = nombre;
       this.comunas = comunas;
    }
   
    public BigDecimal getIdregion() {
        return this.idregion;
    }
    
    public void setIdregion(BigDecimal idregion) {
        this.idregion = idregion;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getComunas() {
        return this.comunas;
    }
    
    public void setComunas(Set comunas) {
        this.comunas = comunas;
    }

     @Override
    public String toString(){
        return getNombre();
    }


}


