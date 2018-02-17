
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio25 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.print("Ingrese un numero entero : ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }

    }

}
