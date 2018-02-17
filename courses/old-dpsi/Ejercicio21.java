
/*
    Convertir dolares a pesos.
*/

import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args){
        double dolares;
        double pesos;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Ingrese la cantida de dolares : ");
        dolares=teclado.nextDouble();
        pesos=dolares*18.91;
        System.out.println("Los dolares en pesos son : "+pesos+" pesos:");
    }
}
