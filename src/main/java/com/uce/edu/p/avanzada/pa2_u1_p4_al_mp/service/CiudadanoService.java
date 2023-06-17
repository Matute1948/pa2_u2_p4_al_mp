package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;

public interface CiudadanoService {
    
    public void agregar(Ciudadano ciudadano);
    public Ciudadano buscarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Ciudadano ciudadano);
}
