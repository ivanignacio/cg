
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellidoMaterno;
        String apellidoPaterno;
        System.out.print("Cual es tu nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Apellido paterno: ");
        apellidoPaterno = entrada.nextLine();
        System.out.print("Apellido materno: ");
        apellidoMaterno = entrada.nextLine();
        System.out.println("Hola, " + nombre + " " + apellidoPaterno + " " + apellidoMaterno);

    }

}
