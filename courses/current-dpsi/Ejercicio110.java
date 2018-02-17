
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio110 {

    public static void main(String[] args) {
        String[] nombres;
        Scanner entrada = new Scanner(System.in);
        nombres = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Nombre: ");
            nombres[i] = entrada.nextLine();
            System.out.println(nombres[i]);
        }

    }
}
