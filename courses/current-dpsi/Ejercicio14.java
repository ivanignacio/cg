
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double velocidad = 0;
        double tiempo = 0;
        double distancia = 0;
        System.out.print("Velocidad : ");
        velocidad = entrada.nextDouble();
        System.out.print("Distancia : ");
        distancia = entrada.nextDouble();
        tiempo = distancia / velocidad;
        System.out.println("Valor del tiempo : " + tiempo);
        System.out.println("Valor de la distancia : " + distancia);
        System.out.println("Valor de la velocidad : " + velocidad);

    }

}
