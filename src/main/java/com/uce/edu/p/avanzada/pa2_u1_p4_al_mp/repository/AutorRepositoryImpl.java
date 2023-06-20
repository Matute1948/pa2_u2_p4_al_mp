package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepositoryImpl implements AutorRepository{
    @PersistenceContext 
    private EntityManager entityManager;

    @Override
    public void insertar(Autor autor) {
        this.entityManager.persist(autor);
    }

    @Override
    public Autor seleccionarPorNumero(Integer id) {
        return this.entityManager.find(Autor.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        Autor autor = this.seleccionarPorNumero(id);
        this.entityManager.remove(autor);
        
    }

    @Override
    public void actualizar(Autor autor) {
        this.entityManager.merge(autor);
    }
    
}
