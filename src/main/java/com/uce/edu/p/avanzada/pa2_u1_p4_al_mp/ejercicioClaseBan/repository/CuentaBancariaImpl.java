package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.modelo.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CuentaBancariaImpl implements CuentaBancariaRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(CuentaBancaria cuentaBancaria) {
        this.entityManager.persist(cuentaBancaria);
    }

    @Override
    public CuentaBancaria seleccionarPorId(Integer id) {
        return this.entityManager.find(CuentaBancaria.class, id);
        
    }

    @Override
    public void eliminar(Integer id) {
        CuentaBancaria cuentaBancaria = this.seleccionarPorId(id);
        this.entityManager.remove(cuentaBancaria);
    }

    @Override
    public void actualizar(CuentaBancaria cuentaBancaria) {
        this.entityManager.merge(cuentaBancaria);
    }
    
}
