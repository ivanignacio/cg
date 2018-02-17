
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio18 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado = 0;
        double volumen = 0;
        System.out.print("Cual es la longitud del lado");
        lado = entrada.nextDouble();
        volumen = lado * lado * lado;
        System.out.println("Volumen" + volumen);

    }
}
