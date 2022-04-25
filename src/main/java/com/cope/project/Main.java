package com.cope.project;

import java.io.*;
import java.io.BufferedReader;

/**
 * Juego de preguntas que sube de dificultad y acumula un premio.
 * @Author: Camila Morales - Josep Palomino - Sara Oquendo
 */
public class Main {

    public static void main(String[] args) throws IOException {

        int opcion = 0;
        while (opcion != 4) {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("-----------------------------------");
            System.out.println("|    ¿QUIÉRES SER MILLONARIO?     |");
            System.out.println("|   Llegaste al lugar indicado    |");
            System.out.println("-----------------------------------");
            System.out.println("|       1 - Iniciar Juego         |");
            System.out.println("|       2 - Leaderboards          |");
            System.out.println("|       3 - Como Jugar            |");
            System.out.println("|       4 - Salir                 |");
            System.out.println("-----------------------------------");

            try {
                System.out.print("\nIngresa una opción: ");
                opcion = Integer.parseInt(reader.readLine());
                Ronda rondas = new Ronda();
                switch (opcion) {
                    case 1:
                        rondas.iniciarRonda();
                        break;
                    case 2:
                        rondas.listarHistorico();
                        break;
                    case 3:
                        mostrarInstrucciones();
                        break;
                    case 4:
                        System.out.println("-----------------------------------");
                        System.out.println("|       Gracias por Jugar...       |");
                        System.out.println("-----------------------------------");
                        break;
                    default:
                        System.out.println("Por favor, ingresa un opción valida. del 1 al 4: ");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Por favor, ingrese un dato válido.");
            }


        }
    }

    public static void mostrarInstrucciones() {
        System.out.println("-----------------------------------");
        System.out.println("|          Instrucciones          |");
        System.out.println("-----------------------------------");
        System.out.println("- para iniciar la ronda de preguntas, ingresar la opcion 1 " +
                "debe ingresar un nombre/apodo." +
                "\n- solo hay 5 rondas, cada ronda con una pregunta.\n- el nivel de dificultad de cada " +
                "pregunta incrementa acorde vaya avanzando." +
                "\n- para responder a la pregunta, debes seleccionar una de las 4 respuestas segun su numero de orden" +
                "solo hay una respuesta correcta." +
                "\n- si acierta a la pregunta sumara una cantidad de puntos dependiendo del nivel de " +
                "dificultad de la pregunta." +
                "\n- si acierta a la pregunta tiene la posibilidad de continuar a la siguiente ronda o de " +
                "retirarse con los puntos acumulados,\npara esto debe ingresar la opcion 5(Rendirse)." +
                "\n- si falla al contestar la pregunta perdera todos los puntos y se terminara el juego." +
                "\n- si responde correctamente todas las 5 rondas, tendra el maximo puntaje y se terminara el juego." +
                "\n\n  Buena Suerte :DDD!");
        System.out.println("--------------------------------------------------------------------------------------");
    }


}
