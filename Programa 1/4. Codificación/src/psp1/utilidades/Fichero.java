/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp1.utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juan Carlos
 */
public class Fichero {

    /**
     * metodo que abre y lee los datos de un fichero
     * @param nombreFichero
     * @return lista de datos convertidos a double
     * si se produce error retorna null
     */
    public static List<Double> leerFichero(String nombreFichero) {
        List<Double> datos = new ArrayList<>();
        File file;
        FileReader fileReader = null;
        BufferedReader bufferedReader;
        try {
            file = new File(nombreFichero);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                datos.add(Double.parseDouble(linea));
            }
        } catch (Exception ignored) {
            return null;
        } finally {
            try {
                if (null != fileReader) {
                    fileReader.close();
                }
            } catch (Exception ignored) {
                return null;
            }
        }
        return datos;
    }

}
