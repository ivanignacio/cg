
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio102 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadAlumnos = 0;
        int[][] matriz;
        System.out.println("Cantidad de estudiantes : ");
        cantidadAlumnos = entrada.nextInt();
        matriz = new int[cantidadAlumnos][6];
        System.out.println("Ingrese las calificaciones de los alumnos:");
        for (int i = 0; i < cantidadAlumnos; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < cantidadAlumnos; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
