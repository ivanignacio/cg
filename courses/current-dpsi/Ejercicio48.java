
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio48 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Diga un numero entero");
        numero = entrada.nextInt();
        if (numero % 10 == 0) {
            System.out.println("El numero es multiplo de  10");
        } else {
            System.out.println("El numero no es multiplo de 10");
        }

    }
}
