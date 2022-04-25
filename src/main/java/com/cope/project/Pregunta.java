package com.cope.project;

/**
 * Construye los atributos de las preguntas
 */
public class Pregunta {
    private int idPregunta;
    private String pregunta;
    private int idCategoria;
    private Respuesta[] respuestas;

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
     *Sirve para cargar las opciones de respuesta
     * @return devuelve posibilidades de respuesta
     */
    public void cargarRespuestas() {
    }

    /**
     * Mustra la respuesta
     */
    public void mostrarRespuestas() {
        for (Respuesta respuesta : this.respuestas) {
            System.out.println(respuesta.getDescripcion());
        }
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
