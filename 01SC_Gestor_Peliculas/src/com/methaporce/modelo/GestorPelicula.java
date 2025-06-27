package com.methaporce.modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorPelicula {

    private List<Pelicula> peliculas;

    public GestorPelicula() {
        this.peliculas = new ArrayList<>();
    }

    public void agregarPelicula ( Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void eliminarPelicula (int id){
        peliculas.removeIf( pelicula -> pelicula.getId() == id);
    }

    public List<Pelicula> obtenerPeliculas (){

        return new ArrayList<>(peliculas);
    }

    public List<Pelicula> obtenerPeliculasDisponibles(){
        List<Pelicula> disponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.isDisponible()) {
                disponibles.add(pelicula);
            }
        }
        return disponibles;
    }

    public List<Pelicula> obtenerPeliculasNoDisponibles(){
        List<Pelicula> noDisponibles = new ArrayList<>();
        for (Pelicula pelicula : peliculas) {
            if (!pelicula.isDisponible()) {
                noDisponibles.add(pelicula);
            }
        }
        return noDisponibles;
    }

    public void marcarPeliculaComoDisponible( int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                pelicula.setDisponible(true);
                break;
            }
        }
    }

    public Pelicula buscarPorNombre ( String nombre) {
        for (Pelicula pelicula: peliculas ){

            if( pelicula.getNombre().equals(nombre)){
                return pelicula;
            }
        }
        return null;
    }

}
