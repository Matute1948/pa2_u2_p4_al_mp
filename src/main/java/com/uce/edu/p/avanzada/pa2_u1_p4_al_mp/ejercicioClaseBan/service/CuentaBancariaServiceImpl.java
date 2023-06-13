package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.CuentaBancariaRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService{
    @Autowired
    private CuentaBancariaRepository cuentaBancariaRepository;
    @Override
    public void agregar(CuentaBancaria cuentaBancaria) {
        this.cuentaBancariaRepository.insertar(cuentaBancaria);
    }

    @Override
    public CuentaBancaria buscarPorId(Integer id) {
        return this.buscarPorId(id);
    }

    @Override
    public void eliminar(Integer id) {
        this.cuentaBancariaRepository.eliminar(id);
    }

    @Override
    public void actualizar(CuentaBancaria cuentaBancaria) {
        this.cuentaBancariaRepository.actualizar(cuentaBancaria);
    }

    @Override
    public void apertura(String cedula, String tipo, BigDecimal saldo) {
        LocalDate fecha_aper = LocalDate.now();
        int dia = Integer.parseInt(fecha_aper.toString().split("-")[2]);
        BigDecimal descuento = new BigDecimal(1);
        if(dia % 2 == 0){
            descuento = new BigDecimal(1.05);
        }

        saldo = saldo.multiply(descuento);

        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setCedulaPropientario(cedula);
        cuentaBancaria.setFechaApertura(fecha_aper);
        cuentaBancaria.setNumeroCuenta("12345");
        cuentaBancaria.setTipo(tipo);
        cuentaBancaria.setSaldo(saldo);

        this.agregar(cuentaBancaria);
    }
    
}
