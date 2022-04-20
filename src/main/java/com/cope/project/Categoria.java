package com.cope.project;

public class Categoria {
    private int idCategoria;
    private String descripcion;
    private Pregunta[] preguntas;

    public Categoria(int idCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }

    public void preguntaAleatoria(){}
}
