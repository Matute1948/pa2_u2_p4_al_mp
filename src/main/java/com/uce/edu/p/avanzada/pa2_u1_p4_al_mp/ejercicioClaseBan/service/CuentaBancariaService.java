package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.service;

import java.math.BigDecimal;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.modelo.CuentaBancaria;

public interface CuentaBancariaService {
    public void agregar(CuentaBancaria cuentaBancaria);
    public CuentaBancaria buscarPorId(Integer id);
    public void eliminar(Integer id);
    public void actualizar(CuentaBancaria cuentaBancaria);
    public void apertura(String cedula, String tipo, BigDecimal saldo);
}
