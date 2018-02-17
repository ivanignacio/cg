

import java.util.Scanner;
public class Ejercicio49 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int cantidadCalificaciones;
        System.out.print("¿Cuantas materias llevas? : ");
        cantidadCalificaciones=entrada.nextInt();
        int[] calificaciones;
        calificaciones= new int[cantidadCalificaciones];
        double promedio=0;
        int sumaTotal=0;
        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.print("Ingresa calificacion: ");
            calificaciones[i]=entrada.nextInt();
            sumaTotal= sumaTotal+calificaciones[i];
        }
        promedio= sumaTotal/ cantidadCalificaciones;
        System.out.println("PROMEDIO : "+promedio);
        if(promedio==10){
            System.out.println("¡Excelente, sigue así!");
        }
        if(promedio>=7 && promedio<10){
            System.out.println("¡Bien!");
        }
        if (promedio<7) {
            System.out.println("¡Animo!");
        }
    }
}
