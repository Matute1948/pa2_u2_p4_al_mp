package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;

public interface AutorService {
    
    public void agregar(Autor autor);
    public Autor buscarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Autor autor);

}
