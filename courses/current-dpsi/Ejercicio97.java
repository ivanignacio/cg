
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio97 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] cal;
        int temporal = 0;

        System.out.println("Inserte 10 calificaciones");
        cal = new int[10];
        for (int i = 0; i < 10; i++) {
            cal[i] = entrada.nextInt();
        }
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                if (cal[i] > cal[j]) {
                    temporal = cal[i];
                    cal[i] = cal[j];
                    cal[j] = temporal;
                }
            }

        }
        for (int k = 0; k < 10; k++) {
            System.out.print(cal[k] + " ");
        }
    }

}
