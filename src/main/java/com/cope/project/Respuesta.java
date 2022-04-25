package com.cope.project;

/**
 * Guarda los atributos para las respuestas
 */
public class Respuesta {
    private int id;
    private String descripcion;
    private boolean correcta;
    private Integer idPregunta;

    /**
     *
     * @param id
     * @param descripcion
     * @param esCorrecta
     * @param idPregunta
     */
    public Respuesta(int id, String descripcion, boolean esCorrecta, Integer idPregunta) {
        this.id = id;
        this.descripcion = descripcion;
        this.correcta = esCorrecta;
        this.idPregunta = idPregunta;
    }

    /**
     *
     * @return
     */
    public boolean isCorrecta() {
        return correcta;
    }

    /**
     *
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }
}
