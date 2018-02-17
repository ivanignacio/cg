
import java.util.Scanner;//

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double calificacion1 = 0;
        double calificacion2 = 0;
        double calificacion3 = 0;
        double calificacion4 = 0;
        double calificacion5 = 0;
        double calificacion6 = 0;
        double promedio = 0;
        System.out.print("Cual es la primera calificacion : ");
        calificacion1 = entrada.nextDouble();
        System.out.print("Cual es la segunda calificacion : ");
        calificacion2 = entrada.nextDouble();
        System.out.print("Cual es la tercera calificacion : ");
        calificacion3 = entrada.nextDouble();
        System.out.print("Cual es la cuarta calificacion : ");
        calificacion4 = entrada.nextDouble();
        System.out.print("Cual es la quinta calificacion : ");
        calificacion5 = entrada.nextDouble();
        System.out.print("Cual es la sexta calificacion : ");
        calificacion6 = entrada.nextDouble();
        promedio = (calificacion1 + calificacion2 + calificacion3 + calificacion4 + calificacion5 + calificacion6) / 6;
        System.out.println("Promedio  " + promedio);

    }

}
