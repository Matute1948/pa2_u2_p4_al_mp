package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;
//todo debe ser de jakarta persistence
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//para un schema diferente de public 
//@Table(name = "estudiante",schema = "nombre el squema")
@Table(name = "estudiante")
//a la clase a la que mapeo la tabla  mapeo-->entity 
@Entity
public class Estudiante {
    //mapear los atributos con las columnas
    @Column(name = "estu.nombre")
    private String nombre;
    @Column(name = "estu.apellido")
    private String apellido;
    @Id
    @Column(name = "estu.cedula")
    private String cedula;
    @Column(name = "estu.institucion")
    private String institucion;
    

    //get y set
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getInstitucion() {
        return institucion;
    }
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }
    
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", institucion=" + institucion + "]";
    }
}
