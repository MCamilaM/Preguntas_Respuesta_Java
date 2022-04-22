package com.cope.project;

public class Respuesta {
    private int id;
    private String descripcion;
    private boolean esCorrecta;
    private int idPregunta;

    public Respuesta(int id, String descripcion, boolean esCorrecta, int idPregunta) {
        this.id = id;
        this.descripcion = descripcion;
        this.esCorrecta = esCorrecta;
        this.idPregunta = idPregunta;
    }

    public void getEsCorrecta(){}

    public String getDescripcion() {
        return descripcion;
    }
}
