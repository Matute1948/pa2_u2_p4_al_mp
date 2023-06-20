package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Hotel;

public interface HotelRepository {
    
    public void insertar(Hotel hotel);
    public Hotel seleccionarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Hotel hotel);
}
