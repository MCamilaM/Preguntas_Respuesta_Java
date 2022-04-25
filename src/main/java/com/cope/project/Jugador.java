package com.cope.project;

/**
 * Objeto jugador: Crea un jugador y usa Puntaje, donde jugador representa a la persona encargada
 * de responder las preguntas y "ganar un premio"
 */
public class Jugador {
    private Integer id;
    private String nombre;
    private Puntaje pj;

    public Jugador() {
        this.id = 1;
    }

    /**
     *Devuelve el Id del jugador para poder encontrarlo
     * @return devuelve id jugador
     */
    public Integer getId() {
        return id;
    }

    /**
     *Devuelve el nombre o "nickname", del encargado de jugar
     * @return nombre del jugador
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *Establece el nombre del jugador
     * @param nombre, nombre del jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *Asigna el id al jugador
     * @param id, identidad del jugador
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *Asigna el puntaje del jugador
     * @return devuelve el puntaje del jugador
     */
    public Puntaje getPj() {
        return pj;
    }
}
