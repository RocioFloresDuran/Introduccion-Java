package desarrolladorjavaclase3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1b {

    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = 5;
        int[] resultado = new int[3];
        String desc;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ordenar los valores en forma descendente? y/n ");
        desc = teclado.next();

        switch (desc) {

            case "n":
                
//------- Caso que "a" sea el menor
                if (a <= b && a <= c) {
                    resultado[0] = a;
                    if (b <= c) {
                        resultado[1] = b;
                        resultado[2] = c;
                    } else {
                        resultado[1] = c;
                        resultado[2] = b;
                    }
                }

//------- Caso que "b" sea el menor
                if (b <= a && b <= c) {
                    resultado[0] = b;
                    if (a <= c) {
                        resultado[1] = a;
                        resultado[2] = c;
                    } else {
                        resultado[1] = c;
                        resultado[2] = a;
                    }
                }

//------- Caso que "c" sea el menor
                if (c <= a && c <= b) {
                    resultado[0] = c;
                    if (a <= b) {
                        resultado[1] = a;
                        resultado[2] = b;
                    } else {
                        resultado[1] = b;
                        resultado[2] = a;
                    }
                }

                break;

            case "y":
                
//------- Caso que "a" sea el mayor
                if (a >= b && a >= c) {
                    resultado[0] = a;
                    if (b >= c) {
                        resultado[1] = b;
                        resultado[2] = c;
                    } else {
                        resultado[1] = c;
                        resultado[2] = b;
                    }
                }

//------- Caso que "b" sea el mayor
                if (b >= a && b >= c) {
                    resultado[0] = b;
                    if (a >= c) {
                        resultado[1] = a;
                        resultado[2] = c;
                    } else {
                        resultado[1] = c;
                        resultado[2] = a;
                    }
                }

//------- Caso que "c" sea el mayor
                if (c >= a && c >= b) {
                    resultado[0] = c;
                    if (a >= b) {
                        resultado[1] = a;
                        resultado[2] = b;
                    } else {
                        resultado[1] = b;
                        resultado[2] = a;
                    }
                }

                break;
        }
        System.out.println("Array ordenado: " + Arrays.toString(resultado));

    }
}
