
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio120 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String c1 = "";
        String c2 = "";
        System.out.println("Cual es la cadena que se desea medir:");
        c1 = entrada.nextLine();
        for (int i = 0; i < c1.length(); i++) {
            if (c1.charAt(i) != ' ') {
                c2 = c2 + c1.charAt(i);
            }
        }
        System.out.println("El tota de caracteres en la cadena es: " + c2.length());

    }
}
