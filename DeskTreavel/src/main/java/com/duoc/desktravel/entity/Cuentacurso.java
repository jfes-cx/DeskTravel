package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Cuentacurso generated by hbm2java
 */
public class Cuentacurso  implements java.io.Serializable {


     private BigDecimal idcuentacurso;
     private BigDecimal curso;
     private BigDecimal saldo;

    public Cuentacurso() {
    }

	
    public Cuentacurso(BigDecimal idcuentacurso, BigDecimal curso) {
        this.idcuentacurso = idcuentacurso;
        this.curso = curso;
    }
    public Cuentacurso(BigDecimal idcuentacurso, BigDecimal curso, BigDecimal saldo) {
       this.idcuentacurso = idcuentacurso;
       this.curso = curso;
       this.saldo = saldo;
    }
   
    public BigDecimal getIdcuentacurso() {
        return this.idcuentacurso;
    }
    
    public void setIdcuentacurso(BigDecimal idcuentacurso) {
        this.idcuentacurso = idcuentacurso;
    }
    public BigDecimal getCurso() {
        return this.curso;
    }
    
    public void setCurso(BigDecimal curso) {
        this.curso = curso;
    }
    public BigDecimal getSaldo() {
        return this.saldo;
    }
    
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }




}

