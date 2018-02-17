
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio57 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int v = 0;
        int n = 1;
        int r = 0;
        System.out.println("Diga un numero entero:  ");
        v = entrada.nextInt();

        while (n <= 10) {
            r = v * n;
            System.out.println("(" + v + "*" + n + ") = " + r);
            n++;
        }
    }
}
