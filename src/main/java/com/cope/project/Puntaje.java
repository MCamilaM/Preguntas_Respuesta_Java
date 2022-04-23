package com.cope.project;

public class Puntaje {
    private Integer idPuntaje;
    private Integer puntaje;

    public Puntaje() {
    }

    public Puntaje(Integer idPuntaje, Integer puntaje) {
        this.idPuntaje = idPuntaje;
        this.puntaje = puntaje;
    }

    /*public void incrementarPuntaje(Integer puntos) {
        this.puntaje += puntos;
    }*/

    public Integer getPuntaje() {
        return puntaje;
    }

    public Integer getIdPuntaje() {
        return idPuntaje;
    }
}
