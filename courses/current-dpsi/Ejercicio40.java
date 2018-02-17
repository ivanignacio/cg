
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio40 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        System.out.println("Diga un numero entero:  ");
        n1 = entrada.nextInt();
        System.out.println("Diga un numero entero:  ");
        n2 = entrada.nextInt();
        System.out.println("Diga un numero entero:  ");
        n3 = entrada.nextInt();
        if (n1 > n2 && n1 > n3) {
            System.out.println("El primer numero es el mayor");
        } else {
            if (n2 > n1 && n2 > n3) {
                System.out.println("El segundo numero es el mayor");
            } else {
                System.out.println("El tercer numero es el mayor");
            }
        }
    }
}
