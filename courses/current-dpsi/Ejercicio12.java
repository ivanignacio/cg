
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n = 0;
        double lado = 0;
        double a = 0;
        double apotema = 0;
        double perimetro = 0;
        double area = 0;
        System.out.print("Numero de lados : ");
        n = entrada.nextDouble();
        System.out.print("Cuanto mide cada lado");
        lado = entrada.nextDouble();

        a = 360 / (2 * n);
        apotema = (lado / 2) * Math.tan(a);
        area = (n * lado * apotema) / 2;
        System.out.println("El area es igua a: " + area);
        perimetro = lado * n;
        System.out.println("El perimetro es igual a:" + perimetro);

    }

}
