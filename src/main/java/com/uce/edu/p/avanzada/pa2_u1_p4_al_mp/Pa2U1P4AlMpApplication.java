package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Estudiante;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Habitacion;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Hotel;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.EstudianteDTO;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.dto.MatriculaDTO;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EstdianteService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.HotelService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.MatriculaService;

@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {
	@Autowired
	private EstdianteService estudianteService;
	@Autowired
	private MatriculaService matriculaService;
	@Autowired
	private HotelService hotelService;


	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante estudiante = new Estudiante();
		Estudiante estudiante1 = new Estudiante();

		Hotel hot = new Hotel();
		Habitacion hab1 = new Habitacion();
		Habitacion hab2 = new Habitacion();
		Habitacion hab3 = new Habitacion();
		List<Habitacion> hab = new ArrayList<>();
		

		hab1.setNumero("102");
		hab2.setNumero("103");
		hab3.setNumero("104");
		hab1.setHotel(hot);
		hab2.setHotel(hot);
		hab3.setHotel(hot);
		hab.add(hab3);
		hab.add(hab2);
		hab.add( hab1);
		hot.setDireccion("Sangolqui");
		hot.setNombre("Buen dia");

		hot.setHabitacion(hab);

		//this.hotelService.agregar(hot);

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

		//this.estudianteService.agregar(estudiante1);
		//this.estudianteService.agregar(estudiante);
		
		//this.estdianteService.buscarEstudianteDinamico("Andres", "Lugmaña", Double.valueOf(130));
		//this.estdianteService.buscarEstudianteDinamico("Arelis", "Cacuango", Double.valueOf(80));
		//System.out.println(this.estdianteService.eliminarPorNombre("Andres"));
		//System.out.println(this.estdianteService.actualizarPorApellido("Jhomara", "Cacuango"));

		
		System.out.println("*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<MatriculaDTO> lis = this.matriculaService.buscarTodoDTO();
		for (MatriculaDTO matriculaDTO : lis) {
			System.out.println(matriculaDTO);
		}
		System.out.println("*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<EstudianteDTO> esList = this.estudianteService.buscarTodoDTO();
		for (EstudianteDTO estudianteDTO : esList) {
			System.out.println(estudianteDTO);
		}
		
		System.out.println("*++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		List<Habitacion> habb = this.hotelService.buscarPorNumero(152).getHabitacion();
		System.out.println(habb.get(0));

	}

}
