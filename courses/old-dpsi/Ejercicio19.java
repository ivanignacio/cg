
/*
    Calcule el promedio a partir de las 4 calificaciones obtenidas 
    
*/

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double c1;
        double c2;
        double c3;
        double c4;
        double promedio;
        System.out.print("Ingresa C1: ");
        c1= entrada.nextDouble();
        System.out.print("Ingresa C2: ");
        c2= entrada.nextDouble();
        System.out.print("Ingresa C3: ");
        c3= entrada.nextDouble();
        System.out.print("Ingresa C4: ");
        c4= entrada.nextDouble();
        promedio=(c1+c2+c3+c4)/4;
        System.out.println("PROMEDIO = "+promedio);
    }
}
