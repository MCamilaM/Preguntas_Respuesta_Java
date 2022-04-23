package com.cope.project;

public class Respuesta {
    private int id;
    private String descripcion;
    private boolean esCorrecta;
    private Integer idPregunta;

    public Respuesta(int id, String descripcion, boolean esCorrecta, Integer idPregunta) {
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
