package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;



import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

public interface EstudianteRepository {


    
    public void insertar(Estudiante estudiante);
    public Estudiante seleccionarPorNumero(String cedula);
    public void eliminar(String cedula);
    public void actualizar(Estudiante estudiante);
    public List<Estudiante> seleccionarListaPorApellido(String apellido);
    public Estudiante seleccionarPorApellidoTyped(String apellido);
    public List<Estudiante> seleccionarListPorApellidoTyped(String apellido);
    public Estudiante seleccionarPorApellido(String apellido);
    public Estudiante seleccionarPorApellidoNombre(String apellido,String nombre);
    
}
