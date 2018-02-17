
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio35 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double art1 = 0;
        double art2 = 0;
        double art3 = 0;
        double suma = 0;
        double descuento1 = 0;
        double descuento2 = 0;
        System.out.println("Cual es el precio de primer articulo:  ");
        art1 = entrada.nextDouble();
        System.out.println("Cual es el precio del segundo articulo:  ");
        art2 = entrada.nextDouble();
        System.out.println("Cual es el precio del tercer articulo:  ");
        art3 = entrada.nextDouble();
        suma = art1 + art2 + art3;
        System.out.println("La suma de los articulos es:  " + suma);
        if (suma < 2000) {
            descuento1 = suma - (suma * .05);

            System.out.println("Precio final:   " + descuento1);
        } else {
            descuento2 = suma - (suma * .30);
            System.out.println("Precio final:   " + descuento2);
        }
    }
}
