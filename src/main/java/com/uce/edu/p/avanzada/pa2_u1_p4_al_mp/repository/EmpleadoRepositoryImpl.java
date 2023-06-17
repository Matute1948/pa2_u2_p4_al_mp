package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository 
@Transactional
public class EmpleadoRepositoryImpl implements EmpleadoRepository{
    @PersistenceContext 
    private EntityManager entityManager;

    @Override
    public void insertar(Empleado empleado) {
        this.entityManager.persist(empleado);
    }

    @Override
    public Empleado seleccionarPorNumero(Integer id) {
        return this.entityManager.find(Empleado.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        Empleado empleado = this.seleccionarPorNumero(id);
        this.entityManager.remove(empleado);
        
    }

    @Override
    public void actualizar(Empleado empleado) {
        this.entityManager.merge(empleado);
    }
}
