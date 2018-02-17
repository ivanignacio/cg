
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio33 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        System.out.println("Edad : ");
        edad = entrada.nextInt();
        if (edad < 13 && edad > 0) {
            System.out.println("Niño");
        } else {
            if (edad < 21 && edad > 13) {
                System.out.println("Adolescente");
            } else {
                if (edad < 40 && edad > 18) {
                    System.out.println("Adulto");
                } else {
                    System.out.println("Adulto mayor");
                }
            }
        }
    }
}
