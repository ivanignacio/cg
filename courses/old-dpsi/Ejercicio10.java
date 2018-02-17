


/*
    En las aplicaciones que desarrollemos es importante involucrar al usuario final de la aplicación.
    Para poder introducir valores a nuestra aplicación en Java es necesario llamar código previamente programado
    por alguien mas.

    NOTA  En el código ejemplo de abajo verifique que existe     import java.util.Scanner;
    NOTA  En el código ejemplo de abajo verifique que existe     Scanner teclado = new Scanner(System.in);
       
    Estas 2 líneas permiten invocar a la funcionalidad de lectura que Java tiene para nosotros.

    Una vez escritas esas dos líneas podemos invocar al método .next(); 
    el cual tomará la siguiente cadena que se encuentre en el buffer de lectura del sistema.
   
*/

import java.util.Scanner;   //No olvides escribir esta línea de código cuando tu aplicación lea valores.

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in); //No olvides esta línea de código tampoco.
        
        //Es importante hacerle saber al usuario que es lo que esperamos que ingrese.
        //A través de un mensaje le diremos al usuario que necesitamos que ingrese.
        System.out.print("Ingresa tu nombre : ");
        
        //Declaración de una variable llamada nombre que recibirá el valor que se lea del teclado.
        String nombre=teclado.next(); 
        
        //Impresión del valor leido.
        System.out.println("El nombre leido fue : "+nombre);
    }
}
