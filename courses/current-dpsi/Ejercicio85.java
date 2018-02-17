
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio85 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n = 6;
        double prom = 0;
        double suma = 0;
        double cont = 0;
        double calif = 0;
        int promedio = 0;
        double decimal = 0;
        do {
            System.out.println("Inserte la calificacion:");
            calif = entrada.nextDouble();
            suma = suma + calif;
            cont++;

        } while (cont < 6);
        prom = suma / n;
        System.out.println("El promedio de las anteriores calificaciones es:" + prom);
        promedio = (int) prom;

        switch (promedio) {
            case 5:
                System.out.println("5 = Reprobado");
                break;
            case 6:
                System.out.println("6 = Puedes mejorar");
                break;
            case 7:
                System.out.println("7 = Regular ");
                break;
            case 8:
                System.out.println("8 = Bien");
                break;
            case 9:
                System.out.println("9 = Muy bien");
                break;
            case 10:
                System.out.println("10 = Excelente");
            default:
                System.out.println("Promedio no existe");

        }
    }
}
