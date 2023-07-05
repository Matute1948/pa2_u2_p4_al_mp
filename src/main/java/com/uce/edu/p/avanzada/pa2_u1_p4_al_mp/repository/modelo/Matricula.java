package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Table(name = "matricula")
@Entity 
public class Matricula {

    @GeneratedValue(generator = "seq_matricula",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_matricula", sequenceName = "seq_matricula", allocationSize = 1)
    @Id
    @Column(name = "matri_id")
    private Integer id;
    
    @Column(name = "matri_numero")
    private String numero;
    @Column(name = "matri_fecha")
    private LocalDate fecha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "matri_id_alumno")
    private Alumno alumno;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "matri_id_materia")
    private Materia materia;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Alumno getAlumno() {
        return alumno;
    }
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    public Materia getMateria() {
        return materia;
    }
    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Matricula [id=" + id + ", numero=" + numero + ", fecha=" + fecha + ", alumno=" + alumno + ", materia="
                + materia + "]";
    }

}
