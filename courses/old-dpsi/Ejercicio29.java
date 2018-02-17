

/*
    Mayor de 2 números (Revisar si son iguales)
 */
import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Ingresa numero entero : ");
        numero1= entrada.nextInt();
        System.out.print("Ingresa numero entero : ");
        numero2= entrada.nextInt();
        if (numero1==numero2) {
            System.out.println("NUMEROS IGUALES");
        }else{
            if (numero1>numero2) {
                System.out.println(numero1);
            }else{
                System.out.println(numero2);
            }
        }
    }
}
