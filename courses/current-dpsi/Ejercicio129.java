
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @email ignacio.93@hotmail.com
 */
public class Ejercicio129 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = entrada.next();
        int resultado = Integer.parseInt(cadena, 2);
        System.out.println(resultado);
    }
}
