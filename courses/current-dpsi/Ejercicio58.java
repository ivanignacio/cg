
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio58 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 1;
        while (n <= 3) {
            System.out.println("1.-\t1 player\n2.-\t2players\n3.-\tSettings\n4.-\tExit");
            System.out.println("Escoja una accion");
            n = entrada.nextInt();

        }
    }
}
