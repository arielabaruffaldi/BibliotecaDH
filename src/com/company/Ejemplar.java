package com.company;

public class Ejemplar {
    private Libro unLibro;
    private Integer nroEdicion;
    private String ubicacion;

    public Ejemplar(Libro unLibro, Integer nroEdicion, String ubicacion) {
        this.unLibro = unLibro;
        this.nroEdicion = nroEdicion;
        this.ubicacion = ubicacion;
    }

    public Libro getUnLibro() {
        return unLibro;
    }

    public Integer getNroEdicion() {
        return nroEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}
