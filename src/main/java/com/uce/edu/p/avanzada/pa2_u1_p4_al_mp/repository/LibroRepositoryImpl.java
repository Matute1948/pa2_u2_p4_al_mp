package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class LibroRepositoryImpl implements LibroRepository{

    @PersistenceContext 
    private EntityManager entityManager;

    @Override
    public void insertar(Libro libro) {
        this.entityManager.persist(libro);
    }

    @Override
    public Libro seleccionarPorNumero(Integer id) {
        return this.entityManager.find(Libro.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        Libro Libro = this.seleccionarPorNumero(id);
        this.entityManager.remove(Libro);
        
    }

    @Override
    public void actualizar(Libro libro) {
        this.entityManager.merge(libro);
    }
    
}
