package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository // anotacion adicional
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository{

    //existe una interfaz que me permite conectar con la base de datos
    //entity manager (manego de entidades)esta interfaz es el componente principal para 
    //interactura con la base de datos

    @PersistenceContext //debe tener esta anotacion
    private EntityManager entityManager; // interactuo con la base de datos 

    @Override
    public void insertar(Estudiante estudiante) {
        //crud con el entityManager, persist recibe un entity
        this.entityManager.persist(estudiante);
    }
    @Override
    public void actualizar(Estudiante estudiante) {
        this.entityManager.merge(estudiante);
    }
    @Override
    public Estudiante seleccionarPorNumero(String cedula) {
        return this.entityManager.find(Estudiante.class, cedula);
    }
    @Override
    public void eliminar(String cedula) {
        Estudiante estudiante = this.seleccionarPorNumero(cedula);
        this.entityManager.remove(estudiante);
        
    }
    @Override
    public Estudiante seleccionarPorApellido(String apellido) {
        //SQL
        //SELECT * FROM estudiante e WHERE e.estu_apellido =
        //JPQL (alias es el e)
        //SELECT e FROM Estudiante e WHERE e.apellido    
        Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
        myQuery.setParameter("datoApellido", apellido);
        return (Estudiante)myQuery.getSingleResult();
    }
    @Override
    public List<Estudiante> seleccionarListaPorApellido(String apellido) {
       Query mQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido ");
       mQuery.setParameter("datoApellido",apellido);
       return mQuery.getResultList();
    }
    @Override
    public Estudiante seleccionarPorApellidoNombre(String apellido, String nombre) {
        Query mQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
        mQuery.setParameter("datoApellido",apellido);
        mQuery.setParameter("datoNombre",nombre);
        return (Estudiante)mQuery.getSingleResult();
    }
    @Override
    public Estudiante seleccionarPorApellidoTyped(String apellido) {

        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);

        myQuery.setParameter("datoApellido", apellido);

        return myQuery.getSingleResult();
    }
    @Override
    public List<Estudiante> seleccionarListPorApellidoTyped(String apellido) {
        TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);

        myQuery.setParameter("datoApellido", apellido);

        return myQuery.getResultList();
    }
    @Override
    public Estudiante seleccionarPorApellidoNamed(String apellido) {
        TypedQuery<Estudiante> mQuery = this.entityManager.createNamedQuery("Estudiante.buscaPorApellido", Estudiante.class);
        mQuery.setParameter("datoApellido", apellido);
        return mQuery.getSingleResult();
    }

    
    
}
