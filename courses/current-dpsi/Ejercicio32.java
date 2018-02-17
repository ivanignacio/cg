
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Diga un numero entero del 1 al 7");
        numero = entrada.nextInt();
        if (numero == 1) {
            System.out.println("Lunes");

        } else {
            if (numero == 2) {
                System.out.println("Martes");
            } else {
                if (numero == 3) {
                    System.out.println("Miercoles");
                } else {
                    if (numero == 4) {
                        System.out.println("Jueves");
                    } else {
                        if (numero == 5) {
                            System.out.println("Viernes");
                        } else {
                            if (numero == 6) {
                                System.out.println("Sabado");
                            } else {
                                System.out.println("Domingo");
                            }
                        }
                    }
                }
            }
        }
    }
}
