
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio43 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sen = 0;
        double grad = 45;
        sen = Math.cos(grad);
        System.out.println("El coseno  de   " + grad + "  es:  " + sen + "  grados");
    }
}
