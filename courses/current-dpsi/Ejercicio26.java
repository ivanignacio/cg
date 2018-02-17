
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        System.out.print("Ingrese un número : ");
        numero1 = entrada.nextInt();
        System.out.print("Ingrese un número : ");
        numero2 = entrada.nextInt();
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        }
    }
}
