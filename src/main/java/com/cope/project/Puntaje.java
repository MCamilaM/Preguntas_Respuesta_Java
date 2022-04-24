package com.cope.project;

public class Puntaje {
    private Integer idPuntaje;
    private Integer puntaje;

    public Puntaje() {
        this.puntaje = 0;
    }

    public Puntaje(Integer idPuntaje, Integer puntaje) {
        this.idPuntaje = idPuntaje;
        this.puntaje = puntaje;
    }

    public Integer getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }


}

