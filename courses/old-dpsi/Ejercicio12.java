/*
    Realicemos mas pruebas. 
    ¿Qué hay acerca de los números reales?
*/

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa tu peso : ");
        double peso=teclado.nextDouble(); //El método nextDouble(); nos permite leer el siguiente número real que hayamos escrito.
        System.out.println("Peso registrado: "+peso+" Kg.");
    }
}
