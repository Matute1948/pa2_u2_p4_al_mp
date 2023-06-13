package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.modelo.CuentaBancaria;

public interface CuentaBancariaRepository {
    public void insertar(CuentaBancaria cuentaBancaria);
    public CuentaBancaria seleccionarPorId(Integer id);
    public void eliminar(Integer id);
    public void actualizar(CuentaBancaria cuentaBancaria);
}
