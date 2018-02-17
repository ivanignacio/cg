
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        int resultado = 0;
        System.out.print("Ingresa un número entero:");
        numero1 = entrada.nextInt();
        System.out.print("Ingresa un número entero:");
        numero2 = entrada.nextInt();
        resultado = numero1 + numero2;
        System.out.println("La suma de ambos numeros es: " + resultado);
    }

}
