package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.MatriculaRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Matricula;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.MatriculaDTO;

@Service
public class MatriculaServiceImpl implements MatriculaService{

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Override
    public void agregar(Matricula matricula) {
        this.matriculaRepository.insertar(matricula);
    }

    @Override
    public Matricula buscarPorNumero(Integer id) {
        return this.matriculaRepository.seleccionarPorNumero(id);
    }

    @Override
    public void eliminar(Integer id) {
        this.matriculaRepository.eliminar(id);
    }

    @Override
    public void actualizar(Matricula matricula) {
        this.matriculaRepository.actualizar(matricula);
    }

    @Override
    public List<MatriculaDTO> buscarTodoDTO() {
        return this.matriculaRepository.seleccionarTodo();
    }
    
}
