package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;

public interface LibroRepository {

    public void insertar(Libro libro);
    public Libro seleccionarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Libro libro);
    
}
