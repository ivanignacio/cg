
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio96 {

    public static void main(String[] args) {

        //Variables
        Scanner entrada = new Scanner(System.in);
        int[] calificaciones;
        double promedio = 0;
        int cantidadCalificaciones = 0;
        int suma = 0;
        int contador = 0;

        //Lectura principal de cantidad de calificaciones
        System.out.println("Cuantas es el numero de calificaciones que se ingresaran: ");
        cantidadCalificaciones = entrada.nextInt();

        //Creación de arreglo con la cantidad de calificaciones
        calificaciones = new int[cantidadCalificaciones];

        //Lectura de calificaciones
        System.out.println("Ingese las calificaciones:");
        for (int i = 0; i < cantidadCalificaciones; i++) {
            calificaciones[i] = entrada.nextInt();//Lee la calificación
            System.out.println(calificaciones[i]);//Impresión de la calificación
            suma = suma + calificaciones[i];//Acumulador de suma de calificaciones
        }
        promedio = suma / cantidadCalificaciones;
        System.out.println("El promedio es igua a " + promedio);

        //Verificación individual de cada promedio es mayor al promedio general
        for (int i = 0; i < cantidadCalificaciones; i++) {

            //Si el valor a evaluar es mayor al promedio general se toma en consideración
            if (calificaciones[i] > promedio) {
                contador++;
            }
        }
        System.out.println("El numero de alumnos sobre el promedio es:" + contador);
    }
}
