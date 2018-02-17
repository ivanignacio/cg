
import java.util.Random;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio93 {

    public static void main(String[] args) {
        Random r1 = new Random();
        int[] arreglo;

        arreglo = new int[100];
        for (int i = 0; i < 100; i++) {
            arreglo[i] = r1.nextInt(100);
        }
        System.out.println("Los numeros obtenidos fueron:");
        for (int j = 0; j < 100; j++) {
            System.out.println(arreglo[j]);
        }

    }
}
