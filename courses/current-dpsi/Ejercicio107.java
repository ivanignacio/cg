
import java.util.Random;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio107 {

    public static void main(String[] args) {
        Random r1 = new Random();
        int suma = 0;
        int suma2 = 0;
        int[][] matriz;
        matriz = new int[6][6];
        System.out.println("La matriz 6x6  es:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = r1.nextInt(100) + 1;
                if (matriz[i][j] % 2 == 0) {
                    suma2++;
                } else {
                    suma++;
                }
            }

        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }

        System.out.println("El total de numeros pares en la matriz es : " + suma2);
        System.out.println("El total de numeros impares en la matriz es : " + suma);
    }
}
