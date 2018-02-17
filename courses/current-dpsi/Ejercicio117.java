
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio117 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        int c1 = 0;

        System.out.println("Inserte la cadena que desea ser analizada:");
        cadena = entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'e' || cadena.charAt(i) == 'i' || cadena.charAt(i) == 'o' || cadena.charAt(i) == 'u') {
                c1++;
            }
        }
        System.out.println("El total de vocales en la cadena es: " + c1);

    }
}
