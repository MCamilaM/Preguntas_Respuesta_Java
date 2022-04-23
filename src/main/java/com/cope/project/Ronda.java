package com.cope.project;

import java.util.List;

public class Ronda {
    private Integer numRonda;
    private Categoria categoria;
    private Pregunta pregunta;
    private Puntaje puntaje;
    private Jugador jugador;
    private AccesoDatos accesoDatos;

    public Ronda() {
        this.numRonda = 2;
        accesoDatos = new AccesoDatos();
    }

    public Ronda(Integer numRonda,Categoria categoria,Pregunta pregunta,Puntaje puntaje,Jugador jugador) {
        this.numRonda=numRonda;
        this.categoria=categoria;
        this.pregunta=pregunta;
        this.puntaje=puntaje;
        this.jugador=jugador;
        accesoDatos = new AccesoDatos();
    }

    public void iniciarRonda(){
        System.out.println("-----------------------------------");
        System.out.println("|    ¡Listo o no, aquí vamos!     |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    public void salirRonda(){
        System.out.println("-----------------------------------");
        System.out.println("|   Practica más para la próxima  |");
        System.out.println("|   un  Aunque perdiste tu premio   |");
        System.out.println("|            ...Ups...            |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    public void siguienteRonda(){
        System.out.println("-----------------------------------");
        System.out.println("|       ¡Brus, Brus, Brus!        |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
        this.numRonda++;
    }

    public void finalizarJuego(){
        System.out.println("-----------------------------------");
        System.out.println("|       Hasta la próxima...       |");
        System.out.println("-----------------------------------");
        System.out.println(" ");
    }

    public void listarPreguntaAleatoria(){
        List<Pregunta> preguntas = accesoDatos.listarPreguntas("preguntas.txt",this.numRonda);
        double numAleatorio = Math.random()*4+1;
        this.pregunta = preguntas.get((int) numAleatorio);
        System.out.println(this.pregunta.getPregunta());
    }

    public void listarRespuestas(){
        List<Respuesta> respuestas = accesoDatos.listarRespuesta("respuestas.txt", 1);
        int cont = 1;
        for (Respuesta rpta: respuestas) {
            System.out.println(cont+". "+rpta.getDescripcion());
            cont++;
        }
    }


}
