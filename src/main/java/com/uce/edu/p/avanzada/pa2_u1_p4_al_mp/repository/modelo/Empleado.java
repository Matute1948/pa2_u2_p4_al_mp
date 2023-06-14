package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Table(name = "empleado")
@Entity

public class Empleado {

    @GeneratedValue(generator = "seq_empleado",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_empleado", sequenceName = "seq_empleado", allocationSize = 1) 
    @Id
    @Column(name = "empl.id" )
    private Integer id;
    @Column(name = "empl.sueldo" )
    private BigDecimal sueldo;
    @Column(name = "empl.cargo" )
    private String cargo;
    @OneToOne
    @JoinColumn(name = "empl.id.ciudadano")
    private Ciudadano ciudadano;     //solo tiene un ciudadano

    //get y set
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public BigDecimal getSueldo() {
        return sueldo;
    }
    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    

    //toString
    @Override
    public String toString() {
        return "Empleado [id=" + id + ", sueldo=" + sueldo + ", cargo=" + cargo + ", ciudadano=" + ciudadano + "]";
    }
    
    public Ciudadano getCiudadano() {
        return ciudadano;
    }
    
    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    
}
