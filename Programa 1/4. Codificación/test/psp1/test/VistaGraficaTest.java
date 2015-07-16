/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp1.test;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import psp1.utilidades.Estadistica;
import psp1.utilidades.Fichero;

/**
 *
 * @author Juan Carlos
 */
public class VistaGraficaTest {

    public VistaGraficaTest() {
    }
    
    /**
     * test de integracion con archivo no existente o con caracteres especiales
     */
    @Test
    public void integracion_0() {
        List<Double> datos = Fichero.leerFichero("datos_0.txt");
        assertEquals(0, Estadistica.calcularMedia(datos), 0);
        assertEquals(0, Estadistica.calcularDesviacionEstandar(datos), 0);
    }

    /**
     * test de integracion con archivo vacio
     */
    @Test
    public void integracion_1() {
        List<Double> datos = Fichero.leerFichero("datos_1.txt");
        assertEquals(0, Estadistica.calcularMedia(datos), 0);
        assertEquals(0, Estadistica.calcularDesviacionEstandar(datos), 0);
    }

    /**
     * test de integracion archivo con 4 numeros
     */
    @Test
    public void integracion_2() {
        List<Double> datos = Fichero.leerFichero("datos_2.txt");
        assertEquals(6.25, Estadistica.calcularMedia(datos), 0.01);
        assertEquals(2.62, Estadistica.calcularDesviacionEstandar(datos), 0.01);
    }

    /**
     * test de integracion con otro archivo de 4 numeros
     */
    @Test
    public void integracion_3() {
        List<Double> datos = Fichero.leerFichero("datos_3.txt");
        assertEquals(25, Estadistica.calcularMedia(datos), 0.01);
        assertEquals(12.9, Estadistica.calcularDesviacionEstandar(datos), 0.01);
    }
    
    /**
     * test de integracion con archivo de 3 numeros
     */
    @Test
    public void integracion_4() {
        List<Double> datos = Fichero.leerFichero("datos_4.txt");
        assertEquals(5.0, Estadistica.calcularMedia(datos), 0);
        assertEquals(1, Estadistica.calcularDesviacionEstandar(datos), 0.01);
    }

}
