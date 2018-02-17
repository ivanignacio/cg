
import java.util.Scanner;

public class Ejercicio36 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int variableControl=1;
        int resultado;

        System.out.print("Ingresa un número entero: ");
        numero = entrada.nextInt();
        while(variableControl <= 10){
           resultado= numero * variableControl;
            System.out.println(numero+" x "+variableControl+" = "+resultado);
                        variableControl++;
        }
    }
}
