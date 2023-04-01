package desarrolladorjavaclase6;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
      /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double unNumero = 80;
        double otroNumero = 3;
        double expResult = 240;
        double result = Calculadora.multiplicar(unNumero, otroNumero);
        boolean resultado = result == expResult;
        assertTrue(resultado);
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumarDividir() {
        System.out.println("sumar y luego dividir");
        double unNumero = 150;
        double otroNumero = 180;
        double expResult = 110;
        double result = Calculadora.dividir(Calculadora.sumar(unNumero, otroNumero),3);
        boolean resultado = result == expResult;
        assertTrue(resultado);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestarMultiplicar() {
        System.out.println("restar y luego multiplicar");
        double unNumero = 90;
        double otroNumero = 50;
        double expResult = 605;
        double result = Calculadora.multiplicar(Calculadora.restar(unNumero, otroNumero),15);
        boolean resultado = result == expResult;
        assertFalse(resultado);
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumarMultiplicar() {
        System.out.println("sumar y luego multiplicar");
        double unNumero = 70;
        double otroNumero = 40;
        double expResult = 2700;
        double result = Calculadora.multiplicar(Calculadora.sumar(unNumero, otroNumero),25);
        boolean resultado = result == expResult;
        assertFalse(resultado);
    }
    
}
