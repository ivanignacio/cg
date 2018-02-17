

/*
    
    Despeje el valor de tiempo considerando que v=d/t

    v= velocidad
    d= distancia
    t= tiempo

    Leer el valor de velocidad y distancia para calcular tiempo.
*/


import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double velocidad;
        double distancia;
        double tiempo;
        System.out.print("Ingrese velocidad en Km/h :");
        velocidad= entrada.nextDouble();
        System.out.print("Ingrese distancia en Km :");
        distancia= entrada.nextDouble();
        tiempo=distancia/velocidad;
        System.out.println("TIEMPO ESTIMADO DE LLEGADA : "+tiempo);
    }
}
