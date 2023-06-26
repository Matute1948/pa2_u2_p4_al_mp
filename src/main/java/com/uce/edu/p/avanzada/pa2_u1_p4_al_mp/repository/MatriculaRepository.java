package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Matricula;

public interface MatriculaRepository {

    public void insertar(Matricula matricula);
    public Matricula seleccionarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Matricula matricula);
    
}
