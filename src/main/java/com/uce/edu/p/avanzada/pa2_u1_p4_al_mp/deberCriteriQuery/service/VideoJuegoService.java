package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.service;

import java.math.BigDecimal;
import java.util.List;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository.modelo.VideoJuego;

public interface VideoJuegoService {
    public void agregar(VideoJuego videoJuego);
    public VideoJuego buscarPorId(Integer id);
    public void eliminar(Integer id);
    public void actualizar(VideoJuego videoJuego);
    public List<VideoJuego> buscarPorDesarolladoraCosto(String desarolladora, BigDecimal costo);
}
