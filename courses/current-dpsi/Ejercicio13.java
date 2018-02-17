
import java.util.Scanner; //

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioOriginal = 0;
        double descuento = 0;
        double precioFinal = 0;
        System.out.print("Precio de la prenda : ");
        precioOriginal = entrada.nextDouble();
        descuento = precioOriginal * .25;
        System.out.println("Descuento: " + descuento);
        precioFinal = precioOriginal - descuento;
        System.out.println("Precio final : " + precioFinal);

    }

}
