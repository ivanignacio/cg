
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double grados = 0;
        double farenheit = 0;
        double kelvin = 0;
        System.out.print("Grados : ");
        grados = entrada.nextDouble();
        farenheit = (1.8 * grados) + 32;
        System.out.println("Farenheit: " + farenheit);
        kelvin = grados + 273;
        System.out.println("Kelvin: " + kelvin);

    }
}
