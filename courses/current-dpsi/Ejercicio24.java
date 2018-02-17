
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double dolares = 0;
        double pesos = 0;
        System.out.print("Cuantos dolares tienen : ");
        dolares = entrada.nextDouble();
        pesos = dolares * 20.44;
        System.out.println(dolares + " = " + pesos + " pesos.");

    }

}
