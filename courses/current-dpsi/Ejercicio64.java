
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio64 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("Inserte un numero entero:");
        n1 = entrada.nextInt();
        System.out.println("Inserte un numero entero diferente al anterior:");
        n2 = entrada.nextInt();
        System.out.println("la numeracion de uno al otro es: ");

        if (n1 <= n2) {
            do {
                System.out.println(n1);
                n1++;
            } while (n1 <= n2);
        } else {
            do {
                System.out.println(n2);
                n2++;
            } while (n2 <= n1);
        }
    }

}
