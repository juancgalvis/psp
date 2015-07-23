package psp2.utilidades;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Juan Carlos
 * @version 1.0.0
 * @description esta clase permite realizar las operaciones relacionadas con la
 * lectura y busqueda de archivos contenidos en un directorio
 */
/**
 * @methods obtenerLineasFichero
 */
public class Fichero {

    /**
     * metodo que abre y lee las lineas de un fichero
     *
     * @param nombreFichero
     * @return lista de lineas del fichero si se produce error retorna null
     */
    public static List<String> obtenerLineasFichero(String nombreFichero) {
        List<String> datos = new ArrayList<>();
        File file;
        FileReader fileReader = null;
        BufferedReader bufferedReader;
        try {
            file = new File(nombreFichero);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                datos.add(linea);
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

    public static List<File> obtenerListaFicheros(String directorio) {
        List<File> ficheros = new ArrayList<>();
        if (directorio != null) {
            File file = new File(directorio);
            if (file.isDirectory()) {
                obtenerFicherosRecursivo(ficheros, file);
            }
        }
        return ficheros;
    }

    private static void obtenerFicherosRecursivo(List<File> ficheros, File directorio) {
        for (File fichero : directorio.listFiles()) {
            if (fichero.isDirectory()) {
                obtenerFicherosRecursivo(ficheros, fichero);
            } else if (esJava(fichero)) {
                ficheros.add(fichero);
            }
        }
    }

    private static boolean esJava(File file) {
        String name = file.getName();
        try {
            return ".java".equalsIgnoreCase(name.substring(name.lastIndexOf(".")));
        } catch (Exception e) {
            return false;
        }
    }

}
