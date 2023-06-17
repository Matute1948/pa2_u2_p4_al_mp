package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import org.springframework.stereotype.Repository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository 
@Transactional
public class CiudadanoRepositoryImpl implements CiudadanoRepository{

    @PersistenceContext 
    private EntityManager entityManager;

    @Override
    public void insertar(Ciudadano ciudadano) {
        this.entityManager.persist(ciudadano);
    }

    @Override
    public Ciudadano seleccionarPorNumero(Integer id) {
        return this.entityManager.find(Ciudadano.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        Ciudadano ciudadano = this.seleccionarPorNumero(id);
        this.entityManager.remove(ciudadano);
        
    }

    @Override
    public void actualizar(Ciudadano ciudadano) {
        this.entityManager.merge(ciudadano);
    }
    
}
