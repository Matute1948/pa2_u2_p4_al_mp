package com.uce.edu.p.avanzada.pa2_u1_p4_al_mp;
import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Ciudadano;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.repository.modelo.Empleado;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.CiudadanoService;
import com.uce.edu.p.avanzada.pa2_u1_p4_al_mp.service.EmpleadoService;


@SpringBootApplication
public class Pa2U1P4AlMpApplication implements CommandLineRunner {

	@Autowired
	private CiudadanoService ciudadanoService;
	@Autowired
	private EmpleadoService empleadoService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlMpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//hacer el crud para ciudadano y empleado
 
		Ciudadano ciudadano = new Ciudadano();
		Ciudadano ciudadano2 = new Ciudadano();
		Empleado empleado = new Empleado();
		
		 
		empleado.setCargo("Programador");
		empleado.setSueldo(new BigDecimal(2000));
		empleado.setCiudadano(ciudadano);
		ciudadano.setNombre("Andres");
		ciudadano.setApellido("Lugmaña");
		ciudadano.setCedula("1724210685");
		ciudadano.setEmpleado(empleado);

		ciudadano2.setNombre("Jhomara");
		ciudadano2.setApellido("Cacuando");
		ciudadano2.setCedula("1483742387462");
		ciudadano2.setEmpleado(empleado);

		this.ciudadanoService.agregar(ciudadano);
		Empleado empleado2=this.empleadoService.buscarPorNumero(2);
		empleado2.setCiudadano(ciudadano2);
		this.empleadoService.actualizar(empleado2);
		
		/* 
		empleado = this.empleadoService.buscarPorNumero(2);
		empleado.setCargo("Actor");
		this.empleadoService.actualizar(empleado);
		this.empleadoService.eliminar(2);


		ciudadano = this.ciudadanoService.buscarPorNumero(2);
		ciudadano.setNombre("Felipe");
		this.ciudadanoService.actualizar(ciudadano);
		this.ciudadanoService.eliminar(2);
		*/
		

	}

}
