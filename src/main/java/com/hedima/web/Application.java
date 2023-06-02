package com.hedima.web;

import com.hedima.web.modelo.Pelicula;
import com.hedima.web.servicio.IPeliculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private IPeliculaServicio servicio;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Pelicula p1 = new Pelicula("Los dinosaurios","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse rutrum enim vel sagittis proin. ","Todo publico","pelicula_1.jpg");
//		Pelicula p2 = new Pelicula("GoldFinger","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse rutrum enim vel sagittis proin. ","Todo publico","pelicula_2.jpg");
//		Pelicula p3 = new Pelicula("Los Holes","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse rutrum enim vel sagittis proin. ","Todo publico","pelicula_3.jpg");
//		Pelicula p4 = new Pelicula("Orgullo y prejuicio","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse rutrum enim vel sagittis proin. ","Todo publico","pelicula_4.jpg");
//		Pelicula p5 = new Pelicula("Africa mia","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse rutrum enim vel sagittis proin. ","Todo publico","pelicula_5.jpg");
//
//		servicio.crear(p1);
//		servicio.crear(p2);
//		servicio.crear(p3);
//		servicio.crear(p4);
//		servicio.crear(p5);
	}
}
