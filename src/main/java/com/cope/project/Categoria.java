package com.cope.project;

public class Categoria {
    private Integer idCategoria;
    private String descripcion;
    private Pregunta[] preguntas;

    public Categoria(Integer idCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }

    public void preguntaAleatoria(){}

}
