
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio92 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] edades;
        double prom = 0;
        System.out.println("Inserte las calificaciones:");
        edades = new double[6];
        for (int j = 0; j < 6; j++) {
            edades[j] = entrada.nextDouble();
        }
//        edades[0]= entrada.nextDouble();
//        edades[1]= entrada.nextDouble();
//        edades[2]= entrada.nextDouble();
//        edades[3]= entrada.nextDouble();
//        edades[4]= entrada.nextDouble();
//        edades[5]= entrada.nextDouble();
        System.out.println("Las calificaciones obtenidas son: ");
//        System.out.println(edades[0]);
//        System.out.println(edades[1]);
//        System.out.println(edades[2]);
//        System.out.println(edades[3]);
//        System.out.println(edades[4]);
//        System.out.println (edades[5]);

        for (int i = 0; i < 6; i++) {
            System.out.println(edades[i]);
        }
        prom = (edades[0] + edades[1] + edades[2] + edades[3] + edades[4] + edades[5]) / 6;
        System.out.println("El promedio obteido es: " + prom);
    }
}
