
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio119 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String c2 = "";
        String invertida = "";
        System.out.println("Inserte la cadena que desea invertir:");
        cadena = entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                c2 = c2 + cadena.charAt(i);
            }
        }
        for (int j = c2.length() - 1; j >= 0; j--) {
            invertida = invertida + c2.charAt(j);
        }
        System.out.println("la cadena normal es : " + cadena);
        System.out.println("la cadena invertida es : " + invertida);

    }
}
