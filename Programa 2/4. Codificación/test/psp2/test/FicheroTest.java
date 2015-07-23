package psp2.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import psp2.utilidades.Fichero;

/**
 * @author Juan Carlos
 * @version 1.0.0
 * @description esta clase se encarga de realizar las pruebas unitarias a la
 * clase Fichero
 */
public class FicheroTest {

    public FicheroTest() {
    }

    /**
     * test archivo no existente
     */
    @Test
    public void leerFichero_0() {
        List<Double> lineas = null;
        assertEquals(lineas, Fichero.obtenerLineasFichero("fichero_0.java"));
    }

    /**
     * test archivo vacio
     */
    @Test
    public void leerFichero_1() {
        List<Double> lineas = new ArrayList<>();
        assertEquals(lineas, Fichero.obtenerLineasFichero("fichero_1.java"));
    }

    /**
     * test archivo con 13 lineas
     */
    @Test
    public void leerFichero_2() {
        List<String> lineas = new ArrayList<>();
        lineas.add("package psp1.utilidades;");
        lineas.add("");
        lineas.add("import java.io.BufferedReader;");
        lineas.add("import java.io.File;");
        lineas.add("import java.io.FileReader;");
        lineas.add("import java.util.ArrayList;");
        lineas.add("import java.util.List;");
        lineas.add("");
        lineas.add("/**");
        lineas.add(" *");
        lineas.add(" * @author Juan Carlos");
        lineas.add(" */");
        lineas.add("public class Fichero {");
        assertEquals(lineas, Fichero.obtenerLineasFichero("fichero_2.java"));
    }
    
    @Test
    public void obtenerListaFicheros_0(){
        List<File> ficheros = new ArrayList<>();
        assertEquals(ficheros, Fichero.obtenerListaFicheros("C:\\Users\\Juan Carlos\\Desktop\\PSP\\Programa 1\\4. Codificación12"));        
    }
    
    @Test
    public void obtenerListaFicheros_1(){
        List<File> ficheros = new ArrayList<>();
        ficheros.add(new File("utilidades\\Estadistica.java"));
        ficheros.add(new File("utilidades\\Fichero.java"));
        assertEquals(ficheros, Fichero.obtenerListaFicheros("utilidades"));        
    }
}
