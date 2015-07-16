/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp1.utilidades;

import java.util.List;

/**
 *
 * @author Juan Carlos
 */
public class Estadistica {

    /**
     * metodo que calcula la media de una lista de numeros
     * @param datos lista de numeros para calcular la media
     * @return media
     */
    public static double calcularMedia(List<Double> datos) {
        if (datos != null && !datos.isEmpty()) {
            double suma = 0.0;
            for (Double dato : datos) {
                suma += dato;
            }
            return suma / datos.size();
        } else {
            return 0;
        }
    }

    /**
     * metodo que calcula la desviacion estandar de una lista de numeros
     * @param datos lista de numeros para calcular la desviacion
     * @return desviacion
     */
    public static double calcularDesviacionEstandar(List<Double> datos) {
        if (datos != null && !datos.isEmpty()) {
            double media = calcularMedia(datos);
            double suma = 0.0;
            for (Double dato : datos) {
                suma += Math.pow(dato - media, 2);
            }
            return Math.sqrt(suma / (datos.size() - 1));
        } else {
            return 0;
        }
    }
    
    
}
