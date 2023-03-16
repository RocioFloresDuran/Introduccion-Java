
package desarrolladorjavaclase3;


public class Ejercicio1a {

    public static void main(String[] args) {

        String texto = "Otorrinolaringólogo";
        char letra = 'o';
        int resultado = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                resultado++;
            }
        }

        System.out.println("La cantidad de ocurrencias de la letra *" + letra 
                            + " en --" + texto + "-- es de: " + resultado);

    }

}
