package com.company;

import java.util.List;

public class Libro {
    private String libro;
    private Integer isbn;
    private String autor;
    private List<Ejemplar> listaEjemplares;

    public Libro(String libro, Integer isbn, String autor) {
        this.libro = libro;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getLibro() {
        return libro;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }
}
