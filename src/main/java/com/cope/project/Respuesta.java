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
     *Inicializa los atributos de las respuestas
     * @param id
     * @param descripcion
     * @param esCorrecta
     * @param idPregunta, identificador de la pregunta
     */
    public Respuesta(int id, String descripcion, boolean esCorrecta, Integer idPregunta) {
        this.id = id;
        this.descripcion = descripcion;
        this.correcta = esCorrecta;
        this.idPregunta = idPregunta;
    }

    /**
     *Evalua pregunta/respuesta
     * @return devuelve resultado
     */
    public boolean isCorrecta() {
        return correcta;
    }

    /**
     *Obtiene la descripción de la respuesta
     * @return
     */
    public String getDescripcion() {
        return descripcion;
    }
}
