
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio77 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (String nombre = ""; !nombre.equals("Adriana"); nombre = entrada.nextLine()) {
            System.out.println("Escriba un nombre");
        }
    }
}
