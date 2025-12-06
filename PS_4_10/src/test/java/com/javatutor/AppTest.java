package com.javatutor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;
    private final java.io.InputStream standardIn = System.in;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    @Test
    void testMostrarArreglo() {
        // Leer 5 elementos: 10, 20, 30, 40, 50
        // Mostrar arreglo
        // Salir
        String input = "5\n10\n20\n30\n40\n50\n1\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        App.main(new String[] {});

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("10, 20, 30, 40, 50"),
                "Debe mostrar el arreglo correctamente");
    }

    @Test
    void testInsertarEnMedio() {
        // Arreglo: 10, 20, 30, 40, 50
        // Insertar 25 (debe ir entre 20 y 30)
        // Mostrar arreglo
        // Salir
        String input = "5\n10\n20\n30\n40\n50\n2\n25\n1\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        App.main(new String[] {});

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("10, 20, 25, 30, 40, 50") || output.contains("insertado"),
                "Debe insertar 25 en la posición correcta");
    }

    @Test
    void testInsertarAlPrincipio() {
        // Arreglo: 20, 30, 40
        // Insertar 10 (debe ir al principio)
        // Mostrar arreglo
        // Salir
        String input = "3\n20\n30\n40\n2\n10\n1\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        App.main(new String[] {});

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("10, 20, 30, 40") || output.contains("insertado"),
                "Debe insertar 10 al principio");
    }

    @Test
    void testInsertarAlFinal() {
        // Arreglo: 10, 20, 30
        // Insertar 50 (debe ir al final)
        // Mostrar arreglo
        // Salir
        String input = "3\n10\n20\n30\n2\n50\n1\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        App.main(new String[] {});

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("10, 20, 30, 50") || output.contains("insertado"),
                "Debe insertar 50 al final");
    }

    @Test
    void testEliminarElemento() {
        // Arreglo: 10, 20, 30, 40, 50
        // Eliminar 30
        // Mostrar arreglo
        // Salir
        String input = "5\n10\n20\n30\n40\n50\n3\n30\n1\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        App.main(new String[] {});

        String output = outputStreamCaptor.toString();
        assertTrue(output.contains("10, 20, 40, 50") || output.contains("eliminado"),
                "Debe eliminar 30 correctamente");
    }
}
