
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio90 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filas = 0;
        System.out.println("Cual es el numero de filas que desea");
        filas = entrada.nextInt();

        for (int n = 0; n < filas; n++) {

            for (int n1 = filas; n1 > n + 1; n1--) {
                System.out.print(" ");
            }
            for (int n2 = 0; n2 <= n + 1; n2++) {
                System.out.print("#");

            }
            System.out.println("");

        }
    }
}
