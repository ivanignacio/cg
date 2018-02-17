
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio115 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        int n = 0;
        System.out.println("Introducir la cadea que desea analizar");
        cadena = entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < cadena.length(); j++) {
                if (cadena.charAt(i) == cadena.charAt(j)) {
                    n++;

                }

            }
            System.out.println("El caracter " + cadena.charAt(i) + " se repite " + n + " veces.");
            n = 0;

        }

    }
}
