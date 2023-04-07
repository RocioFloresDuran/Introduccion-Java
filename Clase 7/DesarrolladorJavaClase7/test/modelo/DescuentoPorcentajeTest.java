package modelo;

import org.junit.Test;
import static org.junit.Assert.*;


public class DescuentoPorcentajeTest {
    
    public DescuentoPorcentajeTest() {
    }

    /**
     * Test of valorFinal method, of class DescuentoPorcentaje.
     */
    @Test
    public void testValorFinal() {
        System.out.println("valorFinal con DescuentoPorcentaje");
        double valorInicial = 100;
        DescuentoPorcentaje instance = new DescuentoPorcentaje(0.15);
        double expResult = 85;
        boolean result = instance.valorFinal(valorInicial) == expResult;
        assertTrue(result);
    }
    
    /**
     * Test of valorFinal method, of class DescuentoPorcentaje.
     */
    @Test
    public void testValorFinalDescuentoNulo() {
        System.out.println("valorFinal con DescuentoPorcentaje vacío");
        double valorInicial = 100;
        DescuentoPorcentaje instance = new DescuentoPorcentaje();
        double expResult = 100;
        boolean result = instance.valorFinal(valorInicial) == expResult;
        assertTrue(result);
    }
    
}
