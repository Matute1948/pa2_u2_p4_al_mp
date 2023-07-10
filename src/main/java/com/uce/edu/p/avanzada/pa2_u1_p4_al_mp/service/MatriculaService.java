package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;
import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Matricula;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.MatriculaDTO;

public interface MatriculaService {
    
    public void agregar(Matricula matricula);
    public Matricula buscarPorNumero(Integer id);
    public void eliminar(Integer id);
    public void actualizar(Matricula matricula);
    public List<MatriculaDTO> buscarTodoDTO();
}
