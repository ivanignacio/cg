
/*
    Fórmula general de la ecuación cuadrática
 */
import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a;
        double b;
        double c;
        double x1;
        double x2;
        
        System.out.println("Ingresa a: ");
        a= entrada.nextDouble();
        
        System.out.println("Ingresa b: ");
        b= entrada.nextDouble();
        
        System.out.println("Ingresa c: ");
        c= entrada.nextDouble();
        
        x1=(b*(-1)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        x2=(b*(-1)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        
        System.out.println("x1= "+x1);
        System.out.println("x2= "+x2);
    }
}
