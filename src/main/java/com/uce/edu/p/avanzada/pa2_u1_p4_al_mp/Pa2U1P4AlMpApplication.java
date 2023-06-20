package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Autor;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Libro;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.AutorService;



@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private AutorService autorService;
	

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
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
		
		

	}

}
