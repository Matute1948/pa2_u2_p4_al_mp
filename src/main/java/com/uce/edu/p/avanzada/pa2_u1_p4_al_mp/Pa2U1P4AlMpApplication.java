package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.CiudadanoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstdianteService;




@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private EstdianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 
		System.out.println("*******************************************");
		//System.out.println(this.estudianteService.buscarPorApellidoNamed("Achig"));
		System.out.println(this.estudianteService.buscarPorNombreNamed("Andres"));
		System.out.println("*******************************************");
		System.out.println(this.estudianteService.buscarPorApellidoNamedQuery("Cacuango"));
		System.out.println("*******************************************");
		//System.out.println(this.estudianteService.buscarPorApellidoNativedQuery("Achig"));
		System.out.println(this.estudianteService.buscarPorApellidoNativedQueryNamed("Achig"));
		System.out.println("*******************************************");
		System.out.println(this.estudianteService.buscarPorNombreNativedQueryNamed("Felipe"));
		// vamos a usar metodos para los criteri query
	}

}
