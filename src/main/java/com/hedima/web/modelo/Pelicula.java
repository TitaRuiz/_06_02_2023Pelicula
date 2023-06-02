package com.hedima.web.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer peliculaId;
    @Column(length = 60, nullable = false)
    private String titulo;

    private String sinopsis;
    @Column(length = 20)
    private String clasificacion;
    @Column(length =60)
    private String urlImagen;

    public Pelicula(String titulo, String sinopsis, String clasificacion, String urlImagen) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.clasificacion = clasificacion;
        this.urlImagen = urlImagen;
    }
}
