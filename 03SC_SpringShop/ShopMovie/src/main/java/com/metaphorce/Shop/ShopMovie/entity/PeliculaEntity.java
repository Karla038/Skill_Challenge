package com.metaphorce.Shop.ShopMovie.entity;

import jakarta.persistence.*;

@Entity
@Table( name = "pelicula")
public class PeliculaEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer idPelicula;

    @Column( name = "titulo", nullable = false )
    private String titulo;

    @Column( name = "genero", nullable = false )
    private String genero;

    @Column( name = "disponible", nullable = false )
    private boolean disponible;

    @Column( name = "activa", nullable = false )
    private boolean activa;

    public Integer getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Integer idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

}
