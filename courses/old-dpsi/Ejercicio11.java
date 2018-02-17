
/*
    Realicemos mas pruebas. Tratemos ahora con la lectura de números enteros.

    Notarás que existen mas métodos a parte de .next()

    Cuando leemos valores de tipo entero (int) utilizamos .nextInt()
*/

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
       
        Scanner dato = new Scanner(System.in);
        int edad; // Declaración de variable que recibirá el valor ingresado por el usuario.
        System.out.print("Ingresa tu edad: ");
        
        //Recuerda que nextInt() nos permite leer valores de tipo int
        edad=dato.nextInt(); 
        System.out.println("Tu edad es "+edad+" años");
    }
}
