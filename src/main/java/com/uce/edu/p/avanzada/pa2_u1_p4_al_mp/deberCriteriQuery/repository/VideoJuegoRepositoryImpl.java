package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository.modelo.VideoJuego;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class VideoJuegoRepositoryImpl implements VideoJuegoRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(VideoJuego videoJuego) {
        this.entityManager.persist(videoJuego);
    }

    @Override
    public VideoJuego seleccionarPorId(Integer id) {
        return this.entityManager.find(VideoJuego.class, id);
    }

    @Override
    public void eliminar(Integer id) {
        VideoJuego vid = this.seleccionarPorId(id);
        this.entityManager.remove(vid);
    }

    @Override
    public void actualizar(VideoJuego videoJuego) {
        this.entityManager.merge(videoJuego);

    }

    @Override
    public List<VideoJuego> seleccionarPorDesarolladoraCosto(String desarolladora, BigDecimal costo) {
        CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();
        CriteriaQuery<VideoJuego> mCriteriaQuery = myBuilder.createQuery(VideoJuego.class);
        Root<VideoJuego> miTablaFrom = mCriteriaQuery.from(VideoJuego.class);
        Predicate condicionTitulo = myBuilder.notEqual(miTablaFrom.get("desarolladora"), desarolladora);
        Predicate conCostoBetween = myBuilder.between((miTablaFrom.<BigDecimal>get("costo")), new BigDecimal(30), new BigDecimal(60));
        Predicate conFinal = myBuilder.and(condicionTitulo, conCostoBetween);
        mCriteriaQuery.select(miTablaFrom).where(conFinal); 
        TypedQuery<VideoJuego> mQuery=this.entityManager.createQuery(mCriteriaQuery);
        return mQuery.getResultList();
    }
    
}
