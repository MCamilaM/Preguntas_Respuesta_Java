package com.cope.project;

/**
 * Objeto jugador: Crea un jugador y usa Puntaje
 */
public class Jugador {
    private Integer id;
    private String nombre;
    private Puntaje pj;

    public Jugador() {
        this.id = 1;
    }

    /**
     *
     * @return
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public Puntaje getPj() {
        return pj;
    }
}
