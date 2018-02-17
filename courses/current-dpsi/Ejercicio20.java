
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pi = 3.1416;
        double radio = 0;
        double volumen = 0;
        System.out.print("Radio de la esfera : ");
        radio = entrada.nextDouble();
        volumen = 4 / 3 * pi * Math.pow(radio, 3);
        System.out.println("El volumen de la esfera es igual a : " + volumen);

    }
}
