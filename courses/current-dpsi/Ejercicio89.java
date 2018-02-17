
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio89 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int min = 0;
        int botellas = 0;
        System.out.println("Cuantos minutos estuvo en a ducha:");
        min = entrada.nextInt();
        botellas = min * 12;
        System.out.println("El total de botellas gastado es: " + botellas);
    }

}
