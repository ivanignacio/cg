

/*
    En un circuito electrico que se encuentre en serie la resistencia total es igual a la suma de las resistencias existentes.
    Lea 4 resistencias de un circuito serie y calcule la resistencia total.
    Lea el Voltaje Total del circuito.
    Despeje Intensidad Total considerando que V= R*I

    V= Voltaje
    R= Resistencia
    I= Intensidad
    
*/
import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double vt; //VOLTAJE TOTAL
        double r1;
        double r2;
        double r3;
        double r4;
        double rt;//RESISTENCIA TOTAL
        double it;//INTENSIDAD TOTAL
        System.out.print("Ingresa Voltaje Total: ");
        vt=entrada.nextDouble();
        System.out.print("R1: ");
        r1=entrada.nextDouble();
        System.out.print("R2: ");
        r2=entrada.nextDouble();
        System.out.print("R3: ");
        r3=entrada.nextDouble();
        System.out.print("R4: ");
        r4=entrada.nextDouble();
        rt=r1+r2+r3+r4;
        it=vt/rt; //Intensidad= Voltaje/ Resistencia
        System.out.println("VT= "+vt);
        System.out.println("RT= "+rt);
        System.out.println("IT= "+it);
        
    }
}
