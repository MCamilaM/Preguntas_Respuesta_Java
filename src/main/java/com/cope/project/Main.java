package com.cope.project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
/**
 * @Author: Camila Morales - Josep Palomino - Sara Oquendo
 */
public class Main {

    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        int opcion=0;
        while (opcion!=4){
                try {
                    System.out.println("-----------------------------------");
                    System.out.println("|    ¿QUIÉRES SER MILLONARIO?     |");
                    System.out.println("|   Llegaste al lugar indicado    |");
                    System.out.println("-----------------------------------");
                    System.out.println("|       1 - Iniciar Juego         |");
                    System.out.println("|       2 - Leaderboards          |");
                    System.out.println("|       3 - Como Jugar            |");
                    System.out.println("|       4 - Salir                 |");
                    System.out.println("-----------------------------------");
                    System.out.print("\nIngresa una opción: ");
                    opcion = Integer.parseInt(reader.readLine());
                    switch(opcion){
                        case 1:
                            Ronda ronda1 = new Ronda();
                            ronda1.listarPreguntaAleatoria();
                            ronda1.listarRespuestas();
                            break;
                        case 2:
                            //ronda1.listarHistorico();
                            break;
                        case 3:
                            //imprimir instrucciones
                            break;
                        case 4:
                            System.out.println("gracias por jugar ");
                        default:
                            System.out.println("Por favor, ingrese un dato válido.");
                            break;
                    }
                }catch(Exception e){
                    System.out.println("Por favor, ingrese un dato válido.");
                }


        }
    }
}

