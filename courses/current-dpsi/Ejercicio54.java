
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio54 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        System.out.println("Diga un numero entero");
        n1 = entrada.nextInt();
        System.out.println("Diga un numero entero diferente al anterior");
        n2 = entrada.nextInt();
        if (n1 <= n2) {
            while (n1 <= n2) {
                System.out.println(n1);
                n1++;

            }
        } else {

            while (n2 <= n1) {
                System.out.println(n2);
                n2++;
            }
        }
    }
}
