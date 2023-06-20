package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.AutorRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;
@Service
public class AutoServiceImpl implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    @Override
    public void agregar(Autor autor) {
        this.autorRepository.insertar(autor);
    }

    @Override
    public Autor buscarPorNumero(Integer id) {
        return this.autorRepository.seleccionarPorNumero(id);
    }

    @Override
    public void eliminar(Integer id) {
        this.autorRepository.eliminar(id);
    }

    @Override
    public void actualizar(Autor autor) {
        this.autorRepository.actualizar(autor);
    }
}
