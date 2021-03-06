package com.duoc.desktravel.model;
// Generated 15-10-2017 19:02:40 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Curso generated by hbm2java
 */
public class Curso  implements java.io.Serializable {


     private BigDecimal idcurso;
     private Colegio colegio;
     private String nombre;
     private String profesorjefe;
     private Set cuentacursos = new HashSet(0);
     private Set alumnos = new HashSet(0);

    public Curso() {
    }

	
    public Curso(BigDecimal idcurso, Colegio colegio) {
        this.idcurso = idcurso;
        this.colegio = colegio;
    }
    
    public Curso(BigDecimal idcurso, Colegio colegio,String nombre) {
        this.idcurso = idcurso;
        this.colegio = colegio;
        this.nombre = nombre;
    }
    
    public Curso(BigDecimal idcurso, Colegio colegio, String nombre, String profesorjefe, Set cuentacursos, Set alumnos) {
       this.idcurso = idcurso;
       this.colegio = colegio;
       this.nombre = nombre;
       this.profesorjefe = profesorjefe;
       this.cuentacursos = cuentacursos;
       this.alumnos = alumnos;
    }
   
    public BigDecimal getIdcurso() {
        return this.idcurso;
    }
    
    public void setIdcurso(BigDecimal idcurso) {
        this.idcurso = idcurso;
    }
    public Colegio getColegio() {
        return this.colegio;
    }
    
    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProfesorjefe() {
        return this.profesorjefe;
    }
    
    public void setProfesorjefe(String profesorjefe) {
        this.profesorjefe = profesorjefe;
    }
    public Set getCuentacursos() {
        return this.cuentacursos;
    }
    
    public void setCuentacursos(Set cuentacursos) {
        this.cuentacursos = cuentacursos;
    }
    public Set getAlumnos() {
        return this.alumnos;
    }
    
    public void setAlumnos(Set alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString(){
        return getNombre();
    }

    

}


