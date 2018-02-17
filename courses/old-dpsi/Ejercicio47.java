


import java.util.Scanner;
public class Ejercicio47 {
    public static void main(String[] args){
     Scanner entrada= new Scanner(System.in);
     double calificacion=0;
     double promedio;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Cal: ");
            calificacion+= entrada.nextDouble();
//calificacion= calificacion+entrada.nextDouble();
        }
        promedio=calificacion/5;
        System.out.println("Promedio "+promedio);
    }
}
