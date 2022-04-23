package com.cope.project;

/**
 * @Author: Camila Morales - Josep Palomino - Sara Oquendo
 */
public class Main {
    public static void main(String[] args) {

        Respuesta respuesta1 = new Respuesta(1,"ballena",true,1);
        Respuesta respuesta2 = new Respuesta(2,"tiburon",false,1);
        Respuesta respuesta3 = new Respuesta(3,"pollo",false,1);
        Respuesta respuesta4 = new Respuesta(4,"chicha morada",false,1);
        Respuesta[] respuestas = {respuesta1,respuesta2,respuesta3,respuesta4};
        Pregunta pregunta = new Pregunta(1,"animal acuatico", 1, respuestas);
        pregunta.mostrarRespuestas();
        ArchivoTexto aT = new ArchivoTexto();
        aT.leerArchivo("preguntas.txt");
        //Prueba
    }
}

