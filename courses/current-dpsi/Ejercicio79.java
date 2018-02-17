
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio79 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n1 = 0;

        int r = 0;
        System.out.println("Escriba un numero del cual quiera conocer su tabla de mutiplicacion: ");
        n1 = entrada.nextInt();
        System.out.println("La tabla de multiplicar del " + n1 + " es:");
        for (int n2 = 0; n2 <= 10; n2++) {
            r = n1 * n2;
            System.out.println("( " + n2 + " x " + n1 + " ) = " + r);
        }
    }
}
