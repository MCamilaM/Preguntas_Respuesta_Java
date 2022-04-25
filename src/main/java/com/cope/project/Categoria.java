package com.cope.project;

/**
 * Representa el objeto categoría: crea categorias y se inicializan sus atributos.
 */
public class Categoria {
    private Integer idCategoria;
    private String descripcion;
    private Pregunta[] preguntas;

    public Categoria() {
    }

    /**
     *Inicializa atributos para categoría
     * @param idCategoria, identificador de categoría
     * @param descripcion
     */
    //Constructor
    public Categoria(Integer idCategoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
    }

    /**
     *Obtiene el id de las categorías
     * @return categorias
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }
}
