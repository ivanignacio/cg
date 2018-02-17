
import java.util.Scanner;



/*

    AREA PERIMETRO Trapecio
*/

public class Ejercicio23 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area;
        double perimetro;
        double baseMayor;
        double baseMenor;
        double lateral;
        double altura;
        
        System.out.print("Ingresa base mayor: ");
        baseMayor= teclado.nextDouble();
        System.out.print("Ingresa base menor: ");
        baseMenor= teclado.nextDouble();
        System.out.print("Ingresa el valor lateral: ");
        lateral= teclado.nextDouble();
        System.out.print("Ingresa altura: ");
        altura= teclado.nextDouble();
        
        perimetro= baseMayor+lateral*2+baseMenor;
        area=((baseMayor+baseMenor)*altura)/2;
        
        System.out.println("AREA : "+area);
        System.out.println("PERIMETRO : "+perimetro);
        
    }
    
}
