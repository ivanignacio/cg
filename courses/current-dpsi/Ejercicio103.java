
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio103 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte los numeros que sean de 5 - 10");
        int matriz[][];
        int determinante = 0;
        matriz = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        System.out.println("La determinante es : " + determinante);

    }
}
