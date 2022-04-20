package com.cope.project;

public class Pregunta {
    private int idPregunta;
    private String pregunta;
    private int idCategoria;
    private Respuesta[] respuestas;

    public Pregunta(int idPregunta, String pregunta, int idCategoria) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.idCategoria = idCategoria;
    }

    public void cargarRespuestas(){}

    public void mostrarRespuestas(){
    }
}
