package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("diaPar")
public class AbonoDiaParService implements AbonoService{

    @Override
    public BigDecimal calculoAbono(BigDecimal saldo) {
        return  saldo.multiply(new BigDecimal(1.05));
    }
    
}
