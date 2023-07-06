package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "videojuego")
@Entity
public class VideoJuego {

    @GeneratedValue(generator = "seq_videojuego",strategy = GenerationType.SEQUENCE)// le decimos de manera explicita q trabajamos con secuencia
    @SequenceGenerator(name = "seq_videojuego", sequenceName = "seq_videojuego", allocationSize = 1) // debe ser el mismo invremento q colocamos en posgrest
    @Id
    @Column(name = "vjo_id")
    private Integer id;
    @Column(name = "vjo_titulo")
    private String titulo;
    @Column(name = "vjo_genero")
    private String genero;
    @Column(name = "vjo_clasificacion")
    private String clasificacion;
    @Column(name = "vjo_desarolladora")
    private String desarolladora;
    @Column(name = "vjo_costo")
    private BigDecimal costo;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public String getDesarolladora() {
        return desarolladora;
    }
    public void setDesarolladora(String desarolladora) {
        this.desarolladora = desarolladora;
    }
    public BigDecimal getCosto() {
        return costo;
    }
    public void setCosto(BigDecimal costo) {
        this.costo = costo;
    }
    @Override
    public String toString() {
        return "VideoJuego [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", clasificacion=" + clasificacion
                + ", desarolladora=" + desarolladora + ", costo=" + costo + "]";
    }
    
}
