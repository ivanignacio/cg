
import java.util.Random;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio95 {

    public static void main(String[] args) {
        Random r1 = new Random();
        int[] calificaciones;

        System.out.println("Las calificaciones  registradas son:");
        calificaciones = new int[100];

        for (int i = 0; i < 100; i++) {
            calificaciones[i] = r1.nextInt(6) + 5;

            System.out.println(calificaciones[i]);

        }
        int[] arre;
        arre = new int[6];
        for (int i = 0; i < 100; i++) {
            if (calificaciones[i] == 5) {
                arre[0]++;
            }
            if (calificaciones[i] == 6) {
                arre[1]++;
            }
            if (calificaciones[i] == 7) {
                arre[2]++;

            }
            if (calificaciones[i] == 8) {
                arre[3]++;
            }
            if (calificaciones[i] == 9) {
                arre[4]++;
            }
            if (calificaciones[i] == 10) {
                arre[5]++;
            }
        }
        System.out.println("Para el numero 5 son " + arre[0] + "  repeticiones");
        System.out.println("Para el numero 6 son " + arre[1] + "  repeticiones");
        System.out.println("Para el numero 7 son " + arre[2] + "  repeticiones");
        System.out.println("Para el numero 8 son " + arre[3] + "  repeticiones");
        System.out.println("Para el numero 9 son " + arre[4] + "  repeticiones");
        System.out.println("Para el numero 10 son " + arre[5] + "  repeticiones");
    }
}
