
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio114 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";

        System.out.println("Inserte la cadena que desea analizar: ");
        cadena = entrada.nextLine();
        String c1 = "";
        String c2 = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                c1 = c1 + cadena.charAt(i);
            }
        }
        for (int i = c1.length() - 1; i >= 0; i--) {
            c2 = c2 + c1.charAt(i);
        }
        System.out.println("La cadena original es: " + cadena);
        System.out.println("Cadena sin espacio es: " + c1);
        System.out.println("La cadena invertida es: " + c2);
        for (int i = 0; i < c1.length(); i++) {
            if (c1.charAt(i) == c2.charAt(i)) {

            }
            System.out.println("Esta cadena es un palindromo");
        }

    }

}
