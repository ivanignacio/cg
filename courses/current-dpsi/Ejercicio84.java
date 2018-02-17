
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio84 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String cara = "";
        System.out.println("Simule la cara que desee:");
        cara = entrada.nextLine();
        switch (cara) {
            case ":)":
                System.out.println("Feliz");
                break;
            case ":(":
                System.out.println("Triste");
                break;
            case ":$":
                System.out.println("Apenado");
                break;
            default:
                System.out.println("Cara no encontrada");

        }

    }
}
