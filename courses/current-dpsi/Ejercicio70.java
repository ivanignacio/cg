
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio70 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n = 6;
        double suma = 0;
        double prom = 0;
        double calif = 0;
        double cont = 0;

        do {
            System.out.println("Inserte la calificacion:");
            calif = entrada.nextDouble();
            suma = suma + calif;
            cont++;

        } while (cont < 6);
        prom = suma / n;
        System.out.println("El promedio de las anteriores calificaciones es:" + prom);
        if (prom >= 90 && prom <= 100) {
            System.out.println("El promedio es  " + prom + " y su rango es = A");

        } else {
            if (prom <= 89 && prom >= 80) {
                System.out.println("El promedio es  " + prom + " y su rango es = B");
            } else {
                if (prom <= 79 && prom >= 60) {
                    System.out.println("El promedio es  " + prom + " y su rango es = C");
                } else {
                    if (prom <= 59 && prom >= 50) {
                        System.out.println("El promedio es  " + prom + " y su rango es = D");
                    } else {
                        if (prom <= 49) {
                            System.out.println("El promedio es  " + prom + " y su rango es = E");

                        }
                    }
                }
            }
        }
    }
}
