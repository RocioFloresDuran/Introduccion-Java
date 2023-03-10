package desarrolladorjavaclase1;

import java.util.Scanner;

public class DesarrolladorJavaClase1 {

    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;
        String listar;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese P / I para listar pares o impares respectivamente: ");
        listar = teclado.next();

        switch (listar) {

            case "p":
                while (numeroInicio <= numeroFin) {
                    if (numeroInicio % 2 == 0) {
                        System.out.print(numeroInicio + " ");                
                    }
                     numeroInicio++;
                }
            case "i":
                while (numeroInicio <= numeroFin) {
                    if (numeroInicio % 2 != 0) {
                        System.out.print(numeroInicio + " "); 
                    }
                    numeroInicio++;
                }
        }
    }
}
        