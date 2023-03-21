package desarrolladorjavaclase4;

import java.util.Arrays;

public class Ejercicio1a {

    public static void main(String[] args) {

        int[] resultado = ordenarNumeros(8, 12, 10, 'a');
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
