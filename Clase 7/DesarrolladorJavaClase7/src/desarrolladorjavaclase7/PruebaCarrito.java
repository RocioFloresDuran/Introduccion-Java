package desarrolladorjavaclase7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Carrito;
import modelo.Descuento;
import modelo.DescuentoFijo;
import modelo.DescuentoPorcentaje;
import modelo.DescuentoPorcentajeConTope;
import modelo.ItemCarrito;
import modelo.Producto;


public class PruebaCarrito {

    public static void main(String[] args) {
        
        // Inicialización de variables
        char tipoDescuento = 'f';
        double valorFijo = 20;
        double valorPorcentual = 0.2;
        String archivo = "C:\\Users\\rochi\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\DesarrolladorJavaClase7"
                + "\\src\\desarrolladorjavaclase7\\productos.txt";
        String codigo;
        String nombre;
        int cantidad;
        double precio;
        Carrito carrito = new Carrito(1);
        int i = 0;
        
        // Lectura de archivo y creación de objetos
        try {
            for (String linea : Files.readAllLines(Paths.get(archivo))) {

                codigo = linea.split(",")[0];
                cantidad = Integer.parseInt(linea.split(",")[1]);
                precio = Double.parseDouble(linea.split(",")[2]);
                nombre = linea.split(",")[3];
           
                Producto producto = new Producto(nombre,codigo,precio);
                ItemCarrito itemCarrito = new ItemCarrito(producto,cantidad);
                carrito.getItemsCarrito()[i] = itemCarrito;
                
                i++;
            }
        } catch (IOException ex) {
            Logger.getLogger(PruebaCarrito.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Salida
        System.out.println("Lista de Items: ");
        System.out.println("Codigo Cantidad Precio Descripcion");
        for (ItemCarrito item : carrito.getItemsCarrito()){
            System.out.print(item.getProducto().getCodigo() +"       "
                    +item.getCantidad()+"       "
                    +item.getProducto().getPrecio()+"   "
                    +item.getProducto().getNombre()+"\n");
        }

        // Ingreso por teclado del tipo de descuento
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese tipo de descuento (fijo, porcentual,"
                            + " porc c/tope o ninguno): f/p/t/n ");
        tipoDescuento = teclado.next().charAt(0);
        
        // Inicializo un descuento de cualquiera de las subclases
        // usando su constructor vacío para que el valor sea 0 por defecto
        Descuento descuento = new DescuentoFijo();

        switch (tipoDescuento){
            case 'f':
                descuento = new DescuentoFijo(valorFijo);
                System.out.println("Total con un descuento de $" + descuento.getValor() 
                + " es: $"+ carrito.calcularTotal(descuento));
                break;
            case 'p':
                descuento = new DescuentoPorcentaje(valorPorcentual);
                System.out.println("Total con un descuento del " + descuento.getValor()*100 
                + "% es: $"+ carrito.calcularTotal(descuento));
                break;
            case 't':
                DescuentoPorcentajeConTope descT = new DescuentoPorcentajeConTope(valorPorcentual,50);
                System.out.println("Total con un descuento del " + descT.getValor()*100 
                + "%(hasta $"+ descT.getTope()+") es: $"+ carrito.calcularTotal(descT));
                break;
            default:
                System.out.println("Total bruto: $" + carrito.calcularTotal(descuento));
                break;
                    
        }  
    }
}
