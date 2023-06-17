package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.CiudadanoRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;

@Service 
public class CiudadanoServiceImpl implements CiudadanoService{

    @Autowired
    private CiudadanoRepository ciudadanoRepository;

    @Override
    public void agregar(Ciudadano ciudadano) {
        this.ciudadanoRepository.insertar(ciudadano);
    }

    @Override
    public Ciudadano buscarPorNumero(Integer id) {
        return this.ciudadanoRepository.seleccionarPorNumero(id);
    }

    @Override
    public void eliminar(Integer id) {
        this.ciudadanoRepository.eliminar(id);
    }

    @Override
    public void actualizar(Ciudadano ciudadano) {
        this.ciudadanoRepository.actualizar(ciudadano);
    }
    
}
