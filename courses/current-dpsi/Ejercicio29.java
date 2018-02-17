
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        System.out.print("Cual es el primer numero");
        numero1 = entrada.nextDouble();
        System.out.print("Cual es el segundo numero");
        numero2 = entrada.nextDouble();
        System.out.print("Cual es el tercer numero");
        numero3 = entrada.nextDouble();
        if (numero1 > numero2 && numero1 > numero2) {
            System.out.println("El primer numero es el mayor");
        } else {
            if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("El segundo numero es mayor");
            } else {
                System.out.println("El tercer numero es mayor");
            }
        }

    }

}
