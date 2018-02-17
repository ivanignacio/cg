
import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args){
        Scanner dato = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1.- 1 Jugador");
            System.out.println("2.- 2 Jugadores");
            System.out.println("3.- Configuración");
            System.out.println("4.- Salir");
            System.out.print("Opcion : ");
            opcion= dato.nextInt();
        }while(opcion!=4);        
    }
}
