
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio34 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";

        System.out.println("Cual es su nombre:   ");
        nombre = entrada.nextLine();
        if (nombre.equals("Jose")) {
            System.out.println("Usted no es bienvenido");
        } else {
            System.out.println("Bienvenido a la fiesta");

        }

    }

}
