/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp1.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import psp1.utilidades.Estadistica;

/**
 *
 * @author Juan Carlos
 */
public class EstadisticaTest {

    public EstadisticaTest() {
    }

    /**
     * prueba con lista de datos null
     */
    @Test
    public void CalcularMediaTest_0() {
        assertEquals(0, Estadistica.calcularMedia(null), 0);
    }

    /**
     * prueba con lista de numeros vacia
     */
    @Test
    public void CalcularMediaTest_1() {
        List<Double> datos = new ArrayList<>();
        assertEquals(0, Estadistica.calcularMedia(datos), 0);
    }

    /**
     * prueba con dos numeros
     */
    @Test
    public void CalcularMediaTest_2() {
        List<Double> datos = new ArrayList<>();
        datos.add(10.0);
        datos.add(6.0);
        datos.add(5.0);
        datos.add(4.0);
        assertEquals(6.25, Estadistica.calcularMedia(datos), 0.01);
    }

    /**
     * prueba con mas numeros
     */
    @Test
    public void CalcularMediaTest_3() {
        List<Double> datos = new ArrayList<>();
        datos.add(10.0);
        datos.add(20.0);
        datos.add(30.0);
        datos.add(40.0);
        assertEquals(25, Estadistica.calcularMedia(datos), 0.01);
    }

    /**
     * ultima prueba con dos numeros
     */
    @Test
    public void CalcularMediaTest_4() {
        List<Double> datos = new ArrayList<>();
        datos.add(6.0);
        datos.add(5.0);
        datos.add(4.0);
        assertEquals(5.0, Estadistica.calcularMedia(datos), 0);
    }

    /**
     * prueba lista de numeros nula
     */
    @Test
    public void CalcularDesviacionEstandar_0() {
        assertEquals(0, Estadistica.calcularDesviacionEstandar(null), 0.01);
    }

    /**
     * prueba lista de numeros vacia
     */
    @Test
    public void CalcularDesviacionEstandar_1() {
        List<Double> datos = new ArrayList<>();
        assertEquals(0, Estadistica.calcularDesviacionEstandar(datos), 0.01);
    }

    /**
     * prueba con cuatro numeros
     */
    @Test
    public void CalcularDesviacionEstandar_2() {
        List<Double> datos = new ArrayList<>();
        datos.add(10.0);
        datos.add(6.0);
        datos.add(5.0);
        datos.add(4.0);
        assertEquals(2.62, Estadistica.calcularDesviacionEstandar(datos), 0.01);
    }

    /**
     * prueba con mas numeros
     */
    @Test
    public void CalcularDesviacionEstandar_3() {
        List<Double> datos = new ArrayList<>();
        datos.add(10.0);
        datos.add(20.0);
        datos.add(30.0);
        datos.add(40.0);
        assertEquals(12.9, Estadistica.calcularDesviacionEstandar(datos), 0.01);
    }

    /**
     * ultima prueba con mas numeros
     */
    @Test
    public void CalcularDesviacionEstandar_4() {
        List<Double> datos = new ArrayList<>();
        datos.add(6.0);
        datos.add(5.0);
        datos.add(4.0);
        assertEquals(1, Estadistica.calcularDesviacionEstandar(datos), 0.01);
    }

}
