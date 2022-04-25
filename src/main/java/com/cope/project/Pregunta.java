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
     *
     * @param idPregunta
     * @param pregunta
     * @param idCategoria
     */
    public Pregunta(int idPregunta, String pregunta, int idCategoria) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.idCategoria = idCategoria;
    }

    /**
     *
     * @return
     */
    public void cargarRespuestas() {
    }

    public void mostrarRespuestas() {
        for (Respuesta respuesta : this.respuestas) {
            System.out.println(respuesta.getDescripcion());
        }
    }

    /**
     *
     * @return
     */
    public int getIdPregunta() {
        return this.idPregunta;
    }

    public String getPregunta() {
        return this.pregunta;
    }
}
