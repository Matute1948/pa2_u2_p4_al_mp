package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;


import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository // anotacion adicional
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository{

    //existe una interfaz que me permite conectar con la base de datos
    //entity manager (manego de entidades)esta interfaz es el componente principal para 
    //interactura con la base de datos

    @PersistenceContext //debe tener esta anotacion
    private EntityManager entityManager;

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
    
}
