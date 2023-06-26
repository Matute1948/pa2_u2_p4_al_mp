package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.CiudadanoService;




@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private CiudadanoService ciudadanoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* 
		Ciudadano ciudadano = new Ciudadano();
		ciudadano.setCedula("756834");
		ciudadano.setNombre("Katerine");
		ciudadano.setApellido("Lugmaña");
		
		Ciudadano ciudadano1 = new Ciudadano();
		ciudadano1.setCedula("756839");
		ciudadano1.setNombre("Diego");
		ciudadano1.setApellido("Rivas");

		Ciudadano ciudadano2 = new Ciudadano();
		ciudadano2.setCedula("756833");
		ciudadano2.setNombre("Elena");
		ciudadano2.setApellido("Rivas");

		Ciudadano ciudadano3 = new Ciudadano();
		ciudadano3.setCedula("756835");
		ciudadano3.setNombre("Adrian");
		ciudadano3.setApellido("Rivas");

		Ciudadano ciudadano4 = new Ciudadano();
		ciudadano4.setCedula("756836");
		ciudadano4.setNombre("Jhomara");
		ciudadano4.setApellido("Cacuango");
		
		Ciudadano ciudadano5 = new Ciudadano();
		ciudadano5.setCedula("756840");
		ciudadano5.setNombre("Andres");
		ciudadano5.setApellido("Lugmaña");
		Ciudadano ciudadano6 = new Ciudadano();
		ciudadano6.setCedula("756841");
		ciudadano6.setNombre("Ronny");
		ciudadano6.setApellido("Achig");
		 
		Empleado empleado = new Empleado();
		empleado.setCargo("Programador");
		empleado.setSueldo(new BigDecimal(2000));
		empleado.setCiudadano(ciudadano);
		Empleado empleado1 = new Empleado();
		empleado1.setCargo("Programador");
		empleado1.setSueldo(new BigDecimal(3000));
		empleado1.setCiudadano(ciudadano1);
		Empleado empleado2 = new Empleado();
		empleado2.setCargo("Programador");
		empleado2.setSueldo(new BigDecimal(1000));
		empleado2.setCiudadano(ciudadano2);
		Empleado empleado3 = new Empleado();
		empleado3.setCargo("Programador");
		empleado3.setSueldo(new BigDecimal(4000));
		empleado3.setCiudadano(ciudadano3);
		Empleado empleado4 = new Empleado();
		empleado4.setCargo("Programador");
		empleado4.setSueldo(new BigDecimal(3000));
		empleado4.setCiudadano(ciudadano4);

		ciudadano.setEmpleado(empleado);
		ciudadano1.setEmpleado(empleado1);
		ciudadano2.setEmpleado(empleado2);
		ciudadano3.setEmpleado(empleado3);
		ciudadano4.setEmpleado(empleado4);

		this.ciudadanoService.agregar(ciudadano);
		this.ciudadanoService.agregar(ciudadano1);
		this.ciudadanoService.agregar(ciudadano2);
		this.ciudadanoService.agregar(ciudadano3);
		this.ciudadanoService.agregar(ciudadano4);
		
		this.ciudadanoService.agregar(ciudadano6);
		this.ciudadanoService.agregar(ciudadano5);
		*/
		//Query single result 
		System.out.println("*******************************************");
		System.out.println(this.ciudadanoService.buscarPorApellido("Achig"));
		//Query result list
		System.out.println("*******************************************");
		System.out.println(this.ciudadanoService.buscarPorListApellido("Lugmaña"));
		//TypeQuery single result
		System.out.println("*******************************************");
		System.out.println(this.ciudadanoService.buscarPorApellidoTyped("Cacuango"));
		//TypeQuery result list 
		System.out.println("*******************************************");
		System.out.println(this.ciudadanoService.buscarPorApellidoListTyped("Rivas"));
		System.out.println("*******************************************");
	}

}
