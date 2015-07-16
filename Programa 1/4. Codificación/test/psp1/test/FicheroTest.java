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
import psp1.utilidades.Fichero;

/**
 *
 * @author Juan Carlos
 */
public class FicheroTest {

    public FicheroTest() {
    }

    /**
     * test archivo con errores o no existente
     */
    @Test
    public void leerFichero_0() {
        List<Double> datos = null;
        assertEquals(datos, Fichero.leerFichero("datos_0.txt"));
    }

    /**
     * test archivo vacio
     */
    @Test
    public void leerFichero_1() {
        List<Double> datos = new ArrayList<>();
        assertEquals(datos, Fichero.leerFichero("datos_1.txt"));
    }

    /**
     * test archivo con 4 numeros
     */
    @Test
    public void leerFichero_2() {
        List<Double> datos = new ArrayList<>();
        datos.add(10.0);
        datos.add(6.0);
        datos.add(5.0);
        datos.add(4.0);
        assertEquals(datos, Fichero.leerFichero("datos_2.txt"));
    }

    /**
     * otro test con 4 numeros
     */
    @Test
    public void leerFichero_3() {
        List<Double> datos = new ArrayList<>();
        datos.add(10.0);
        datos.add(20.0);
        datos.add(30.0);
        datos.add(40.0);
        assertEquals(datos, Fichero.leerFichero("datos_3.txt"));
    }
    
    /**
     * test con 3 numeros
     */
    @Test
    public void leerFichero_4() {
        List<Double> datos = new ArrayList<>();
        datos.add(6.0);
        datos.add(5.0);
        datos.add(4.0);
        assertEquals(datos, Fichero.leerFichero("datos_4.txt"));
    }

}
