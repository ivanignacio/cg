
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado = 0;
        double baseMayor = 0;
        double baseMenor = 0;
        double altura = 0;
        double area = 0;
        double perimetro = 0;
        System.out.print("Valor del lado : ");
        lado = entrada.nextDouble();
        System.out.print("Base mayor: ");
        baseMayor = entrada.nextDouble();
        System.out.print("Base menor: ");
        baseMenor = entrada.nextDouble();
        System.out.print("Valor de la altura: ");
        altura = entrada.nextDouble();

        area = ((baseMayor + baseMenor) * altura) / 2;
        System.out.println("Area: " + area);
        perimetro = baseMayor + baseMenor + lado + lado;
        System.out.println("Perimetro: " + perimetro);

    }

}
