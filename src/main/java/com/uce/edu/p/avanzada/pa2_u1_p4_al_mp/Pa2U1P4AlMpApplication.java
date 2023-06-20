package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.AutorService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.CiudadanoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EmpleadoService;



@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private AutorService autorService;
	@Autowired
	private CiudadanoService ciudadanoService;
	@Autowired
	private EmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Ciudadano ciudadano = new Ciudadano();
		Empleado empleado = new Empleado();

		ciudadano.setNombre("Andres");
		ciudadano.setApellido("Lugmaña");
		ciudadano.setCedula("17242106985");
		ciudadano.setEmpleado(empleado);

		empleado.setCargo("Programador");
		empleado.setCiudadano(ciudadano);
		empleado.setSueldo(new BigDecimal(2000));

		this.ciudadanoService.agregar(ciudadano);
		Ciudadano ciu = this.ciudadanoService.buscarPorNumero(1);
		ciu.setNombre("Felipe");
		this.ciudadanoService.actualizar(ciu);
		
		Empleado em = this.empleadoService.buscarPorNumero(1);
		em.setCargo("Senior");
		this.empleadoService.actualizar(em);
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
