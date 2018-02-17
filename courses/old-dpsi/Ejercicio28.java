
/*
    Mayor de 3 números
*/
import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        System.out.println("Ingresa número entero");
        n1= teclado.nextInt();
        System.out.println("Ingresa número entero");
        n2= teclado.nextInt();
        System.out.println("Ingresa número entero");
        n3= teclado.nextInt();
        
//        if (n1 > n2) {
//            if (n1>n3) {
//                System.out.println(n1);
//            }else{
//                System.out.println(n3);
//            }
//        }else{
//            if (n2>n3) {
//                System.out.println(n2);
//            }else{
//                System.out.println(n3);
//            }
//        }

        if (n1 > n2 && n1>n3) {
            System.out.println("Numero mayor "+n1);
        }
        
        if (n2 > n1 && n2>n3) {
            System.out.println("Numero mayor "+n2);
        }
        
        if (n3 > n1 && n3>n2) {
            System.out.println("Numero mayor "+n3);
        }               
        
    }
}
