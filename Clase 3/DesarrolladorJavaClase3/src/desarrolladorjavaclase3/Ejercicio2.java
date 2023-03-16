package desarrolladorjavaclase3;


public class Ejercicio2 {

    public static void main(String[] args) {

        String texto = "hola que tal";
        int desplazamiento = 2;
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
        System.out.println("Texto original: " + texto);
        System.out.println("El texto codificado con un desplazamiento de " + desplazamiento 
                            + " es: " + String.valueOf(textoCodificado));
    } 
}
