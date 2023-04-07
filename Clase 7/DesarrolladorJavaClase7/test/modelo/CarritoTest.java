package modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarritoTest {
   
    Carrito carrito;
    Producto producto;
    ItemCarrito item1;
    ItemCarrito item2;
    ItemCarrito item3;
    Descuento descuento;
    
    public CarritoTest() {
    }
    
    @Before
    public void setUp() {
        carrito = new Carrito(1);
        producto = new Producto("Fideos","a",150);
        item1 = new ItemCarrito(producto, 2);
        item2 = new ItemCarrito(producto, 4);
        item3 = new ItemCarrito(producto, 1);
        descuento = new DescuentoFijo();
    }

    /**
     * Test of calcularTotal method, of class Carrito.
     */
    @Test
    public void testCalcularTotal() {
        System.out.println("calcularTotal sin descuento");
        carrito.setItemsCarrito(new ItemCarrito[]{item1,item2,item3});
        double expResult = 1050;
        boolean result = carrito.calcularTotal(descuento)== expResult;
        assertTrue(result);
    }
    
    /**
     * Test of calcularTotal method, of class Carrito.
     */
    @Test
    public void testCalcularTotalOtraCantidad() {
        System.out.println("calcularTotal con otra cantidad de productos");
        carrito.setItemsCarrito(new ItemCarrito[]{item1,item2,item2});
        double expResult = 1500;
        boolean result = carrito.calcularTotal(descuento)== expResult;
        assertTrue(result);
    }

}
