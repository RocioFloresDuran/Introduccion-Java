package desarrolladorjavaclase4;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio1b {
    
    
    public static void main(String[] args) {
        
        int x, y, z;
        char orden;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        x = teclado.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        y = teclado.nextInt();
        
        System.out.println("Ingrese el tercer número: ");
        z = teclado.nextInt();
        
        System.out.println("Orden ascendente o descendente? a/d: ");
        orden = teclado.next().charAt(0);

        int[] resultado = ordenarNumeros(x,y,z,orden);
        
        System.out.println("Los números ordenados son: " + Arrays.toString(resultado));
    }

    private static int[] ordenarNumeros(int x, int y, int z, char orden) {

        int[] numerosOrdenados = new int[3];

        switch (orden) {

            case 'a':

            //------- Caso que "x" sea el menor
                if (x <= y && x <= z) {
                    numerosOrdenados[0] = x;
                    if (y <= z) {
                        numerosOrdenados[1] = y;
                        numerosOrdenados[2] = z;
                    } else {
                        numerosOrdenados[1] = z;
                        numerosOrdenados[2] = y;
                    }
                }

            //------- Caso que "y" sea el menor
                if (y <= x && y <= z) {
                    numerosOrdenados[0] = y;
                    if (x <= z) {
                        numerosOrdenados[1] = x;
                        numerosOrdenados[2] = z;
                    } else {
                        numerosOrdenados[1] = z;
                        numerosOrdenados[2] = x;
                    }
                }

            //------- Caso que "z" sea el menor
                if (z <= x && z <= y) {
                    numerosOrdenados[0] = z;
                    if (x <= y) {
                        numerosOrdenados[1] = x;
                        numerosOrdenados[2] = y;
                    } else {
                        numerosOrdenados[1] = y;
                        numerosOrdenados[2] = x;
                    }
                }

                break;

            case 'd':

            //------- Caso que "x" sea el mayor
                if (x >= y && x >= z) {
                    numerosOrdenados[0] = x;
                    if (y >= z) {
                        numerosOrdenados[1] = y;
                        numerosOrdenados[2] = z;
                    } else {
                        numerosOrdenados[1] = z;
                        numerosOrdenados[2] = y;
                    }
                }

            //------- Caso que "y" sea el mayor
                if (y >= x && y >= z) {
                    numerosOrdenados[0] = y;
                    if (x >= z) {
                        numerosOrdenados[1] = x;
                        numerosOrdenados[2] = z;
                    } else {
                        numerosOrdenados[1] = z;
                        numerosOrdenados[2] = x;
                    }
                }

            //------- Caso que "z" sea el mayor
                if (z >= x && z >= y) {
                    numerosOrdenados[0] = z;
                    if (x >= y) {
                        numerosOrdenados[1] = x;
                        numerosOrdenados[2] = y;
                    } else {
                        numerosOrdenados[1] = y;
                        numerosOrdenados[2] = x;
                    }
                }

                break;
        }

        return numerosOrdenados;

    }
    
}
