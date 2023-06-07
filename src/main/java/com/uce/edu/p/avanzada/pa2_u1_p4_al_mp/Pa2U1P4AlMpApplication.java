package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstdianteService;

@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	//private EstdianteService estudianteService;
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* 
		Estudiante estudiante = new Estudiante();
		
		estudiante.setNombre("Andres");
		estudiante.setApellido("Lugmaña");
		estudiante.setInstitucion("Central");
		estudiante.setCedula("1234");
		this.estudianteService.agregar(estudiante);
		*/

	}

}
