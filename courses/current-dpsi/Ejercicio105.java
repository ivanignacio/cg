
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio105 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los números de la matriz [3 x 3]");

        int matriz[][];
        int determinante = 0;
        matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingresa un número : ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        determinante = (matriz[0][0] * ((matriz[1][1] * matriz[2][2]) - (matriz[2][1] * matriz[1][2]))) - (matriz[0][1] * ((matriz[1][0] * matriz[2][2]) - (matriz[2][0] * matriz[1][2]))) + (matriz[0][2] * ((matriz[1][0] * matriz[2][1]) - (matriz[2][0] * matriz[1][1])));
        System.out.println("La determianante es: " + determinante);
    }
}
