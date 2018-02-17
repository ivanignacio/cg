
import javax.swing.JOptionPane;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio126 {

    public static void main(String[] args) {
        String cadena = "";
        String contenido = "";//Aquí se almacena el contenido de TODA LA TABLA
        int numero = 0;
        int resultado = 0;
        cadena = JOptionPane.showInputDialog("Ingresa un número : ");
        numero = Integer.parseInt(cadena);
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            contenido = contenido + numero + " x " + i + " = " + resultado + "\n";
        }
        JOptionPane.showMessageDialog(null, contenido);
    }
}
