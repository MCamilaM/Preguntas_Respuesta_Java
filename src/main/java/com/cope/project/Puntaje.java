package com.cope.project;

/**
 * Guarda los atributos del puntaje para que se pueda acumular o eliminar
 */
public class Puntaje {
    private Integer idPuntaje;
    private Integer puntaje;

    public Puntaje() {
        this.puntaje = 0;
    }

    /**
     *Inicializa los atributos del puntaje
     * @param idPuntaje, Identificador de puntaje
     * @param puntaje
     */
    //Constructor
    public Puntaje(Integer idPuntaje, Integer puntaje) {
        this.idPuntaje = idPuntaje;
        this.puntaje = puntaje;
    }

    /**
     *Obtiene el puntaje
     * @return devuelve puntaje
     */
    public Integer getPuntaje() {
        return puntaje;
    }

    /**
     *
     * @param puntaje
     */
    public void setPuntaje(Integer puntaje) {
        this.puntaje = puntaje;
    }


}

