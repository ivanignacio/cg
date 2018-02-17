
/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio66 {

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 1;
        int r = 0;
        System.out.println("La tabla de multiplicar del 7  es:");
        do {
            r = n1 * n2;
            System.out.println("( " + n2 + " x " + n1 + " ) = " + r);
            n2++;

        } while (n2 <= 10);
    }
}
