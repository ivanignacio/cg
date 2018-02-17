
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double altura = 0;
        double radio = 0;
        double volumen = 0;
        System.out.print("Radio : ");
        radio = entrada.nextDouble();
        System.out.print("Altura : ");
        altura = entrada.nextDouble();
        volumen = (3.1416 * Math.pow(radio, 2)) * altura;
        System.out.println("El volumen del cilindro es igual a : " + volumen);

    }
}
