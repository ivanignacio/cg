
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cantidad1 = 0;
        double cantidad2 = 0;
        System.out.print("Km/h : ");
        cantidad1 = entrada.nextDouble();
        cantidad2 = cantidad1 / 3.6;
        System.out.println(cantidad2 + " m/s");

    }

}
