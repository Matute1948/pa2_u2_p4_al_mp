package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;


import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.repository.modelo.VideoJuego;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.deberCriteriQuery.service.VideoJuegoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstdianteService;

@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {
	@Autowired
	private VideoJuegoService videoJuegoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		VideoJuego videoJuego1 = new VideoJuego();
		VideoJuego videoJuego2 = new VideoJuego();
		VideoJuego videoJuego3 = new VideoJuego();
		VideoJuego videoJuego4 = new VideoJuego();

		videoJuego1.setTitulo("God of war 2018");
		videoJuego1.setGenero("Aventura");
		videoJuego1.setDesarolladora("Santa Monica");
		videoJuego1.setCosto(new BigDecimal(20));

		videoJuego2.setTitulo("Bayonetta");
		videoJuego2.setGenero("Aventura");
		videoJuego2.setDesarolladora("Sega");
		videoJuego2.setCosto(new BigDecimal(40));

		videoJuego3.setTitulo("Zelda BOFTW");
		videoJuego3.setGenero("Mundo abierto");
		videoJuego3.setDesarolladora("Nintendo");
		videoJuego3.setCosto(new BigDecimal(60));

		videoJuego4.setTitulo("Sonic Fronters");
		videoJuego4.setGenero("Aventura");
		videoJuego4.setDesarolladora("Sega");
		videoJuego4.setCosto(new BigDecimal(35));

		this.videoJuegoService.agregar(videoJuego1);
		this.videoJuegoService.agregar(videoJuego2);
		this.videoJuegoService.agregar(videoJuego3);
		this.videoJuegoService.agregar(videoJuego4);

		System.out.println(this.videoJuegoService.buscarPorDesarolladoraCosto("Nintendo", new BigDecimal(0)));





		/* 
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
		estudiante1.setPeso(Double.valueOf(70));

		this.estdianteService.agregar(estudiante1);
		this.estdianteService.agregar(estudiante);
		
		this.estdianteService.buscarEstudianteDinamico("Andres", "Lugmaña", Double.valueOf(130));
		this.estdianteService.buscarEstudianteDinamico("Arelis", "Cacuango", Double.valueOf(80));
		System.out.println(this.estdianteService.eliminarPorNombre("Andres"));
		System.out.println(this.estdianteService.actualizarPorApellido("Jhomara", "Cacuango"));

		*/
	}

}
