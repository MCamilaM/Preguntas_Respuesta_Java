package com.cope.project;

public class Jugador {
    private Integer id;
    private String nombre;
    private Puntaje pj;

    public Jugador() {
        this.id = 1;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Puntaje getPj() {
        return pj;
    }
}
