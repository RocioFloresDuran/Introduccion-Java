package desarrolladorjavaclase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Ejercicio3 {

    public static void main(String[] args) throws IOException {

        String entrada = "C:\\Users\\rochi\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\DesarrolladorJavaClase4"
                + "\\src\\desarrolladorjavaclase4\\entradaEj3.txt";

        String salida = "C:\\Users\\rochi\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\DesarrolladorJavaClase4"
                + "\\src\\desarrolladorjavaclase4\\salidaEj3.txt";

        String traduccion = "";
        String opcion = "codificar";
        int desplazamiento = 2;

        if (opcion.equals("codificar")) {
            for (String linea : Files.readAllLines(Paths.get(entrada))) {
                traduccion += codificar(linea, desplazamiento) + "\n";
            }
        }
        
        if (opcion.equals("decodificar")) {
            for (String linea : Files.readAllLines(Paths.get(entrada))) {
                traduccion += decodificar(linea, desplazamiento) + "\n";
            }
        }

        Files.write((Paths.get(salida)), traduccion.getBytes());
        System.out.println("La traducción fue realizada correctamente. "
                + "\nEl resultado se encuentra en el archivo de salida");
    }

    private static String codificar(String texto, int desplazamiento) {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
        char[] textoCodificado = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) { // Recorro el texto original
            for (int j = 0; j < abecedario.length(); j++) { // Recorro el abecedario

                if (texto.charAt(i) == abecedario.charAt(j)) { // Si coinciden ambos caracteres
                    if (j + desplazamiento >= abecedario.length()) { // Si el índice excede la longitud
                        textoCodificado[i] = abecedario.charAt(j + desplazamiento - abecedario.length());
                    } else {
                        textoCodificado[i] = abecedario.charAt(j + desplazamiento);
                    }
                }
            }
        }
        return String.valueOf(textoCodificado);
    }

    private static String decodificar(String texto, int desplazamiento) {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz ";
        char[] textoDecodificado = new char[texto.length()];

        for (int i = 0; i < texto.length(); i++) { // Recorro el texto codificado
            for (int j = 0; j < abecedario.length(); j++) { // Recorro el abecedario

                if (texto.charAt(i) == abecedario.charAt(j)) { // Si coinciden ambos caracteres
                    if (j - desplazamiento < 0) { // Si el índice es negativo
                        textoDecodificado[i] = abecedario.charAt(j - desplazamiento + abecedario.length());
                    } else {
                        textoDecodificado[i] = abecedario.charAt(j - desplazamiento);
                    }
                }
            }
        }
        return String.valueOf(textoDecodificado);
    }
}
