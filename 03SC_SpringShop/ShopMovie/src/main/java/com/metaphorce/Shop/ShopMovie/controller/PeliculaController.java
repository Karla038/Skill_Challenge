package com.metaphorce.Shop.ShopMovie.controller;

import com.metaphorce.Shop.ShopMovie.entity.PeliculaEntity;
import com.metaphorce.Shop.ShopMovie.service.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store/peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @PostMapping
    public PeliculaEntity agregarPelicula(@RequestBody PeliculaEntity pelicula) {
        return peliculaService.agregarPelicula(pelicula);
    }

    @DeleteMapping("/{id}")
    public String eliminarPelicula(@PathVariable int id) {
        return peliculaService.eliminarPelicula(id );
    }

    @GetMapping
    public List<PeliculaEntity> obtenerPeliculas() {
        return peliculaService.obtenerPeliculas();
    }

    @GetMapping("/disponibles")
    public List<PeliculaEntity> obtenerPeliculasDisponibles() {
        return peliculaService.obtenerPeliculasDisponibles();
    }

    @GetMapping("/nodisponibles")
    public List<PeliculaEntity> obtenerPeliculasNoDisponibles() {
        return peliculaService.obtenerPeliculasNoDisponibles();
    }

    @PutMapping("/{id}/disponible")
    public PeliculaEntity marcarComoDisponible(@PathVariable int id) {
        return peliculaService.marcarPeliculaComoDisponible(id);
    }

    @PutMapping("/{id}/activa")
    public PeliculaEntity marcarComoActiva(@PathVariable int id) {
        return peliculaService.marcarPeliculaComoActiva(id);
    }

}
