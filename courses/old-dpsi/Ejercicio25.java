/*
    Calcular peso de un objeto cuya masa es 100 Kg.
    Expresar el resultado en Newtons
*/
/**
 * @author ivanignacio
 */
import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double peso;
        double masa;
        System.out.print("Ingresa masa (Kg) : ");
        masa= teclado.nextDouble();
        peso= masa*9.81;
        System.out.println("PESO : "+peso+" NEWTONS.");
    }
}
