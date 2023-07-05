package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;
//todo debe ser de jakarta persistence
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
//para un schema diferente de public 
//@Table(name = "estudiante",schema = "nombre el squema")
@Table(name = "estudiante")
//a la clase a la que mapeo la tabla  mapeo-->entity 
@Entity
@NamedQueries({
    @NamedQuery(name = "Estudiante.buscarPorApellido", query = "SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido"),
     @NamedQuery(name = "Estudiante.buscarPorNombre", query = "SELECT e FROM Estudiante e WHERE e.nombre = :datoNombre")
    })

@NamedNativeQueries({
    @NamedNativeQuery(name = "Estudiante.buscarPorApellidoNative", query = "SELECT * FROM Estudiante WHERE estu_apellido = :datoApellido", resultClass = Estudiante.class),
    @NamedNativeQuery(name = "Estudiante.buscarPorNombreNative", query = "SELECT * FROM Estudiante WHERE estu_nombre = :datoNombre", resultClass = Estudiante.class)
})


public class Estudiante {
    //mapear los atributos con las columnas
    //debe contar con esto necesariamente 
    //manejar el mismo nombre
    @GeneratedValue(generator = "seq_estudiante",strategy = GenerationType.SEQUENCE)// le decimos de manera explicita q trabajamos con secuencia
    @SequenceGenerator(name = "seq_estudiante", sequenceName = "seq_estudiante", allocationSize = 1) // debe ser el mismo invremento q colocamos en posgrest
    @Id
    @Column(name = "estu_id")
    private Integer id;
    @Column(name = "estu_cedula")
    private String cedula;
    @Column(name = "estu_nombre")
    private String nombre;
    @Column(name = "estu_apellido")
    private String apellido;
    @Column(name = "estu_institucion")
    private String institucion;
    @Column(name = "estu_peso")
    private Double peso;
    

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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Estudiante [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
                + ", institucion=" + institucion + ", peso=" + peso + "]";
    }
    
    

    
}
