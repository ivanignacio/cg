
import java.util.Random;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio108 {

    public static void main(String[] args) {
        Random entrada = new Random();
        int determinante = 0;
        int matriz[][];
        matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = entrada.nextInt(2) + 1;

            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
        if (matriz[0][0] == matriz[0][1] && matriz[0][2] == matriz[0][0]) {
            System.out.println("3 en raya");
            System.exit(0);
        }
        if (matriz[0][0] == matriz[1][1] && matriz[2][2] == matriz[1][1]) {
            System.out.println("3 en raya");
            System.exit(0);
        }
        if (matriz[1][0] == matriz[1][1] && matriz[1][2] == matriz[1][1]) {
            System.out.println("3 en raya");
            System.exit(0);
        }
        if (matriz[2][1] == matriz[2][2] && matriz[2][2] == matriz[2][0]) {
            System.out.println("3 en raya");
            System.exit(0);
        }
        if (matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1]) {
            System.out.println("3 en raya");
            System.exit(0);
        }
        if (matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0]) {
            System.out.println("3 en raya");
            System.exit(0);
        }
        if (matriz[0][2] == matriz[1][2] && matriz[2][2] == matriz[0][2]) {
            System.out.println("3 en raya");
            System.exit(0);
        } else {
            System.out.println("Gato");
        }

    }
}
