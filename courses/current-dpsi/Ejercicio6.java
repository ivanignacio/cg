
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado = 0;
        int area = 0;
        int perimetro = 0;
        System.out.print("Lado : ");
        lado = entrada.nextInt();
        area = lado * lado;
        System.out.println("El área del cuadrado es : " + area);
        perimetro = lado * 4;
        System.out.println("Perimetro del cuadrado : " + perimetro);

    }

}
