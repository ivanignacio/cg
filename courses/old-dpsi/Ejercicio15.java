

/*
    Sigamos practicando.

    ¿Que te parece hacer algo parecido con un rectangulo?
*/

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double base;
        double altura;
        double perimetro;
        double area;
        System.out.print("Ingresa la base : ");
        base= teclado.nextDouble();
        System.out.print("Ingresa la altura : ");
        altura= teclado.nextDouble();
        perimetro=base*2+altura*2;
        area=base*altura;
        System.out.println("AREA : "+area);
        System.out.println("PERIMETRO : "+perimetro);
    }
}
