package com.duoc.desktravel.model;
// Generated 15-10-2017 19:02:40 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private BigDecimal idpais;
     private String nombre;
     private Set destinos = new HashSet(0);
     private Set origens = new HashSet(0);
     private Set regions = new HashSet(0);

    public Pais() {
    }

	
    public Pais(BigDecimal idpais) {
        this.idpais = idpais;
    }
    public Pais(BigDecimal idpais, String nombre, Set destinos, Set origens, Set regions) {
       this.idpais = idpais;
       this.nombre = nombre;
       this.destinos = destinos;
       this.origens = origens;
       this.regions = regions;
    }
   
    public BigDecimal getIdpais() {
        return this.idpais;
    }
    
    public void setIdpais(BigDecimal idpais) {
        this.idpais = idpais;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getDestinos() {
        return this.destinos;
    }
    
    public void setDestinos(Set destinos) {
        this.destinos = destinos;
    }
    public Set getOrigens() {
        return this.origens;
    }
    
    public void setOrigens(Set origens) {
        this.origens = origens;
    }
    public Set getRegions() {
        return this.regions;
    }
    
    public void setRegions(Set regions) {
        this.regions = regions;
    }




}


