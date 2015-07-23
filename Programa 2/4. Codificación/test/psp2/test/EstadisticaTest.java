package psp2.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import psp2.utilidades.Estadistica;

/**
 * @author Juan Carlos
 * @version 1.0.0
 * @description esta clase se encarga de realizar las pruebas unitarias a la
 * clase Estadistica
 */
public class EstadisticaTest {

    public EstadisticaTest() {
    }

    /**
     * test con lista de lineas null
     */
    @Test
    public void ContarLineasClaseTest_0() {
        assertEquals(0, Estadistica.contarLineasClase(null));
    }

    /**
     * test con lista de lineas vacia
     */
    @Test
    public void ContarLineasClaseTest_1() {
        List<String> lineas = new ArrayList<>();
        assertEquals(0, Estadistica.contarLineasClase(lineas));
    }

    /**
     * test con una linea vacia la cual no debe contar
     */
    @Test
    public void ContarLineasClaseTest_2() {
        List<String> lineas = new ArrayList<>();
        lineas.add("package psp1.utilidades;");
        lineas.add("");
        lineas.add("import java.io.BufferedReader;");
        lineas.add("import java.io.File;");
        assertEquals(3, Estadistica.contarLineasClase(lineas));
    }

    /**
     * test con mas lineas
     */
    @Test
    public void ContarLineasClaseTest_3() {
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
        assertEquals(6, Estadistica.contarLineasClase(lineas));
    }

    /**
     * test con mas lineas
     */
    @Test
    public void ContarLineasClaseTest_4() {
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
        assertEquals(6, Estadistica.contarLineasClase(lineas));
    }

    /**
     * test con mas lineas
     */
    @Test
    public void ContarLineasClaseTest_5() {
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
        assertEquals(7, Estadistica.contarLineasClase(lineas));
    }

    /**
     * test con lista de lineas null
     */
    @Test
    public void ContarMetodosClaseTest_0() {
        assertEquals(0, Estadistica.contarMetodosClase(null));
    }

    /**
     * test con lista de lineas vacia
     */
    @Test
    public void ContarMetodosClaseTest_1() {
        List<String> lineas = new ArrayList<>();
        assertEquals(0, Estadistica.contarMetodosClase(lineas));
    }

    /**
     * test con una linea vacia la cual no debe contar
     */
    @Test
    public void ContarMetodosClaseTest_2() {
        List<String> lineas = new ArrayList<>();
        lineas.add("package psp1.utilidades;");
        lineas.add("");
        lineas.add("import java.io.BufferedReader;");
        lineas.add("import java.io.File;");
        assertEquals(0, Estadistica.contarMetodosClase(lineas));
    }

    /**
     * test con mas lineas
     */
    @Test
    public void ContarMetodosClaseTest_3() {
        List<String> lineas = new ArrayList<>();
        lineas.add("package psp1.utilidades;");
        lineas.add("");
        lineas.add("import java.io.BufferedReader;");
        lineas.add("import java.io.File;");
        lineas.add("import java.io.FileReader;");
        lineas.add("import java.util.ArrayList;");
        lineas.add("import java.util.List;");
        lineas.add("public static List<Double> leerFichero(String nombreFichero) {");
        lineas.add("    return null;");
        lineas.add("}");
        assertEquals(1, Estadistica.contarMetodosClase(lineas));
    }

    /**
     * test con mas lineas
     */
    @Test
    public void ContarMetodosClaseTest_4() {
        List<String> lineas = new ArrayList<>();
        lineas.add("package psp1.utilidades;");
        lineas.add("");
        lineas.add("import java.io.BufferedReader;");
        lineas.add("import java.io.File;");
        lineas.add("import java.io.FileReader;");
        lineas.add("import java.util.ArrayList;");
        lineas.add("import java.util.List;");
        lineas.add("");
        lineas.add("public static List<Double> leerFichero(String nombreFichero) {");
        lineas.add("    return null;");
        lineas.add("}");
        lineas.add("private String getNombre() {");
        lineas.add("    return juan;");
        lineas.add("}");
        assertEquals(2, Estadistica.contarMetodosClase(lineas));
    }

}
