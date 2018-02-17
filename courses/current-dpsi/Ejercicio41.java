
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio41 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int mi = 0;
        int er = 0;
        int d = 8;
        int l = 0;
        int ju = 0;

        System.out.println("La edad de Donato es :  " + d + "añoss");
        l = d;
        System.out.println("La edad de Luis es :  " + l + "añoss");
        er = d - 2;
        System.out.println("La edad de Erick es :  " + er + "añoss");
        mi = 2 * er;
        System.out.println("La edad de Miguel es :  " + mi + "añoss");
        ju = d + l + mi + er;
        System.out.println("Por lo tanto la edad de Juan es :  " + ju + "añoss");

    }
}
