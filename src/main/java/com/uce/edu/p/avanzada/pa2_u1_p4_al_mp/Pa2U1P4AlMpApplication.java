package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.repository.modelo.CuentaBancaria;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.ejercicioClaseBan.service.CuentaBancariaService;


@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private CuentaBancariaService cuentaBancariaService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		this.cuentaBancariaService.apertura("32653298", "C", new BigDecimal(400));
		//this.cuentaBancariaService.eliminar(8);
		//CuentaBancaria cuenta = this.cuentaBancariaService.buscarPorId(9);
		//cuenta.setCedulaPropientario("1724210685");
		
		//cuentaBancaria.setCedulaPropientario("1724210685");
		//this.cuentaBancariaService.actualizar(cuenta);


	}

}
