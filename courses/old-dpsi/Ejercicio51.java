
import java.util.Scanner;

public class Ejercicio51 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia = 0;
        System.out.print("Ingresa dia de la semana 1-7 : ");
        dia = entrada.nextInt();
        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Día de trabajo");
                break;
            case 6:
            case 7:
                System.out.println("Fin de semana");
                break;
            default:
                System.out.println("Deje de estar inventando dias");
                break;
        }
    }
}
