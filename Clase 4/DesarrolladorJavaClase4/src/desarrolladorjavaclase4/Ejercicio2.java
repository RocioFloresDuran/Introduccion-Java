package desarrolladorjavaclase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ejercicio2 {

    public static void main(String[] args) {

        String archivo = "C:\\Users\\rochi\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\DesarrolladorJavaClase4"
                + "\\src\\desarrolladorjavaclase4\\archivoEj2.txt";
        int suma = 0;
        int producto = 1;
        boolean multiplicacion = true;

        try {
            if (multiplicacion) {
                for (String linea : Files.readAllLines(Paths.get(archivo))) {
                    System.out.print(linea + " ");
                    producto = producto * Integer.parseInt(linea);
                }
                System.out.println("\nEl producto de los valores es: " + producto);
            } else {
                for (String linea : Files.readAllLines(Paths.get(archivo))) {
                    System.out.print(linea + " ");
                    suma = suma + Integer.parseInt(linea);
                }
                System.out.println("\nLa suma de los valores es: " + suma);
            }
        } catch (IOException ex) {
            Logger.getLogger(Ejercicio2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
