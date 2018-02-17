
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio87 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        System.out.println("Cual es el cateto opuesto: ");
        a = entrada.nextDouble();
        System.out.println("Cual es el cateto adyacente: ");
        b = entrada.nextDouble();
        c = Math.sqrt((a * a) + (b * b));
        System.out.println("La hipotenusa es igual a  " + c);
        System.out.println("El cateto opuesto es igual a  " + a);
        System.out.println("El cateto adyacente es igual a  " + b);
    }
}
