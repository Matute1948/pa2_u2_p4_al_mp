package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.EstudianteRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

@Service 
public class EstudianteServiceImpl implements EstdianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public void agregar(Estudiante estudiante) {
        this.estudianteRepository.insertar(estudiante);
    }

    @Override
    public Estudiante buscarPorNumero(String cedula) {
        return this.estudianteRepository.seleccionarPorNumero(cedula);
    }

    @Override
    public void eliminar(String cedula) {
        this.estudianteRepository.eliminar(cedula);
    }

    @Override
    public void actualizar(Estudiante estudiante) {
        this.estudianteRepository.actualizar(estudiante);
    }

    @Override
    public Estudiante buscarPorApellido(String apellido) {
        return this.estudianteRepository.seleccionarPorApellido(apellido);
    }

    @Override
    public Estudiante buscarPorApellidoNombre(String apellido, String nombre) {
        return this.estudianteRepository.seleccionarPorApellidoNombre(apellido,nombre);
    }

    @Override
    public List<Estudiante> buscarPorListApellido(String apellido) {
        
        return this.estudianteRepository.seleccionarListaPorApellido(apellido);
    }

    public Estudiante buscarPorApellidoTyped(String apellido){
         return this.estudianteRepository.seleccionarPorApellidoTyped(apellido);
       
    }

    @Override
    public List<Estudiante> buscarPorApellidoListTyped(String apellido) {
        return this.estudianteRepository.seleccionarListPorApellidoTyped(apellido);
    }

    @Override
    public Estudiante buscarPorApellidoNamedQuery(String apellido) {
        return this.estudianteRepository.seleccionarPorApellidoNamedQuery(apellido);
    }

    @Override
    public Estudiante buscarPorApellidoNamed(String apellido) {
        return this.estudianteRepository.seleccionarPorApellidoNamed(apellido);
    }

    @Override
    public Estudiante buscarPorApellidoNativedQuery(String apellido) {
        return this.estudianteRepository.seleccionarPorApellidoNativeQuery(apellido);
    }

    @Override
    public Estudiante buscarPorApellidoNativedQueryNamed(String apellido) {
        return this.estudianteRepository.seleccionarPorApellidoNativeQueryNamed(apellido);
    }

    @Override
    public Estudiante buscarPorNombreNamed(String nombre) {
        return this.estudianteRepository.seleccionarPorNombreNamed(nombre);
    }

    @Override
    public Estudiante buscarPorNombreNativedQueryNamed(String nombre) {
        return this.estudianteRepository.seleccionarPorNombreNativeQueryNamed(nombre);
    }

    
}
