package com.cope.project;

public class Pregunta {
    private int idPregunta;
    private String pregunta;
    private int idCategoria;
    private Respuesta[] respuestas;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, String pregunta, int idCategoria) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.idCategoria = idCategoria;
    }

    public void cargarRespuestas() {
    }

    public void mostrarRespuestas() {
        for (Respuesta respuesta : this.respuestas) {
            System.out.println(respuesta.getDescripcion());
        }
    }

    public int getIdPregunta() {
        return this.idPregunta;
    }

    public String getPregunta() {
        return this.pregunta;
    }
}
