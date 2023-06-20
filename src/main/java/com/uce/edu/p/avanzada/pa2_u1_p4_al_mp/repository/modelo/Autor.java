package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name="autor")
@Entity
public class Autor {
    @GeneratedValue(generator = "seq_autor", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_autor", sequenceName = "seq_autor",allocationSize = 1)
    @Id
    @Column(name = "au_id")
    private Integer id;
    @Column(name = "au_nombre")
    private String nombre;
    @Column(name = "au_apellido")
    private String apellido;
    //una buena practica es un conjunto en lugar de una list
    @ManyToMany(mappedBy = "autores", cascade = CascadeType.ALL)
    private Set<Libro> libro;
    // set y get 

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

    public Set<Libro> getLibro() {
        return libro;
    }

    public void setLibro(Set<Libro> libro) {
        this.libro = libro;
    }


    //toString 
    @Override
    public String toString() {
        return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", libro=" + libro + "]";
    }
    
    

    

}
