package com.cope.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Define lo que sucederá en cada ronda, al momento de responder correctamente una pregunta, responder mal,
 * o salir del juego
 */
public class Ronda {
    private Integer numRonda;
    private Categoria categoria;
    private Pregunta pregunta;
    private Puntaje puntaje;
    private Jugador jugador;
    private AccesoDatos accesoDatos;
    private List<Respuesta> respuestas;
    Scanner capturar = new Scanner(System.in);

    /**
     * Variable de la ronda
     */
    public Ronda() {
        this.numRonda = 1;
        accesoDatos = new AccesoDatos();
        respuestas = new ArrayList<>();
        categoria = new Categoria();
        pregunta = new Pregunta();
        puntaje = new Puntaje();
        jugador = new Jugador();
    }

    /**
     *Método para comenzar una ronda que imprime mensaje, una pregunta y categoría aleatoria.
     * También aumenta las rondas
     */
    public void iniciarRonda() {
        System.out.print("Ingrese su nombre de usuario: ");
        this.jugador.setNombre(capturar.nextLine());
        System.out.println("-----------------------------------");
        System.out.println("|    ¡Listo o no, aquí vamos!     |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
        System.out.println("||||||||||||||Ronda #" + this.numRonda + "|||||||||||||");
        listarCategoria();
        listarPreguntaAleatoria();
        listarRespuestas();

    }

    /**
     *Método del jugador
     */
    public void solicitarDatosJugador() {

    }

    /**
     *Método para incrementar el puntaje según la ronda
     */
    public void incrementarPuntaje() {
        this.puntaje = this.accesoDatos.listarPuntaje("puntajes.txt", this.categoria.getIdCategoria());
    }

    /**
     *Lista las categorías de nuestro juego (dificultad)
     */
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
        this.respuestas.clear();
        this.respuestas = accesoDatos.listarRespuesta("respuestas.txt", this.pregunta.getIdPregunta());
        int opcion = 6;
        String mensaje = ">Ingrese una opción: ";
        String pregunta = "";
        do {
            int cont = 1;
            System.out.println(pregunta);
            for (Respuesta respuesta : respuestas) {
                System.out.println(cont + ". " + respuesta.getDescripcion());
                cont++;
            }
            System.out.println("5. Rendirse");
            System.out.print(mensaje);
            try {
                pregunta = this.pregunta.getPregunta();
                opcion = capturar.nextInt();
                mensaje = "Ingresa un opción valida. del 1 al 5: ";

            } catch (Exception e) {
                System.out.println(">>Debe ser un dato numérico.");
                capturar.nextLine();
                // e.printStackTrace();
            }

        } while ((opcion > 5 || opcion < 1) && opcion != 5);
        if (opcion == 5) {
            salirRondaIntensional();
            agregarHistorico();
        } else {
            validarRespuesta(opcion - 1);
        }
    }

    /**
     *Incrementa el nivel o la ronda del jugador
     */
    public void incrementarNumeroRonda() {
        this.numRonda = numRonda + 1;
    }

    private void validarRespuesta(int indiceRespuesta) {
        Respuesta respuesta = respuestas.get(indiceRespuesta);
        if (respuesta.isCorrecta() && this.numRonda == 5) {
            incrementarPuntaje();
            agregarHistorico();
            finalizarJuego(); //gana el jue
        } else if (respuesta.isCorrecta()) {
            incrementarPuntaje();
            siguienteRonda(); // pasa a la siguiente pregunta
        } else {
            terminarJuegoForzado(); // pierde y se terminar el juego
            this.puntaje.setPuntaje(0);
            agregarHistorico();
        }
    }

    /**
     *Mustra mensaje, número de ronda o nivel, carga la nueva pregunta aleatoria y las respuestas
     */
    public void siguienteRonda() {
        System.out.println("\n-----------------------------------");
        System.out.println("|       ¡Brus, Brus, Brus!        |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
        incrementarNumeroRonda();
        System.out.println("||||||||||||||Ronda #" + this.numRonda + "|||||||||||||");
        listarCategoria();
        listarPreguntaAleatoria();
        listarRespuestas();
    }

    /**
     *Método que obtiene el puntaje del jugador cuando se sale por su cuenta
     */
    public void salirRondaIntensional() {
        System.out.println("\nTu puntaje es: " + this.puntaje.getPuntaje());
        System.out.println("-----------------------------------");
        System.out.println("|       Hasta la próxima...       |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    /**
     *Método que indica el fin del juego, ya no hay más rondas
     */
    public void finalizarJuego() {
        System.out.println("\n-----------------------------------");
        System.out.println("|       G A N A S T E :)          |");
        System.out.println("|       Hasta la próxima...       |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    /**
     *Método para sacar al jugador porque respondió mal una pregunta.
     */
    public void terminarJuegoForzado() {
        System.out.println("\n-----------------------------------");
        System.out.println("|   Practica más para la próxima  |");
        System.out.println("|     Aunque perdiste tu premio   |");
        System.out.println("|            ...Ups...            |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    /**
     *Método para agregar al histórico
     */
    public void agregarHistorico() {
        String nombre = this.jugador.getNombre();
        String puntaje = String.valueOf(this.puntaje.getPuntaje());
        this.accesoDatos.escribirHistorico("historicos.txt", nombre + ": " + puntaje);
    }

    /**
     *Método para llamar y mostrar el historico del juego
     */
    public void listarHistorico() {
        List<String> historicos = this.accesoDatos.listarHistorico("historicos.txt");
        for (String historico : historicos) {
            System.out.println(historico);
        }

    }
}
