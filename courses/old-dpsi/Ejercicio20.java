
/*
    A Katheryn le gustaría saber cuanto tendrá que pagar por un articulo si este tiene x% de descuento.
    Lea el precio de la etiqueta.
    Ingrese cuanto tiene de descuento.
    Calcule el descuento.
    Reste el descuento del precio original.
*/

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double precioOriginal;
        double descuento;
        double precioFinal;
        System.out.print("Ingresa el precio original :");
        precioOriginal=entrada.nextDouble();
        System.out.print("Ingresa el % de descuento :");
        descuento=entrada.nextDouble();
        precioFinal=precioOriginal-(descuento*precioOriginal/100);
        System.out.println("PRECIO ORIGINAL: "+precioOriginal);
        System.out.println("PRECIO FINAL: "+precioFinal);
        
    }
}
