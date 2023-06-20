package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Habitacion;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Hotel;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.AutorService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.CiudadanoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EmpleadoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.HabitacionService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.HotelService;



@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private HotelService hotelService;
	@Autowired
	private HabitacionService habitacionService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Hotel hotel1 = new Hotel();
		List<Habitacion> listHab = new ArrayList<>();
		Habitacion habitacion = new Habitacion();
		Habitacion habitacion2 = new Habitacion();
		

		habitacion.setNumero("231");
		habitacion.setValor(new BigDecimal(300));
		habitacion.setHotel(hotel1);
		//------------------------------------
		habitacion2.setHotel(hotel1);
		habitacion2.setNumero("313");
		habitacion2.setValor(new BigDecimal(200));

		listHab.add( habitacion);
		listHab.add( habitacion2);

		hotel1.setNombre("Amanecer");
		hotel1.setDireccion("Valle de los chillos");
		hotel1.setHabitacion(listHab);

		this.hotelService.agregar(hotel1);
		Hotel hot = this.hotelService.buscarPorNumero(1);
		this.hotelService.actualizar(hot);
		
		Habitacion hab = this.habitacionService.buscarPorNumero(1);
		this.habitacionService.actualizar(hab);
		this.habitacionService.eliminar(1);
		this.habitacionService.eliminar(2);
		this.hotelService.eliminar(1);
		



		//this.empleadoService.eliminar(1);
		//this.ciudadanoService.eliminar(1);



		/* 
		Autor autor = new Autor();
		Autor autor1 = new Autor();

		autor.setNombre("Andres");
		autor.setApellido("Lugmaña");
		
		autor1.setNombre("Jhomara");
		autor1.setApellido("Cacuango");


		Libro libro = new Libro();
		Libro libro1 = new Libro();


		libro.setEditorial("Castellana");
		libro.setTitulo("El puro de fresa");

		libro1.setEditorial("Ecuadroian");
		libro1.setTitulo("Canta Canta ahhh");

		Set<Autor> autores = new HashSet<>();
		Set<Libro> libros = new HashSet<>();
		autores.add(autor);
		autores.add(autor1);
		libros.add(libro1);
		libros.add(libro);

		autor.setLibro(libros);
		autor1.setLibro(libros);
		libro.setAutores(autores);
		libro1.setAutores(autores);

		this.autorService.agregar(autor);
		
		*/

	}

}
