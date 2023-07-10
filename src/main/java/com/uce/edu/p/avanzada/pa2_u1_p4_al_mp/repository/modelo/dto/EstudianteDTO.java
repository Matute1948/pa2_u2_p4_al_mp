package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto;

public class EstudianteDTO {
    //exclusivamente con los atributos que vamos a consultar

    private String nombre;
    private String apellido;
    //si ese objeto se va a transimitir por web debe implementar la interface serailizable o algo asi XD
    public EstudianteDTO(){

    }

    public EstudianteDTO(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //SET Y GET
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

    @Override
    public String toString() {
        return "EstudianteDTO [nombre=" + nombre + ", apellido=" + apellido + "]";
    }

    

}
