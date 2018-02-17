
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio47 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double cuenta = 0;
        double edad = 0;
        double cuentaf = 0;
        System.out.println("Cual es la edad de cliente");
        edad = entrada.nextDouble();
        System.out.println("Cual es el total de la cuenta:  ");
        cuenta = entrada.nextDouble();
        if ((edad < 15) || (edad > 60)) {
            cuentaf = (cuenta + (cuenta * .20));
            System.out.println("La cuenta seria de:  " + cuentaf);
        } else {
            System.out.println("La cuenta seria de:  " + cuenta);
        }
    }
}
