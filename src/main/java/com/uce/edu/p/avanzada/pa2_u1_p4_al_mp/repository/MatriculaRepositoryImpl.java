package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Matricula;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
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

    @Override
    public List<MatriculaDTO> seleccionarTodo() {
        TypedQuery<MatriculaDTO> mQuery = this.entityManager.createQuery("SELECT NEW com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.MatriculaDTO(e.alumno.nombre,e.materia.nombre) FROM Matricula e ", MatriculaDTO.class);
        return mQuery.getResultList();
    }
    
}
