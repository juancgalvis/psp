package psp2.test;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import psp2.utilidades.Estadistica;
import psp2.utilidades.Fichero;

/**
 * @author Juan Carlos
 * @version 1.0.0
 * @description esta clase se encarga de realizar las pruebas unitarias de
 * integracion a las clases Fichero y Estadistica
 */
public class VistaGraficaTest {

    public VistaGraficaTest() {
    }

    /**
     * test de integracion con archivo no existente o con todas sus lineas no
     * validas
     */
    @Test
    public void integracion_0() {
        List<String> datos = Fichero.obtenerLineasFichero("fichero_0.java");
        assertEquals(0, Estadistica.contarLineasClase(datos));
    }

    /**
     * test de integracion con archivo vacio
     */
    @Test
    public void integracion_1() {
        List<String> datos = Fichero.obtenerLineasFichero("fichero_1.java");
        assertEquals(0, Estadistica.contarLineasClase(datos));
    }

    /**
     * test de integracion archivo con 7 lineas validas
     */
    @Test
    public void integracion_2() {
        List<String> datos = Fichero.obtenerLineasFichero("fichero_2.java");
        assertEquals(7, Estadistica.contarLineasClase(datos));
    }

    /**
     * test de integracion con otro archivo de 22 lineas validas
     */
    @Test
    public void integracion_3() {
        List<String> datos = Fichero.obtenerLineasFichero("Estadistica.java");
        assertEquals(22, Estadistica.contarLineasClase(datos));
    }

    /**
     * test de integracion con archivo de 28 lineas validas
     */
    @Test
    public void integracion_4() {
        List<String> datos = Fichero.obtenerLineasFichero("Fichero.java");
        assertEquals(28, Estadistica.contarLineasClase(datos));
    }

    /**
     * test de integracion con archivo de 1 metodo
     */
    @Test
    public void integracion_5() {
        List<String> datos = Fichero.obtenerLineasFichero("Fichero.java");
        assertEquals(1, Estadistica.contarMetodosClase(datos));
    }

    /**
     * test de integracion con otro archivo de 2 metodos
     */
    @Test
    public void integracion_6() {
        List<String> datos = Fichero.obtenerLineasFichero("Estadistica.java");
        assertEquals(2, Estadistica.contarMetodosClase(datos));
    }
    
    /**
     * test de integracion con otro archivo de 58 lineas
     */
    @Test
    public void integracion_7() {
        List<String> datos = Fichero.obtenerLineasFichero("EstadisticaTest.java");
        assertEquals(58, Estadistica.contarLineasClase(datos));
    }
    
    /**
     * test de integracion con otro archivo de 11 metodos
     */
    @Test
    public void integracion_8() {
        List<String> datos = Fichero.obtenerLineasFichero("EstadisticaTest.java");
        assertEquals(11, Estadistica.contarMetodosClase(datos));
    }
    
    /**
     * test de integracion con otro archivo de  metodos
     */
    @Test
    public void integracion_9() {
        List<String> datos = Fichero.obtenerLineasFichero("FicheroTest.java");
        assertEquals(6, Estadistica.contarMetodosClase(datos));
    }
}
