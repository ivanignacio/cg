
/*
    Estamos listos para algo un poco mas complicado.
    ¿Qué te parece hacer una aplicación que calcule el área y perimetro de un cuadrado?

    Nota:   No olvides importar a la clase Scanner
    Nota:   No olvides crear al objeto que te permitirá leer cosas desde el teclado.
    Nota:   No olvides llamar al método apropiado para leer los valores de entrada.
*/

import java.util.Scanner; //Esta línea importa la clase Scanner

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);   //Esta línea crea el objeto que se encarga de leer los valores.
        
        //Aquí definimos las variables que utilizaremos en nuestra aplicación
        double lado=0;
        double area=0;
        double perimetro=0;
        
        //Imprimimos un mensaje indicando de que trata la aplicación
        System.out.println("\t AREA - PERIMETRO - CUADRADO\n\n");
        
        //Imprimimos un mensaje indicando que necesitamos el valor de uno de los lados.
        System.out.print("Ingresa uno de los lados del cuadrado :");
        
        //Lectura de uno de los lados a través del método nextDouble()
        lado=teclado.nextDouble();
        
        //Calculo del perimetro
        perimetro=lado*4;
        
        //Otra forma de calcular el perimetro podría ser
        //perimetro=lado+lado+lado+lado;
        
        //Calculo del área 
        area=lado*lado;
        
        //Impresión de los valores.
        System.out.println("AREA : "+area);
        System.out.println("PERIMETRO : "+perimetro);
        
    }
}
