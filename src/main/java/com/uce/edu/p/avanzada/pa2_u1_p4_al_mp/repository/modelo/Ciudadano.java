package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Table(name="ciudadano") // si no le ponemos el nombre pone el mismo nombre de la clase
@Entity
public class Ciudadano {
    @GeneratedValue(generator = "seq_ciudadano",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_ciudadano", sequenceName = "seq_ciudadano", allocationSize = 1) 
    @Id
    @Column(name = "ciud.id" )
    private Integer id;
    @Column(name = "ciud.nombre")
    private String nombre;
    @Column(name = "ciud.apellido" )
    private String apellido;
    @Column(name = "ciud.cedula" )
    private String cedula;

    @OneToOne(mappedBy = "ciudadano")// nombre del atributa de la tabla secuandaria
    private Empleado empleado; // solo va a tener un empelado
    // si quisiera mas seria una lista o algo por el estilo


    //get y set
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
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
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Empleado getEmpleado() {
        return empleado;
    }
    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    @Override
    public String toString() {
        return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
                + ", empleado=" + empleado + "]";
    }
    
    
    
}
