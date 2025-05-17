package com.methaporce.vista;

import com.methaporce.modelo.GestorPelicula;
import com.methaporce.modelo.Pelicula;

public class Main {
    public static void main(String[] args) {
        // Crear el gestor
        GestorPelicula gestor = new GestorPelicula();

//        // Crea películas
        Pelicula p1 = new Pelicula(1, "Orgullo y Prejuicio", true);
        Pelicula p2 = new Pelicula(2, "El conjuro", false);
        Pelicula p3 = new Pelicula(3, "Pasajeros", true);
        Pelicula p4 = new Pelicula(4, "Gravity  ", false);
//
//        // Agregar al gestor
        gestor.agregarPelicula(p1);
        gestor.agregarPelicula(p2);
        gestor.agregarPelicula(p3);
        gestor.agregarPelicula(p4);

//        System.out.println("Lista completa de películas:");
//        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
//            System.out.println( " Título: " + pelicula.getNombre() + " Disponible: " + pelicula.isDisponible());
//        }

        // Eliminar una película de la lista
//        gestor.eliminarPelicula(4);

//        System.out.println("Lista de películas después de eliminar:");
//        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
//            System.out.println( " Título: " + pelicula.getNombre() + " Disponible: " + pelicula.isDisponible());
//        }

//        // Marcar una película como disponible
//        gestor.marcarPeliculaComoDisponible(2);

//        System.out.println("Lista de películas disponibles:");
//        for (Pelicula pelicula : gestor.obtenerPeliculas()) {
//            System.out.println( " Título: " + pelicula.getNombre() + " Disponible: " + pelicula.isDisponible());
//        }

//        // Muestra películas no disponibles
        System.out.println("Películas no disponibles:");
        for (Pelicula pelicula : gestor.obtenerPeliculasNoDisponibles()) {
            System.out.println(pelicula.getNombre());
        }
    }
}

