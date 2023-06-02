package com.hedima.web.repositorio;

import com.hedima.web.modelo.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPeliculaRepo extends JpaRepository<Pelicula,Integer> {
}
