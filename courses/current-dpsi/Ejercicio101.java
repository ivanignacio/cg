
import java.util.Scanner;
import java.util.Random;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio101 {

    public static void main(String[] args) {        
        Random r1 = new Random();
        double[][] matriz;
        double suma = 0;
        matriz = new double[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {

                matriz[i][j] = r1.nextInt(6) + 5;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (j < 6) {
                    suma = suma + matriz[i][j];
                } else {
                    matriz[i][j] = suma / 6;
                }
                System.out.print(matriz[i][j] + "  ");
            }
            suma = 0;
            System.out.println();
        }
    }
}
