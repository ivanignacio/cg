
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio45 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double grad = 0;
        double per = 0;
        double hrs = 0;
        System.out.println("Cual  es la temperatura:  ");
        grad = entrada.nextDouble();
        System.out.println("Cual es el numero de personas: ");
        per = entrada.nextDouble();
        System.out.println("Cual es la hra exacta:  ");
        hrs = entrada.nextDouble();
        if ((grad >= 35) || (per > 15) || (hrs > 14 && hrs < 19)) {
            System.out.println("Encender el clima");
        } else {
        }
    }

}
