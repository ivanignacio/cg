
import java.util.Random;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio99 {

    public static void main(String[] args) {
        Random r1 = new Random();
        int[][] matriz;
        matriz = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matriz[i][j] = r1.nextInt(10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
