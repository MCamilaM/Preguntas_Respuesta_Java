package com.cope.project;

public class Pregunta {
    private int idPregunta;
    private String pregunta;
    private int idCategoria;
    private Respuesta[] respuestas;

    public Pregunta(int idPregunta, String pregunta, int idCategoria, Respuesta[] respuestas) {
        this.idPregunta = idPregunta;
        this.pregunta = pregunta;
        this.idCategoria = idCategoria;
        this.respuestas = respuestas;
    }

    public void cargarRespuestas(){}

    public void mostrarRespuestas(){
        for (Respuesta respuesta : this.respuestas) {
            System.out.println(respuesta.getDescripcion());
        }
    }
}
