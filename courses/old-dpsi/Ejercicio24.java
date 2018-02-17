
import java.util.Scanner;

/*
    AREA PERIMETRO Circulo
*/
public class Ejercicio24 {  
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area;
        double perimetro;
        double radio;

        System.out.print("Ingresa radio: ");
        radio=teclado.nextDouble();
        
        perimetro= Math.PI*(radio*2);
        //area= Math.PI*(radio*radio);        
        area= Math.PI*(Math.pow(radio, 2));
        System.out.println("PERIMETRO: "+perimetro);
        //System.out.println("AREA: "+area);
        System.out.printf("AREA : %.2f\n",area);
    }
    
}
