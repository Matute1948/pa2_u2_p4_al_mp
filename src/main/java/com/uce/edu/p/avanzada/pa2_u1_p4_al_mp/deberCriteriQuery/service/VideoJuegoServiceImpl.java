package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository.VideoJuegoRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository.modelo.VideoJuego;

@Service
public class VideoJuegoServiceImpl implements VideoJuegoService{

    @Autowired
    private VideoJuegoRepository videoJuegoRepository;
    
    @Override
    public void agregar(VideoJuego videoJuego) {
        this.videoJuegoRepository.insertar(videoJuego);
    }

    @Override
    public VideoJuego buscarPorId(Integer id) {
        return this.videoJuegoRepository.seleccionarPorId(id);
    }

    @Override
    public void eliminar(Integer id) {
        this.videoJuegoRepository.eliminar(id);
    }

    @Override
    public void actualizar(VideoJuego videoJuego) {
        this.videoJuegoRepository.actualizar(videoJuego);
    }

    @Override
    public List<VideoJuego> buscarPorDesarolladoraCosto(String desarolladora, BigDecimal costo) {
        return this.videoJuegoRepository.seleccionarPorDesarolladoraCosto(desarolladora, costo);
    }

    @Override
    public int eliminarPorTituloEmpiezanConG(String titulo) {
       return this.videoJuegoRepository.eliminarPorTituloEmpiezanConG(titulo); 
    }

    @Override
    public int actualizarPorGeneroQueContengaL(String genero, String clasificacion) {
        return this.videoJuegoRepository.actualizarPorGenero(genero, clasificacion);
    }
    
}
