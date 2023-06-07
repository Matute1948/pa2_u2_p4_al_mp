package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

@Repository
public class EstudianteRepositoryImpl implements EstudianteRepository{

    private ArrayList<Estudiante> baseDatos = new ArrayList<>();

    @Override
    public void insertar(Estudiante estudiante) {
        // TODO Auto-generated method stub
        baseDatos.add(estudiante);
    }
    
}
