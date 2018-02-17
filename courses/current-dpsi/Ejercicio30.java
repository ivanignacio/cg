
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio30 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora = 0;
        System.out.print("Cual es a hora");
        hora = entrada.nextInt();
        if (hora > 5 && hora < 12) {
            System.out.println("Buenos dias");

        } else {
            if (hora > 12 && hora < 19) {
                System.out.println("Buenas tardes");
            } else {
                System.out.println("Buenas noches");
            }
        }
    }
}
