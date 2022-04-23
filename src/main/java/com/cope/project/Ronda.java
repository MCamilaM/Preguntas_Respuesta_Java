package com.cope.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ronda {
    private Integer numRonda;
    private Categoria categoria;
    private Pregunta pregunta;
    private Puntaje puntaje;
    private Jugador jugador;
    private AccesoDatos accesoDatos;
    private List<Respuesta> respuestas;

    public Ronda() {
        this.numRonda = 1;
        accesoDatos = new AccesoDatos();
        respuestas = new ArrayList<>();
        categoria = new Categoria();
        pregunta = new Pregunta();
    }

    public void iniciarRonda() {
        System.out.println("-----------------------------------");
        System.out.println("|    ¡Listo o no, aquí vamos!     |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
        System.out.println("||||||||||||||Ronda #" + this.numRonda + "|||||||||||||");
        listarCategoria();
        listarPreguntaAleatoria();
        listarRespuestas();

    }

    public void listarCategoria() {
        this.categoria = accesoDatos.listarCategoria("categoria.txt", this.numRonda);
    }

    private void listarPreguntaAleatoria() {
        List<Pregunta> preguntas = accesoDatos.listarPreguntas("preguntas.txt", this.categoria.getIdCategoria());
        double numAleatorio = Math.random() * 4 + 1;
        this.pregunta = preguntas.get((int) numAleatorio);
        System.out.println(this.pregunta.getPregunta());
    }

    private void listarRespuestas() {
        respuestas.clear();
        this.respuestas = accesoDatos.listarRespuesta("respuestas.txt", this.pregunta.getIdPregunta());
        Scanner capturar = new Scanner(System.in);
        int opcion = 6;
        String mensaje = ">Ingrese una opción: ";
        String pregunta = "";
        do {
            int cont = 1;
            System.out.println(pregunta);
            for (Respuesta respuesta : respuestas) {
                System.out.println(cont + ". " + respuestas.get(cont - 1).getDescripcion());
                cont++;
            }
            System.out.println("5. Salir");
            System.out.print(mensaje);
            try {
                pregunta = this.pregunta.getPregunta();
                opcion = capturar.nextInt();
                if (opcion == 5) {
                    salirRondaIntensional();
                    break;
                }
                mensaje = "Ingresa un opción valida. del 1 al 5: ";

            } catch (Exception e) {
                System.out.println(">>Debe ser un dato numérico.");
                capturar.nextLine();
                // e.printStackTrace();
            }
        } while (opcion > 5 && opcion != 5);

        validarRespuesta(opcion - 1);

    }

    public void incrementarNumeroRonda() {
        this.numRonda = numRonda + 1;
    }

    private void validarRespuesta(int indiceRespuesta) {
        Respuesta respuesta = respuestas.get(indiceRespuesta);
        if (respuesta.isCorrecta() && this.numRonda == 5) {
            finalizarJuego(); //gana el juego
        } else if (respuesta.isCorrecta()) {
            siguienteRonda(); // pasa a la siguiente pregunta
        } else {
            terminarJuegoForzado(); // pierde y se terminar el juego
        }
    }

    public void siguienteRonda() {
        System.out.println("-----------------------------------");
        System.out.println("|       ¡Brus, Brus, Brus!        |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
        incrementarNumeroRonda();
        System.out.println("||||||||||||||Ronda #" + this.numRonda + "|||||||||||||");
        listarCategoria();
        listarPreguntaAleatoria();
        listarRespuestas();
    }

    public void salirRondaIntensional() {
        System.out.println("-----------------------------------");
        System.out.println("|       Hasta la próxima...       |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    public void finalizarJuego() {
        System.out.println("-----------------------------------");
        System.out.println("|       G A N A S T E :)          |");
        System.out.println("|       Hasta la próxima...       |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    public void terminarJuegoForzado() {
        System.out.println("-----------------------------------");
        System.out.println("|   Practica más para la próxima  |");
        System.out.println("|     Aunque perdiste tu premio   |");
        System.out.println("|            ...Ups...            |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }


}
