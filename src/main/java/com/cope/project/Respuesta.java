package com.cope.project;

public class Respuesta {
    private int id;
    private String descripcion;
    private boolean correcta;
    private Integer idPregunta;

    public Respuesta(int id, String descripcion, boolean esCorrecta, Integer idPregunta) {
        this.id = id;
        this.descripcion = descripcion;
        this.correcta = esCorrecta;
        this.idPregunta = idPregunta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
