
/*
    Sigamos practicando.

    ¿Que te parece hacer algo parecido con un triangulo equilatero?
*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        double base;
        double altura;
        double perimetro;
        double area;
        System.out.print("Ingresa el valor de uno de los lados :");
        base=entrada.nextDouble();
        System.out.print("Ingresa el valor de la altura :");
        altura=entrada.nextDouble();
        area= base*altura/2;
        perimetro= base*3;
        System.out.println("\n\nAREA : "+area);
        System.out.println("PERIMETRO : "+perimetro);
    }
}
