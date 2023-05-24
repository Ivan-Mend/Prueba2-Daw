/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import matricad.Matricad;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumno
 */
public class MatricadNGTest {

    public MatricadNGTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    public void Matricad(String[] dada) {
        System.out.println("Matricad");
        String unaCadena = null;
        Matricad instance = new Matricad(dada);
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(result, expResult);
    }

    public void Matricad2(String[] dada) {
        System.out.println("Matricad");
        String[] prueba = {};
        String unaCadena[] = prueba;
        Matricad instance = new Matricad(dada);
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(result, expResult);
    }

    public void Matricad3(String[] dada) {
        System.out.println("Matricad");
        String[] prueba = {"hola", "que", "tal", "cómo", "estás", "hola"};
        String unaCadena[] = prueba;
        Matricad instance = new Matricad(dada);
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(result, expResult);
    }

    public void getCantidadCadenasQueEmpiezanCon(char letra) {
        System.out.println("Matricad");
        Matricad instance = new Matricad(letra);
        int expResult = 0;
        int result = instance.getCantidadCadenasQueEmpiezanCon(letra);
        assertEquals(result, expResult);
    }
}
