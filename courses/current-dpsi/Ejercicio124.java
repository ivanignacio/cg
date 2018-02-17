
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio124 {

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

            /*
            Determinar si el espacio a modificar se encuentra vacio.
            En caso de que sea un 0, COLOCAR AL JUGADOR QUE TIRA
             */
            if (matriz[fila][columna] == 0) {
                matriz[fila][columna] = jugadorActual;//Coloca el valor sobre el tablero
            } else {
                turno--;
            }

            turno++;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + "  ");
                }
                System.out.println();
            }

//Determinar si algún jugador ganó.
            //Horizontales
            if (matriz[0][0] == jugadorActual && matriz[0][1] == jugadorActual && matriz[0][2] == jugadorActual) {
                break;
            }
        } while (turno < 9);
        System.out.println("El ganador fue el jugador : " + jugadorActual);

    }
}
