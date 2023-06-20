package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;

public interface AutorRepository {

    public void insertar(Autor autor);
    public Autor seleccionarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Autor autor);
    
}
