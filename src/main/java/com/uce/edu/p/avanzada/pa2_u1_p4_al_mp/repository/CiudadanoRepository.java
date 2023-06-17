package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;

public interface CiudadanoRepository {

    public void insertar(Ciudadano ciudadano);
    public Ciudadano seleccionarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Ciudadano ciudadano);
    
}
