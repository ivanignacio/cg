
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio113 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";

        System.out.println("Ingrese la cadena");
        cadena = entrada.nextLine();
        int cantidad = cadena.length();
        if (cantidad >= 10 && (cadena.contains("A") || cadena.contains("E") || cadena.contains("I") || cadena.contains("O") || cadena.contains("U")) && (cadena.contains("0") || cadena.contains("1") || cadena.contains("2") || cadena.contains("3") || cadena.contains("4") || cadena.contains("5") || cadena.contains("6") || cadena.contains("7") || cadena.contains("8") || cadena.contains("9"))) {
            System.out.println("Si cumple con las caracteristicas");
        }

    }
}
