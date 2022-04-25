package com.cope.project;

/**
 * Objeto categoría: crea categorias y se inicializan sus atributos
 */
public class Categoria {
    private Integer idCategoria;
    private String descripcion;
    private Pregunta[] preguntas;

    public Categoria() {
    }

    /**
     *
     * @param idCategoria
     * @param descripcion
     */
    public Categoria(Integer idCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }

    /**
     *
     * @return
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }
}
