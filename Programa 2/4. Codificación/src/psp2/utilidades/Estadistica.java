package psp2.utilidades;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Juan Carlos
 * @version 1.0.0
 * @description esta clase permite realizar las operaciones relacionadas con la
 * validacion, conteo de lineas y metodos de una clase
 */
/**
 * @methods obtenerLineasFichero
 */
public class Estadistica {

    /**
     * metodo que valida y cuenta las lineas de una clase
     *
     * @param datos lista de lineas de la clase
     * @return cantidad de lineas validas para ser contadas
     */
    public static int contarLineasClase(List<String> datos) {
        if (datos != null && !datos.isEmpty()) {
            int suma = 0;
            for (String dato : datos) {
                if (dato.isEmpty()) {
                    continue;
                }
                if (dato.charAt(dato.length() - 1) != '{' && dato.charAt(dato.length() - 1) != ';') {
                    continue;
                }
                suma += ocurrenciasPorLinea(";", dato);
                suma += ocurrenciasPorLinea("{", dato);
                suma += ocurrenciasPorLinea("&&", dato);
                suma += ocurrenciasPorLinea("||", dato);
            }
            return suma;
        } else {
            return 0;
        }
    }

    /**
     * metodo encargado de recorrer la lista ligada y contar los metodos para
     * ello se evalua si una linea es el encabezado de un metodo. de ser asi lo
     * cuenta
     *
     * @param datos lista de lineas de una clase
     * @return cantidad de metodos de una clase
     */
    public static int contarMetodosClase(List<String> datos) {
        if (datos != null && !datos.isEmpty()) {
            int suma = 0;
            for (String dato : datos) {
                if (dato.isEmpty()) {
                    continue;
                }
                //String re = ".*?(?:[a-z][a-z]+).*?((?:[a-z][a-z]+))(\\s+).*?(?:[a-z][a-z]+).*?((?:[a-z][a-z]+)).*?(\\s+)((?:[a-z][a-z]+))(\\(.*\\))(\\s+)(\\{)";

                String re = ".*?((?:[a-z][a-z]+)).*?(\\s+)((?:[a-z][a-z0-9_]*))(\\().*?(\\))(\\s+)(\\{)";
                Pattern p = Pattern.compile(re, Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
                Matcher m = p.matcher(dato);
                if (m.matches()) {
                    suma++;
                }
            }
            return suma;
        } else {
            return 0;
        }
    }

    /**
     * metodo encargado de contar cuantas veces se encuentra un caracter en
     * determinada linea
     *
     * @param caracter a ser buscado en la linea
     * @param linea donde sera buscado el caracter
     * @return cantidad de ocurrencias del caracter en la linea
     */
    private static int ocurrenciasPorLinea(String caracter, String linea) {
        int cantidad = 0;
        if (linea != null && caracter != null) {
            int posicion = linea.indexOf(caracter);
            while (posicion != -1) {
                cantidad++;
                posicion = linea.indexOf(caracter, posicion + 1);
            }
        }
        return cantidad;
    }

}
