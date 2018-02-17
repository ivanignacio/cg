
import java.util.Scanner;

/**
 *
 * @author Iván Ignacio López Ambrocio
 */
public class Ejercicio28 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        System.out.print("Cual es el primer numero : ");
        numero1 = entrada.nextDouble();
        System.out.print("Cual es el segundo numero : ");
        numero2 = entrada.nextDouble();
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        } else {
            if (numero1 < numero2) {
                System.out.println("El segundo numero es mayor");
            } else {
                System.out.println("El primer numero es mayor");
            }
        }

    }
}
