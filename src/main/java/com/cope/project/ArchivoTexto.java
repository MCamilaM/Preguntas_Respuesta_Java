package com.cope.project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *Apertura del fichero y creacion de BufferedReader
 *para pode hacer una lectura comoda.
 */
public class ArchivoTexto {

    /**
     *busca y lee archivos para usarse en el acceso de datos
     * @param nombreArchivo, busca y lee archivos txt
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
                    System.out.println("Todo falló, apague y vamonos");
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
