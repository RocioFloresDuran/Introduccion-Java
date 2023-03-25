package desarrolladorjavaclase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Carrito;
import modelo.ItemCarrito;
import modelo.Producto;


public class PruebaCarrito {

    public static void main(String[] args) {
        
        String archivo = "C:\\Users\\rochi\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\DesarrolladorJavaClase5"
                + "\\src\\desarrolladorjavaclase5\\productos.txt";
        
        String codigo;
        String nombre;
        int cantidad;
        double precio;
        Carrito carrito = new Carrito(1);
        int i = 0;
        
        
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
        
        System.out.println("Lista de Items: ");
        System.out.println("Codigo Cantidad Precio Descripcion");
        for (ItemCarrito item : carrito.getItemsCarrito()){
            System.out.print(item.getProducto().getCodigo() +"       "
                    +item.getCantidad()+"       "
                    +item.getProducto().getPrecio()+"   "
                    +item.getProducto().getNombre()+"\n");
        }
        System.out.println("Total: " + carrito.calcularTotal());
        
    }
    
}
