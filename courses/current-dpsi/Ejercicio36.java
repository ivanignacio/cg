
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hra = 0;
        int min = 0;
        int seg = 0;
        System.out.println("Inserte las horas");
        hra = entrada.nextInt();
        System.out.println("Inserte los minutos");
        min = entrada.nextInt();
        System.out.println("Inserte los segundos");
        seg = entrada.nextInt();
        if ((hra <= 24) && (min <= 60) && (seg <= 60)) {
            System.out.println("La hora es valida");
        } else {
            System.out.println("La hora no es valida");
        }
    }
}
