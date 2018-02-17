
/**
 *
 * @author Iván Ignacio López Ambrocio
 */
public class Ejercicio78 {

    public static void main(String[] args) {
        int n1 = 7;

        int r = 0;
        System.out.println("La tabla de multiplicar del 7  es:");
        for (int n2 = 0; n2 <= 10; n2++) {
            r = n1 * n2;
            System.out.println("( " + n2 + " x " + n1 + " ) = " + r);
        }
    }
}
