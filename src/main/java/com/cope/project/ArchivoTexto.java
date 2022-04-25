package com.cope.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *Apertura del fichero y creacion de BufferedReader
 *para pode hacer una lectura comoda (disponer del metodo readLine()).
 */
public class ArchivoTexto {

    /**
     *
     * @param nombreArchivo
     */
    public void leerArchivo(String nombreArchivo) {
        try {
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;
            try {

                archivo = new File(nombreArchivo);
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                String linea;
                while ((linea = br.readLine()) != null)
                    System.out.println(linea);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    System.out.println("Todo fallo, apague y vamonos");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
