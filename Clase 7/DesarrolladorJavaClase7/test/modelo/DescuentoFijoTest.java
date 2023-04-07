package modelo;

import org.junit.Test;
import static org.junit.Assert.*;


public class DescuentoFijoTest {
    
    public DescuentoFijoTest() {
    }

    /**
     * Test of valorFinal method, of class DescuentoFijo.
     */
    @Test
    public void testValorFinal() {
        System.out.println("valorFinal con DescuentoFijo");
        double valorInicial = 100;
        DescuentoFijo instance = new DescuentoFijo(20);
        double expResult = 80;
        boolean result = instance.valorFinal(valorInicial) == expResult;
        assertTrue(result);
    }
    
    /**
     * Test of valorFinal method, of class DescuentoFijo.
     */
    @Test
    public void testValorFinalDescuentoNulo() {
        System.out.println("valorFinal con DescuentoFijo vacío");
        double valorInicial = 100;
        DescuentoFijo instance = new DescuentoFijo();
        double expResult = 100;
        boolean result = instance.valorFinal(valorInicial) == expResult;
        assertTrue(result);
    }
    
}
