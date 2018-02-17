
import java.util.Scanner;
public class Ejercicio45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio;
        int limite;
        System.out.print("Ingresa inicio : ");
        inicio=entrada.nextInt();
        System.out.print("Ingresa limite : ");
        limite=entrada.nextInt();
        for (int i = inicio; i <= limite; i++) {
            System.out.println(i);
        }        
    }
}
