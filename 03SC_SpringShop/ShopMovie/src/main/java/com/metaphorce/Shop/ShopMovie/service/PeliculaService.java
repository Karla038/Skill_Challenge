package com.metaphorce.Shop.ShopMovie.service;

import com.metaphorce.Shop.ShopMovie.entity.PeliculaEntity;
import com.metaphorce.Shop.ShopMovie.repository.IPeliculaRepository;
import com.metaphorce.Shop.ShopMovie.exception.PeliculaNoEncontradaException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PeliculaService {

    @Autowired
    private IPeliculaRepository iPeliculaRepository;


    public PeliculaEntity agregarPelicula(PeliculaEntity pelicula) {
        pelicula.setActiva(true);
        return iPeliculaRepository.save(pelicula);
    }


    public String eliminarPelicula(int id) {
        iPeliculaRepository.deleteById(id);
        return "Pelicula" + id  + "eliminada correctamente";
    }


    public List<PeliculaEntity> obtenerPeliculas() {
        return iPeliculaRepository.findAll();
    }


    public List<PeliculaEntity> obtenerPeliculasDisponibles() {
        return iPeliculaRepository.findByDisponibleTrue();
    }


    public List<PeliculaEntity> obtenerPeliculasNoDisponibles() {
        return iPeliculaRepository.findByDisponibleFalse();
    }


    public PeliculaEntity marcarPeliculaComoDisponible(int id) {
        PeliculaEntity pelicula = iPeliculaRepository.findById(id)
                .orElseThrow(() -> new PeliculaNoEncontradaException("Pelicula con ID " + id + " no encontrada"));
        pelicula.setDisponible(true);
        return iPeliculaRepository.save(pelicula);
    }


    public PeliculaEntity marcarPeliculaComoActiva(int id) {
        Optional<PeliculaEntity> optPelicula = iPeliculaRepository.findById(id);
        if (optPelicula.isPresent()) {
            PeliculaEntity pelicula = optPelicula.get();
            pelicula.setActiva(true);
            return iPeliculaRepository.save(pelicula);
        }
        return null;
    }

}
