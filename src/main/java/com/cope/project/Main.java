package com.cope.project;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Camila Morales - Josep Palomino - Sara Oquendo
 */
public class Main {

    public static void main(String[] args) {
        Ronda ronda1 = new Ronda();
        ronda1.listarPreguntaAleatoria();
        //ronda1.listarRespuestas();
        /*File archivo = new File("preguntas.txt");
        List<Pregunta> preguntas = new ArrayList<>();
        System.out.println("ssads");
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            System.out.println("ssads");

            while (lectura != null) {

                String[] cadena = lectura.split(",");
                Integer id = Integer.parseInt(cadena[2]);
                Integer idCat = Integer.parseInt(cadena[2]);
                //System.out.println(lectura);
                if(1 == id){
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

        for (Pregunta prg:
             preguntas) {
            System.out.println(prg.getPregunta());*/
        }
    }
    /*System.out.println("-----------------------------------");
    System.out.println("    ¿QUIÉRES SER MILLONARIO? ");
    System.out.println("   Llegaste al lugar indicado ");
    System.out.println("-----------------------------------");*/
