
/*
    ¿Recuerdas tus clases de física?
    
    Te invito a que desarrollemos una aplicación que pueda convertir los grados centigrados a fahrenheit y kelvin.
*/

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double c;
        double f;
        double k;
        System.out.print("Ingresa grados centigrados : ");
        c=entrada.nextDouble();
        f= c*1.8+32;
        k= c+273.15;
        System.out.println("C: "+c);
        System.out.println("F: "+f);
        System.out.println("K: "+k);        
    }
}
