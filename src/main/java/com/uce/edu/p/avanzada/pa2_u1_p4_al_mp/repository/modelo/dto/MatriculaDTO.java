package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto;

public class MatriculaDTO {

    private String nombreAlumno;
    private String nombreMateria;

    
    public MatriculaDTO() {
    }
    
    public MatriculaDTO(String nombreAlumno, String nombreMateria) {
        this.nombreAlumno = nombreAlumno;
        this.nombreMateria = nombreMateria;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    public String getNombreMateria() {
        return nombreMateria;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    @Override
    public String toString() {
        return "MatriculaDTO [nombreAlumno=" + nombreAlumno + ", nombreMateria=" + nombreMateria + "]";
    }
    
    
}
