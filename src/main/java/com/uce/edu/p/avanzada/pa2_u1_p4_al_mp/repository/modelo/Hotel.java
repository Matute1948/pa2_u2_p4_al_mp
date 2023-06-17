package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo;

public class Hotel {

    private Integer id;
    private String nombre;
    private String direccion;

    
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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Hotel [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + "]";
    }

    

}
