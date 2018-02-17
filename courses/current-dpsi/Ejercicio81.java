
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio81 {

    public static void main(String[] args) {
        int m = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantas filas quiere que contenga");
        m = entrada.nextInt();
        for (int n = 0; n < m; n++) {
            for (int n1 = 0; n1 < n + 1; n1++) {
                System.out.print("*");
            }
            System.out.println("");

        }

    }
}
