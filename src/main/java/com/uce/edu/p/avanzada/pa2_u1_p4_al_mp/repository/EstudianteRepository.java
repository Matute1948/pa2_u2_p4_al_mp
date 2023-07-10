package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;



import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.EstudianteDTO;

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
    public Estudiante seleccionarPorApellidoNamed(String apellido);
    public Estudiante seleccionarPorNombreNamed(String nombre);
    public Estudiante seleccionarPorApellidoNamedQuery(String apellido);
    public Estudiante seleccionarPorApellidoNativeQuery(String apellido);
    public Estudiante seleccionarPorApellidoNativeQueryNamed(String apellido);
    public Estudiante seleccionarPorNombreNativeQueryNamed(String nombre);
    public Estudiante seleccionarPorApellidoCriteriaApiQuery(String apellido);
    public Estudiante seleccionarEstudianteDinamico(String nombre, String apellido, Double peso);
    public int eliminarPorNombre(String nombre);
    public int actualizarPorApellido(String nombre,String apellido);
    public List<EstudianteDTO> seleccionarTodoTDO();
}
