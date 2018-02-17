
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int ancho = 0;
        int alto = 0;
        int area = 0;
        int perimetro = 0;
        System.out.print("Ancho del rectangulo: ");
        ancho = entrada.nextInt();
        System.out.print("Alto del rectangulo: ");
        alto = entrada.nextInt();
        area = ancho * alto;
        System.out.println("Area:" + area);
        perimetro = (alto * 2) + (ancho * 2);
        System.out.println("Perimetro:" + perimetro);

    }

}
