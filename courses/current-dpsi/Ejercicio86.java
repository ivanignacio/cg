
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio86 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre = "";

        do {
            System.out.println("Inserte el nombre del invitado: ");
            nombre = entrada.nextLine();
            switch (nombre) {
                case "Adriana":
                    System.out.println("Bienvenida, amiga favorita");
                    break;
                case "Mariana":
                    System.out.println("Bienvenida, amiga favorita");
                    break;
                case "Katheryn":
                    System.out.println("Bienvenida, amiga favorita");
                    break;
                case "Anna":
                    System.out.println("Bienvenida, amiga favorita");
                    break;
                case "Yazmin":
                    System.out.println("Bienvenida, amiga favorita");
                    break;
                case " Alan":
                    System.out.println("Bienvenido, amigo favorito");
                    break;
                case "Luis":
                    System.out.println("Bienvenido, amigo favorito");
                    break;
                case "Victor":
                    System.out.println("Bienvenido, amigo favorito");
                    break;
                case "Angel":
                    System.out.println("Bienvenido, amigo favorito");
                    break;
                case "Roberto":
                    System.out.println("Bienvenido, amigo favorito");
                    break;
                case " Fabricio":
                    System.out.println("Bienvenido, amigo favorito");
                    break;
                case "Julio":
                    System.out.println("Bienvenido, amigo favorito");
                    break;
                default:
                    System.out.println("Bienvenido " + nombre);

            }
        } while (!nombre.equals("-1"));
    }

}
