package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepositoryImpl implements MatriculaRepository{
    @PersistenceContext 
    private EntityManager entityManager;

    @Override
    public void insertar(Matricula matricula) {
        this.entityManager.persist(matricula);
    }

    @Override
    public Matricula seleccionarPorNumero(Integer id) {
        return this.entityManager.find(Matricula.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        Matricula matricula = this.seleccionarPorNumero(id);
        this.entityManager.remove(matricula);
        
    }

    @Override
    public void actualizar(Matricula matricula) {
        this.entityManager.merge(matricula);
    }
    
}
