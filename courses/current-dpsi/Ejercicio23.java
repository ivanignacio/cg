
import java.util.Scanner; //

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a = 0;
        double b = 0;
        double c = 0;
        double x1 = 0;
        double x2 = 0;
        System.out.print("Cual es e valor de a : ");
        a = entrada.nextDouble();
        System.out.print("Cual es e valor de b : ");
        b = entrada.nextDouble();
        System.out.print("Cual es e valor de c : ");
        c = entrada.nextDouble();
        x1 = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        System.out.println("x1 :  " + x1);
        x2 = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        System.out.println("x2 :  " + x2);

    }
}
