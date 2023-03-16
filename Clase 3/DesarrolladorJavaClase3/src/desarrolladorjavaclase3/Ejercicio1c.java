package desarrolladorjavaclase3;


public class Ejercicio1c {

    public static void main(String[] args) {

        int[] vector = new int[]{1, 10, 2, 9, 3, 8, 4, 7, 5, 6};
        int x = 5;
        int sumaMayoresX = 0;
        
        System.out.print("Los valores mayores a " + x + " son: ");

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > x) {
                System.out.print(vector[i] + " ");
                sumaMayoresX = sumaMayoresX + vector[i];
            }
        }

        System.out.println("\nLa suma de ellos es: -- " + sumaMayoresX + " --");

    }

}
