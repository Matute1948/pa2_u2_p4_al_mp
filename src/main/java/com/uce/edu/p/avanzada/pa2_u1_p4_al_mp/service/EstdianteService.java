package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.EstudianteDTO;

public interface EstdianteService {

    public Estudiante buscarPorApellido(String apellido);
    public List<Estudiante> buscarPorListApellido(String apellido);
    public Estudiante buscarPorApellidoNombre(String apellido,String nombre);
    public Estudiante buscarPorApellidoTyped(String apellido);
    public List<Estudiante> buscarPorApellidoListTyped(String apellido);
    public Estudiante buscarPorApellidoNamedQuery(String apellido);
    public Estudiante buscarPorApellidoNamed(String apellido);
    public Estudiante buscarPorNombreNamed(String nombre);
    public Estudiante buscarPorApellidoNativedQuery(String apellido);
    public Estudiante buscarPorApellidoNativedQueryNamed(String apellido);
    public Estudiante buscarPorNombreNativedQueryNamed(String nombre);
    public void agregar(Estudiante estudiante);
    public Estudiante buscarPorNumero(String cedula);
    public void eliminar(String cedula);
    public void actualizar(Estudiante estudiante);
    public Estudiante buscarEstudianteDinamico(String nombre, String apellido, Double peso) ;
    public int eliminarPorNombre(String nombre);
    public int actualizarPorApellido(String nombre,String apellido);
    public List<EstudianteDTO> buscarTodoDTO();
}
