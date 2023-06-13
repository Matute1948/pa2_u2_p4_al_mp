package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.CuentaBancariaRepository;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.modelo.CuentaBancaria;

@Service
public class CuentaBancariaServiceImpl implements CuentaBancariaService{
    @Autowired
    @Qualifier("diaPar")
    private AbonoService abonoParService;
    @Autowired
    @Qualifier("diaImpar")
    private AbonoService abonoImparService;
    @Autowired
    private CuentaBancariaRepository cuentaBancariaRepository;
    @Override
    public void agregar(CuentaBancaria cuentaBancaria) {
        this.cuentaBancariaRepository.insertar(cuentaBancaria);
    }

    @Override
    public CuentaBancaria buscarPorId(Integer id) {
        return this.cuentaBancariaRepository.seleccionarPorId(id);
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
        
        int dia = LocalDate.now().getDayOfMonth();
        
        if (dia % 2 == 0){
            saldo=this.abonoParService.calculoAbono(saldo);
        }else{
            saldo=this.abonoImparService.calculoAbono(saldo);
        }

        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setCedulaPropientario(cedula);
        cuentaBancaria.setFechaApertura(LocalDate.now());
        cuentaBancaria.setNumeroCuenta("12345");
        cuentaBancaria.setTipo(tipo);
        cuentaBancaria.setSaldo(saldo);
        System.out.println("XD");
        this.cuentaBancariaRepository.insertar(cuentaBancaria);

        
    }
    
}
