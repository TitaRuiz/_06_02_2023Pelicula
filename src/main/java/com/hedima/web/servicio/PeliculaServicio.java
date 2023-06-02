package com.hedima.web.servicio;

import com.hedima.web.modelo.Pelicula;
import com.hedima.web.repositorio.IPeliculaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PeliculaServicio implements IPeliculaServicio{
    @Autowired
    private IPeliculaRepo repo;
    @Override
    public List<Pelicula> mostrarTodos() {
        Sort sort = Sort.by(Sort.Direction.ASC, "peliculaId");
        return repo.findAll();
    }

    @Override
    public Pelicula mostrarUno(int id) {
        return repo.findById(id).orElse(new Pelicula());
    }

    @Override
    public Pelicula crear(Pelicula p) {
        return repo.save(p);
    }

    @Override
    public Pelicula modificar(Pelicula p) {
        return repo.save(p);
    }

    @Override
    public void eliminar(int id) {
      repo.deleteById(id);
    }
}
