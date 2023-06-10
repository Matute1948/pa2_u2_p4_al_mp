package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

public interface EstudianteRepository {

    public void insertar(Estudiante estudiante);
    public Estudiante seleccionarPorNumero(String cedula);
    public void eliminar(String cedula);
    public void actualizar(Estudiante estudiante);
    
}
