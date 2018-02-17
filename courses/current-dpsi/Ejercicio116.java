
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio116 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        String cadena1 = "";
        System.out.println("Introduzca la cadena que desea modificar: ");
        cadena = entrada.nextLine();
        cadena1 = cadena.replace('a', '4');
        cadena = cadena1;
        cadena1 = cadena.replace('e', '3');
        cadena = cadena1;
        cadena1 = cadena.replace('i', '1');
        cadena = cadena1;
        cadena1 = cadena.replace('o', '0');
        cadena = cadena1;
        cadena1 = cadena.replace('u', '2');
        System.out.println("La cadena modificada seria: " + cadena1);

    }
}
