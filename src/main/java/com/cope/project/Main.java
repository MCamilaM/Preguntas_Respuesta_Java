package com.cope.project;

import java.io.*;
import java.io.BufferedReader;

/**
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
                switch (opcion) {
                    case 1:
                        Ronda rondas = new Ronda();
                        rondas.iniciarRonda();
                        //reader.readLine();
                        break;
                    case 2:
                        //ronda1.listarHistorico();
                        break;
                    case 3:
                        //imprimir instrucciones
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
}

