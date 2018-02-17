
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio38 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double kg = 0;
        double nw = 0;
        System.out.println("Cual es la cantidad de kilogramos:  ");
        kg = entrada.nextDouble();
        nw = kg * 9.81;
        System.out.println("Su equivalencia en Newtons es: " + nw);

    }
}
