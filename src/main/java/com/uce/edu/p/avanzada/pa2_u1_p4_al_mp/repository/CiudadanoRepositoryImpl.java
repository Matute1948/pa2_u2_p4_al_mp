package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
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
    @Override
    public Ciudadano seleccionarPorApellido(String apellido) {
        //SQL
        //SELECT * FROM Ciudadano e WHERE e.estu_apellido =
        //JPQL (alias es el e)
        //SELECT e FROM Ciudadano e WHERE e.apellido    
        Query myQuery = this.entityManager.createQuery("SELECT e FROM Ciudadano e WHERE e.apellido = :datoApellido");
        myQuery.setParameter("datoApellido", apellido);
        return (Ciudadano)myQuery.getSingleResult();
    }
    @Override
    public List<Ciudadano> seleccionarListaPorApellido(String apellido) {
       Query mQuery = this.entityManager.createQuery("SELECT e FROM Ciudadano e WHERE e.apellido = :datoApellido ");
       mQuery.setParameter("datoApellido",apellido);
       return mQuery.getResultList();
    }
    @Override
    public Ciudadano seleccionarPorApellidoTyped(String apellido) {

        TypedQuery<Ciudadano> myQuery = this.entityManager.createQuery("SELECT e FROM Ciudadano e WHERE e.apellido = :datoApellido", Ciudadano.class);

        myQuery.setParameter("datoApellido", apellido);

        return myQuery.getSingleResult();
    }
    @Override
    public List<Ciudadano> seleccionarListPorApellidoTyped(String apellido) {
        TypedQuery<Ciudadano> myQuery = this.entityManager.createQuery("SELECT e FROM Ciudadano e WHERE e.apellido = :datoApellido", Ciudadano.class);

        myQuery.setParameter("datoApellido", apellido);

        return myQuery.getResultList();
    }
    
}
