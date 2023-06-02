package com.hedima.web.controlador;

import com.hedima.web.modelo.Pelicula;
import com.hedima.web.servicio.IPeliculaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("")
public class PeliculaControlador {
    @Autowired
    private IPeliculaServicio servicio;
    @GetMapping
    public String mostrarTodas(Model modelo){
        List<Pelicula> peliculas = servicio.mostrarTodos();

        modelo.addAttribute("peliculas", peliculas);

        return "index";
    }
}
