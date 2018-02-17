
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado = 0;
        double diagonalMayor = 0;
        double diagonalMenor = 0;
        double area = 0;
        double perimetro = 0;
        System.out.print("Lado de un rombo : ");
        lado = entrada.nextDouble();
        System.out.print("Diagonal mayor: ");
        diagonalMayor = entrada.nextDouble();
        System.out.print("Diagonal menor: ");
        diagonalMenor = entrada.nextDouble();
        perimetro = lado * 4;
        System.out.println("Perimetro : " + perimetro);
        area = (diagonalMenor * diagonalMayor) / 2;
        System.out.println("Area : " + area);

    }

}
