package com.cope.project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileReader;

public class AccesoDatos implements IAccesoDatos{
    public Categoria listarCategoria(String nombreArchivo, Integer idCategoria){
        File archivo = new File(nombreArchivo);
        Categoria categoria = null;

                try {
                    BufferedReader entrada = new BufferedReader(new FileReader(archivo));
                    String lectura = entrada.readLine();

                    while (lectura != null) {

                        String[] cadena = lectura.split(",");
                        Integer id = Integer.parseInt(cadena[0]);
                        if(id == idCategoria){
                            categoria = new Categoria(id,cadena[1]);
                        }
                        lectura = entrada.readLine();
                    }
                    entrada.close();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace(System.out);
                } catch (IOException ex) {
                    ex.printStackTrace(System.out);
                }
                return categoria;
    }
    public List<Pregunta> listarPreguntas(String nombreArchivo, Integer idCategoria){
        File archivo = new File(nombreArchivo);
        List<Pregunta> preguntas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            while (lectura != null) {

                String[] cadena = lectura.split(",");
                Integer id = Integer.parseInt(cadena[0]);
                Integer idCat = Integer.parseInt(cadena[2]);

                if(idCategoria == idCategoria){
                    preguntas.add(new Pregunta(id,cadena[1],idCat));
                }

                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return preguntas;
    }


    public List<Respuesta> listarRespuesta(String nombreArchivo, Integer idPregunta){
        File archivo = new File(nombreArchivo);
        List<Respuesta> respuestas = new ArrayList<>();
        Respuesta respuesta = null;
        //System.out.println("111111");
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();

            while (lectura != null) {
                String[] cadena = lectura.split(",");

                Integer id = Integer.parseInt(cadena[3]);
                if(id == idPregunta){
                    Integer idRespuesta = Integer.parseInt(cadena[0]);
                   String descripcion = cadena[1];
                   Boolean esCorrecta = Boolean.parseBoolean(cadena[2]);
                     respuesta = new Respuesta(idRespuesta, descripcion, esCorrecta, id);
                     respuestas.add(respuesta);
                    //System.out.println("entre al if");
                }
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return respuestas;
    }

}
