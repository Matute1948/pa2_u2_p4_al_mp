package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;

public interface LibreService {
    
    public void agregar(Libro libro);
    public Libro buscarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Libro libro);

}
