package com.duoc.desktravel.entity;
// Generated 09-10-2017 18:36:09 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * ActividadaportesId generated by hbm2java
 */
public class ActividadaportesId  implements java.io.Serializable {


     private BigDecimal aporte;
     private BigDecimal actividad;
     private BigDecimal cuentaalumnos;

    public ActividadaportesId() {
    }

    public ActividadaportesId(BigDecimal aporte, BigDecimal actividad, BigDecimal cuentaalumnos) {
       this.aporte = aporte;
       this.actividad = actividad;
       this.cuentaalumnos = cuentaalumnos;
    }
   
    public BigDecimal getAporte() {
        return this.aporte;
    }
    
    public void setAporte(BigDecimal aporte) {
        this.aporte = aporte;
    }
    public BigDecimal getActividad() {
        return this.actividad;
    }
    
    public void setActividad(BigDecimal actividad) {
        this.actividad = actividad;
    }
    public BigDecimal getCuentaalumnos() {
        return this.cuentaalumnos;
    }
    
    public void setCuentaalumnos(BigDecimal cuentaalumnos) {
        this.cuentaalumnos = cuentaalumnos;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ActividadaportesId) ) return false;
		 ActividadaportesId castOther = ( ActividadaportesId ) other; 
         
		 return ( (this.getAporte()==castOther.getAporte()) || ( this.getAporte()!=null && castOther.getAporte()!=null && this.getAporte().equals(castOther.getAporte()) ) )
 && ( (this.getActividad()==castOther.getActividad()) || ( this.getActividad()!=null && castOther.getActividad()!=null && this.getActividad().equals(castOther.getActividad()) ) )
 && ( (this.getCuentaalumnos()==castOther.getCuentaalumnos()) || ( this.getCuentaalumnos()!=null && castOther.getCuentaalumnos()!=null && this.getCuentaalumnos().equals(castOther.getCuentaalumnos()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAporte() == null ? 0 : this.getAporte().hashCode() );
         result = 37 * result + ( getActividad() == null ? 0 : this.getActividad().hashCode() );
         result = 37 * result + ( getCuentaalumnos() == null ? 0 : this.getCuentaalumnos().hashCode() );
         return result;
   }   


}


