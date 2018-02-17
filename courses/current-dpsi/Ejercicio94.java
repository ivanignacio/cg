
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio94 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] calificaciones;
        double promedio = 0;
        int cantidadCalificaciones = 0;
        int suma = 0;
        System.out.println("Calificaciones que se ingresaran : ");
        cantidadCalificaciones = entrada.nextInt();
        System.out.println("Ingrese las calificaciones : ");
        calificaciones = new int[cantidadCalificaciones];
        for (int i = 0; i < cantidadCalificaciones; i++) {
            calificaciones[i] = entrada.nextInt();
        }
        System.out.println("");
        System.out.println("Las calificaiones registradas fueron:");
        for (int j = 0; j < cantidadCalificaciones; j++) {
            System.out.println(calificaciones[j]);
        }
        for (int k = 0; k < cantidadCalificaciones; k++) {
            suma = suma + calificaciones[k];
        }
        promedio = suma / cantidadCalificaciones;
        System.out.println("El promedio es igual a : " + promedio);

    }
}
