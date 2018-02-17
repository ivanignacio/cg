

/*
    Ingresar 2 números y determinar cual es el mayor.

    NOTA: No olvide importar a la clase Scanner y crear el objeto correspondiente.

    import java.util.Scanner;

    Scanner entrada = new Scanner(System.in);
 */
import java.util.Scanner;

public class Ejercicio26 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Declaración de 2 variables para almacenar los números a evaluar.
        int numero1;
        int numero2;
        
        //Lectura del primer número
        System.out.print("Ingresa número entero: ");
        numero1 = entrada.nextInt();

        //Lectura del segundo número
        System.out.print("Ingresa número entero: ");
        numero2 = entrada.nextInt();

        
        //Aquí determinamos si el primer número leido es mayor al segundo.
        if (numero1 > numero2) {
            
            System.out.println(numero1);
        }else{
            System.out.println(numero2);
        }        
    }
}
