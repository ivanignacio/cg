
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio112 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String email = "";
        System.out.println("Escriba la direccion de correo : ");
        email = entrada.nextLine();
        if (email.endsWith(".com") && email.contains("@")) {
            System.out.println("Es un email");

        }

    }
}
