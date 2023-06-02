package com.hedima.web.servicio;

import com.hedima.web.modelo.Pelicula;

import java.util.List;

public interface IPeliculaServicio {

    List<Pelicula> mostrarTodos();
    Pelicula mostrarUno(int id);
    Pelicula crear(Pelicula p);
    Pelicula modificar(Pelicula p);
    void eliminar(int id);
}
