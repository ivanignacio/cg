
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio37 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso = 0;
        double estatura = 0;
        double imc = 0;
        System.out.println("Cual es el peso:    ");
        peso = entrada.nextDouble();
        System.out.println("Cual es la estatura:   ");
        estatura = entrada.nextDouble();
        imc = peso / (estatura * estatura);
        System.out.println("Su IMC es:   " + imc + "kg/m");

    }

}
