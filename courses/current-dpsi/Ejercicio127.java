
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio127 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        System.out.print("Ingresa la cantidad de filas: ");
        n = entrada.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - 1); j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
