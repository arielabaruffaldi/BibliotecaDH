package com.company.Socio;

public class Socio {
    private String nombre;
    private String apellido;
    private Integer nroId;

    public Socio(String nombre, String apellido, Integer nroId) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nroId = nroId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getNroId() {
        return nroId;
    }
}
