
import java.util.Scanner;
/*
    Mayor de edad
*/
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.print("Ingresa tu edad : ");
        edad= teclado.nextInt();        
        if (edad>=18) {
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }   
    }
}
