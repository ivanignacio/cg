
/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio63 {

    public static void main(String[] args) {
        int numero = 1;
        int suma = 0;
        do {
            suma = numero + suma;
            numero++;

        } while (numero <= 100);
        System.out.println(suma);

    }
}
