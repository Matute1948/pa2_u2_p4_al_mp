package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;
import org.springframework.stereotype.Repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Habitacion;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepositoryImpl implements HotelRepository{
    @PersistenceContext 
    private EntityManager entityManager;

    @Override
    public void insertar(Hotel hotel) {
        this.entityManager.persist(hotel);
    }

    @Override
    public Hotel seleccionarPorNumero(Integer id) {
        Hotel hot = this.entityManager.find(Hotel.class, id);
        hot.getHabitacion().size();
        System.out.println(hot.getHabitacion().get(0).getNumero());
        //System.out.println(hab);
        return hot;
    }

    @Override
    public void eliminar(Integer id) {
        Hotel hotel = this.seleccionarPorNumero(id);
       
        this.entityManager.remove(hotel);
        
    }

    @Override
    public void actualizar(Hotel hotel) {
        this.entityManager.merge(hotel);
    }
    
}
