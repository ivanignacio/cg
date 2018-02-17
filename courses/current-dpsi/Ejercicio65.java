
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio65 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";
        do {
            System.out.println("Escriba un nombre");
            nombre = entrada.nextLine();
        } while (!nombre.equals("Luis"));
    }
}
