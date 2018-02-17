
import java.util.Random;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio111 {

    public static void main(String[] args) {
        int suma = 0;
        int suma2 = 0;
        int suma3 = 0;
        int suma4 = 0;
        int suma5 = 0;

        Random entrada = new Random();
        String[] nombres;
        nombres = new String[]{"Sebastian", "Laura", "Pablo", "Juan", "Luis"};
        String[] nmbs;
        nmbs = new String[50];
        for (int i = 0; i < 50; i++) {
            nmbs[i] = nombres[entrada.nextInt(5)];
            System.out.println(nmbs[i]);
        }
        for (int i = 0; i < 50; i++) {
            if (nmbs[i].equals("Sebastian")) {
                suma++;
            }
            if (nmbs[i].equals("Laura")) {
                suma2++;
            }
            if (nmbs[i].equals("Pablo")) {
                suma3++;
            }
            if (nmbs[i].equals("Juan")) {
                suma4++;
            }
            if (nmbs[i].equals("Luis")) {
                suma5++;
            }
        }
        System.out.println("El nombre Sebastian fue repetido " + suma + " veces.");
        System.out.println("El nombre Laura fue repetido " + suma2 + " veces.");
        System.out.println("El nombre Pablo fue repetido " + suma3 + " veces.");
        System.out.println("El nombre Juan fue repetido " + suma4 + " veces.");
        System.out.println("El nombre Luis fue repetido " + suma5 + " veces.");
    }
}
