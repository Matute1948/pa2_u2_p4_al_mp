package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

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

    
}
