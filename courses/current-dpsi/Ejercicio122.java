
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio122 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz;
        matriz = new int[3][3];
        int turno = 0;
        int jugadorActual = 0;
        int fila = 0;
        int columna = 0;
        do {
            if (turno % 2 == 0) {
                jugadorActual = 1;
            } else {
                jugadorActual = 2;
            }
            System.out.println("Turno del jugador " + jugadorActual);
            System.out.println("Fila:");
            fila = entrada.nextInt();
            System.out.println("Columna: ");
            columna = entrada.nextInt();
            matriz[fila][columna] = jugadorActual;
            turno++;

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + "  ");
                }
                System.out.println();
            }

        } while (turno < 9);

    }
}
