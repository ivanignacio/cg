
import java.util.Scanner;

public class Ejercicio52 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String invitado = "";
        System.out.print("Ingresa tu nombre: ");
        invitado = entrada.nextLine();
        invitado = invitado.toUpperCase();
        invitado = invitado.trim();
        switch (invitado) {
            case "SILVIO":
            case "IGNACIO":
            case "SILVIO IGNACIO":
            case "IGNACIO SILVIO":
            case "NACHO":
                System.out.println("Soltad a los perros!");
                break;
            default:

                System.out.println("Pasale carnal");
        }
    }
}
