package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.HotelRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Hotel;

@Service
public class HotelServiceImpl implements HotelService{

     @Autowired
    private HotelRepository HotelRepository;

    @Override
    public void agregar(Hotel Hotel) {
        this.HotelRepository.insertar(Hotel);
    }

    @Override
    public Hotel buscarPorNumero(Integer id) {
        return this.HotelRepository.seleccionarPorNumero(id);
    }

    @Override
    public void eliminar(Integer id) {
        this.HotelRepository.eliminar(id);
    }

    @Override
    public void actualizar(Hotel Hotel) {
        this.HotelRepository.actualizar(Hotel);
    }
    
}
