
import java.util.Random;
import java.awt.Toolkit;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio46 {

    public static void main(String[] args) {
        Random random = new Random();
        int peso = 0;
        int pesof = 0;
        peso = random.nextInt(680);
        pesof = peso + 20;
        System.out.println(pesof);
        if (pesof > 400) {
            System.out.println("No se puede operar el asecensor con el peso actual");
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }
}
