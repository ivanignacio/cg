
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double radio = 0;
        double area = 0;
        double perimetro = 0;
        System.out.print("Ingrese el radio del circulo : ");
        radio = entrada.nextDouble();
        perimetro = (2 * 3.1416) * radio;
        area = 3.1416 * (radio * radio);
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}
