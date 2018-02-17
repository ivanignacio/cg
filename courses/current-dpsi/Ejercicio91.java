
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio91 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] edades;
        edades = new int[3];
        System.out.println("Las calificaciones obtenidas son :");
        edades[0] = entrada.nextInt();
        edades[1] = entrada.nextInt();
        edades[2] = entrada.nextInt();
        System.out.println(edades[0]);
        System.out.println(edades[1]);
        System.out.println(edades[2]);
    }

}
