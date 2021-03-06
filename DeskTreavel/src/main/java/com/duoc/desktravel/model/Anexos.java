package com.duoc.desktravel.model;
// Generated 15-10-2017 19:02:40 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Anexos generated by hbm2java
 */
public class Anexos  implements java.io.Serializable {


     private BigDecimal idanexo;
     private Contrato contrato;
     private String archivo;
     private String token;
     private Date fecha;

    public Anexos() {
    }

	
    public Anexos(BigDecimal idanexo, Contrato contrato, String archivo) {
        this.idanexo = idanexo;
        this.contrato = contrato;
        this.archivo = archivo;
    }
    public Anexos(BigDecimal idanexo, Contrato contrato, String archivo, String token, Date fecha) {
       this.idanexo = idanexo;
       this.contrato = contrato;
       this.archivo = archivo;
       this.token = token;
       this.fecha = fecha;
    }
   
    public BigDecimal getIdanexo() {
        return this.idanexo;
    }
    
    public void setIdanexo(BigDecimal idanexo) {
        this.idanexo = idanexo;
    }
    public Contrato getContrato() {
        return this.contrato;
    }
    
    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }
    public String getArchivo() {
        return this.archivo;
    }
    
    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
    public String getToken() {
        return this.token;
    }
    
    public void setToken(String token) {
        this.token = token;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


