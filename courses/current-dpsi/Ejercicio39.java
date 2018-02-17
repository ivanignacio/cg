
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio39 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double res1 = 0;
        double res2 = 0;
        double res3 = 0;
        double i = 0;
        double rest = 0;
        System.out.println("Cual es el valor de la primera resistencia:  ");
        res1 = entrada.nextDouble();
        System.out.println("Cual es el valor de la segunda resistencia:  ");
        res2 = entrada.nextDouble();
        System.out.println("Cual es el valor de la tercera resistencia:  ");
        res3 = entrada.nextDouble();
        rest = res1 + res2 + res3;
        System.out.println("La resistencia tota es:  " + rest);
        i = 15 / rest;
        System.out.println("La resistencia tota es:  " + i);

    }
}
