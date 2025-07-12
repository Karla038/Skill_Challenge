package com.metaphorce.Shop.ShopMovie.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class PeliculaDTO {

    @NotBlank(message = "El título no puede estar vacío")
    @Size(max = 100, message = "El título no debe exceder los 100 caracteres")
    private String titulo;

    @NotBlank(message = "El género no puede estar vacío")
    private String genero;

    private boolean disponible;

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
}
