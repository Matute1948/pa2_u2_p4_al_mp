package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Hotel;

public interface HotelService {
    public void agregar(Hotel hotel);
    public Hotel buscarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Hotel hotel);
}
