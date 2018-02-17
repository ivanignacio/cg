
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double resultado = 0;
        System.out.print("Ingresa un número :");
        numero1 = entrada.nextDouble();
        System.out.print("Ingresa un número :");
        numero2 = entrada.nextDouble();
        System.out.print("Ingresa un número :");
        numero3 = entrada.nextDouble();
        resultado = numero1 * numero2 * numero3;
        System.out.println("El resultado es : " + resultado);
    }

}
