
import java.util.Scanner;
public class Ejercicio41 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int altura;
        System.out.print("Ingresa altura: ");
        altura = entrada.nextInt();
        int auxiliar = 1;
        int interno = 0;
        while (auxiliar < altura) {
            while (interno < auxiliar) {
                System.out.print("*");
                interno++;
            }
            auxiliar++;
            interno = 0;
            System.out.println("");
        }
    }
}
