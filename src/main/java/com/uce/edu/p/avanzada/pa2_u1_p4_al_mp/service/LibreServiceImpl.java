package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.LibroRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;
@Service
public class LibreServiceImpl implements LibreService{
    @Autowired
    private LibroRepository libroRepository;

    @Override
    public void agregar(Libro libro) {
        this.libroRepository.insertar(libro);
    }

    @Override
    public Libro buscarPorNumero(Integer id) {
        return this.libroRepository.seleccionarPorNumero(id);
    }

    @Override
    public void eliminar(Integer id) {
        this.libroRepository.eliminar(id);
    }

    @Override
    public void actualizar(Libro libro) {
        this.libroRepository.actualizar(libro);
    }
}
