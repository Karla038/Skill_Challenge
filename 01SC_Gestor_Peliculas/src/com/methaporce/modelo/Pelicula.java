package com.methaporce.modelo;

public class Pelicula {

//    Atributos de una pelicula
    private int id;
    private String nombre;
    private boolean disponible;

//    El constructor necesario para poder crear la instancia
    public Pelicula( int id, String nombre, boolean disponible){
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
