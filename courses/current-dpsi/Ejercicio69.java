
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio69 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calif = 0;
        double n = 0;
        double suma = 0;
        double prom = 0;
        double cont = 0;
        System.out.println("Ingrese el numero de calificaciones que desea leer: ");
        n = entrada.nextDouble();
        do {
            System.out.println("Cual es la calificacion");
            calif = entrada.nextDouble();
            suma = suma + calif;
            cont++;
        } while (cont < n);
        prom = suma / n;
        System.out.println("El promedio de las calificaciones anteriores es:" + prom);
    }
}
