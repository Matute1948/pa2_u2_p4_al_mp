package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

public interface EstdianteService {

    public Estudiante buscarPorApellido(String apellido);
    public List<Estudiante> buscarPorListApellido(String apellido);
    public Estudiante buscarPorApellidoNombre(String apellido,String nombre);
    public Estudiante buscarPorApellidoTyped(String apellido);
    public List<Estudiante> buscarPorApellidoListTyped(String apellido);
    public void agregar(Estudiante estudiante);
    public Estudiante buscarPorNumero(String cedula);
    public void eliminar(String cedula);
    public void actualizar(Estudiante estudiante);
    
}
