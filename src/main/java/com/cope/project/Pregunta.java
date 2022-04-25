package com.cope.project;

/**
 * Construye los atributos de las preguntas
 */
public class Pregunta {
    private int idPregunta;
    private String pregunta;
    private int idCategoria;

    public Pregunta() {
    }

    /**
     *Inicializa los atributos de las preguntas
     * @param idPregunta, identificador de las preguntas
     * @param pregunta
     * @param idCategoria, identificador categorías
     */
    //Constructor
    public Pregunta(int idPregunta, String pregunta, int idCategoria) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.idCategoria = idCategoria;
    }

    /**
     *Busca el Id de la pregunta
     * @return devuelve el id de la pregunta
     */
    public int getIdPregunta() {
        return this.idPregunta;
    }

    /**
     * Obtiene la pregunta
     * @return devuelve la pregunta
     */
    public String getPregunta() {
        return this.pregunta;
    }
}
