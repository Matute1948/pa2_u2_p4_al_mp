package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository;

import java.math.BigDecimal;
import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository.modelo.VideoJuego;

public interface VideoJuegoRepository {
    
    public void insertar(VideoJuego videoJuego);
    public VideoJuego seleccionarPorId(Integer id);
    public void eliminar(Integer id);
    public void actualizar(VideoJuego videoJuego);
    public List<VideoJuego> seleccionarPorDesarolladoraCosto(String desarolladora, BigDecimal costo);
    public int eliminarPorTituloEmpiezanConG(String titulo);
    public int actualizarPorGenero(String genero, String clasificacion);

}
