package com.cope.project;


import java.util.List;

public interface IAccesoDatos {

    Categoria listarCategoria(String nombreArchivo, Integer idCategoria);

    List<Pregunta> listarPreguntas(String nombreArchivo, Integer idPregunta);

    List<Respuesta> listarRespuesta(String nombreArchivo, Integer idRespuesta);

    Puntaje listarPuntaje(String nombreArchivo, Integer idCategoria);

    List<String> listarHistorico(String nombreArchivo);

    void escribirHistorico(String nombreArchivo, String historico);


}
