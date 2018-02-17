
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio76 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("Escriba un numero entero: ");
        n1 = entrada.nextInt();
        System.out.println("Escriba un numero entero diferente a anterior: ");
        n2 = entrada.nextInt();
        if (n1 <= n2) {
            for (int n3 = n1; n3 <= n2; n3++) {
                System.out.println(n3);

            }
        } else {
            for (int n3 = n1; n3 >= n2; n3--) {
                System.out.println(n3);
            }
        }
    }
}
