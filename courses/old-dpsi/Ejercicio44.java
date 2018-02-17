
//Importar a Scanner para poder leer datos
import java.util.Scanner;
public class Ejercicio44 {
    public static void main(String[] args) {
        //Creación de un objeto de tipo Scanner
        Scanner entrada = new Scanner(System.in);
        //Variable donde almacenar el número que voy a leer
        int numero;
        
        int resultado;
        //Mensaje para el usuario
        System.out.print("Ingresa un número: ");
        //Lectura de número
        numero= entrada.nextInt();
        
        //Ciclo for
        for (int i = 1; i <= 10; i++) {
            
        resultado=numero*i;
        System.out.println(numero+" * "+i+" = "+resultado);
        }
    }
}
