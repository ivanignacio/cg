
import java.util.Scanner;

public class Ejercicio53 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaOriginal = "";
        System.out.print("Nombre : ");
        cadenaOriginal = entrada.nextLine();
        int longitud = cadenaOriginal.length();
        String mayusculas = cadenaOriginal.toUpperCase();
        String minusculas = cadenaOriginal.toLowerCase();
        char primerCaracter = cadenaOriginal.charAt(0);

        System.out.println("Original : " + cadenaOriginal);
        System.out.println("Longitud : " + longitud);
        System.out.println("Mayusculas : " + mayusculas);
        System.out.println("Minusculas : " + minusculas);
    }
}
