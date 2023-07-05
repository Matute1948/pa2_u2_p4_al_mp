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
	private EstdianteService estdianteService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante estudiante = new Estudiante();
		Estudiante estudiante1 = new Estudiante();

		estudiante.setNombre("Andres");
		estudiante.setApellido("Lugmaña");
		estudiante.setCedula("1724210685");
		estudiante.setInstitucion("Cen");
		estudiante.setPeso(Double.valueOf(130));
		
		estudiante1.setNombre("Arelis");
		estudiante1.setApellido("Cacuango");
		estudiante1.setCedula("1724210699");
		estudiante1.setInstitucion("Cen");
		estudiante1.setPeso(Double.valueOf(60));

		this.estdianteService.agregar(estudiante1);
		this.estdianteService.agregar(estudiante);
		
		this.estdianteService.buscarEstudianteDinamico("Andres", "Lugmaña", Double.valueOf(100));
		System.out.println(this.estdianteService.eliminarPorNombre("Andres"));
		System.out.println(this.estdianteService.actualizarPorApellido("Jhomara", "Cacuango"));
	}

}
