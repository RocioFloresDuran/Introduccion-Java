package modelo;

import org.junit.Test;
import static org.junit.Assert.*;


public class DescuentoPorcentajeConTopeTest {
    
    public DescuentoPorcentajeConTopeTest() {
    }
    /**
     * Test of valorFinal method, of class DescuentoPorcentajeConTope.
     */
    @Test
    public void testValorFinal() {
        System.out.println("valorFinal con descuento porcentual < al tope ");
        double valorInicial = 100;
        DescuentoPorcentajeConTope instance = new DescuentoPorcentajeConTope(0.15,20);
        double expResult = 85;
        boolean result = instance.valorFinal(valorInicial) == expResult;
        assertTrue(result);
    }
    /**
     * Test of valorFinal method, of class DescuentoPorcentajeConTope.
     */
    @Test
    public void testValorFinalTope() {
        System.out.println("valorFinal con descuento porcentual == al tope ");
        double valorInicial = 100;
        DescuentoPorcentajeConTope instance = new DescuentoPorcentajeConTope(0.2,20);
        double expResult = 80;
        boolean result = instance.valorFinal(valorInicial) == expResult;
        assertTrue(result);
    }
    /**
     * Test of valorFinal method, of class DescuentoPorcentajeConTope.
     */
    @Test
    public void testValorFinalMayorTope() {
        System.out.println("valorFinal con descuento porcentual > al tope ");
        double valorInicial = 100;
        DescuentoPorcentajeConTope instance = new DescuentoPorcentajeConTope(0.3,20);
        double expResult = 80;
        boolean result = instance.valorFinal(valorInicial) == expResult;
        assertTrue(result);
    }
}
