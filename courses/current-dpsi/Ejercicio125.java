
import javax.swing.JOptionPane;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio125 {

    public static void main(String[] args) {
        //Valores a recuperar de forma gráfica.
        String cadena1 = "";
        String cadena2 = "";

        //Variables para almacenar las cadenas convertidas en enteros
        int numero1 = 0;
        int numero2 = 0;

        int suma = 0;

        //Lectura de datos por separado
        cadena1 = JOptionPane.showInputDialog("Ingresa un número entero: ");
        cadena2 = JOptionPane.showInputDialog("Ingresa un número entero: ");

        //Conversión de cadenas a enteros
        numero1 = Integer.parseInt(cadena1);
        numero2 = Integer.parseInt(cadena2);

        //Suma de enteros
        suma = numero1 + numero2;

        //Mostrar el resultado en una ventana.
        JOptionPane.showMessageDialog(null, "El resultado es " + suma);

    }
}
