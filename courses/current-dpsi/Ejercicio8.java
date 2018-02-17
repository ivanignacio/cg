
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int base = 0;
        int altura = 0;
        int area = 0;
        int perimetro = 0;

        System.out.print("Base: ");
        base = entrada.nextInt();
        System.out.print("Altura: ");
        altura = entrada.nextInt();
        area = (base * altura) / 2;
        System.out.println("Area: " + area);
        perimetro = base * 3;
        System.out.println("Perimetro: " + perimetro);

    }

}
