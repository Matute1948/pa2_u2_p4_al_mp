package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

public interface EstdianteService {

    public void agregar(Estudiante estudiante);
    public Estudiante buscarPorNumero(String cedula);
    public void eliminar(String cedula);
    public void actualizar(Estudiante estudiante);
    
}
