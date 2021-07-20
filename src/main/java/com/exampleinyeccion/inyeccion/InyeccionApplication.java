package com.exampleinyeccion.inyeccion;

import com.exampleinyeccion.inyeccion.component.Nombre;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InyeccionApplication implements CommandLineRunner {

	private Nombre nombre;

	//metodo constructor
	public InyeccionApplication(@Qualifier("apellidoImplementado") Nombre nombre) {
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		SpringApplication.run(InyeccionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		nombre.mostrarNombre();
	}
}
