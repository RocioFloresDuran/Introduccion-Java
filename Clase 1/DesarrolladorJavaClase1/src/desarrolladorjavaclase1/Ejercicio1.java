package desarrolladorjavaclase1;

public class Ejercicio1 {

    public static void main(String[] args) {

        int numeroInicio = 5;
        int numeroFin = 14;

        for (int i = numeroFin; i >= numeroInicio; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
