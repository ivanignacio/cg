
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio67 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        int n2 = 1;
        int r = 0;
        System.out.println("Inserte un numero para conocer su tabla de multiplicar: ");
        n1 = entrada.nextInt();
        System.out.println("La tabla de multiplicar del " + n1 + "es:");
        do {
            r = n1 * n2;
            System.out.println("( " + n2 + " x " + n1 + " ) = " + r);
            n2++;

        } while (n2 <= 10);
    }
}
