
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio109 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        System.out.println("Ingresar un nombre");
        cadena = entrada.nextLine();
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
    }
}
