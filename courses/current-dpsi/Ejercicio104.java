
import java.util.Random;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio104 {

    public static void main(String[] args) {
        Random r1 = new Random();
        int determinante = 0;
        int matriz[][];
        matriz = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matriz[i][j] = r1.nextInt(31) - 10;
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
