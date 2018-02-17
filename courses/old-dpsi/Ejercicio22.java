
/*
    -Indice de masa corporal

    Imc= p/t^2
*/

/**
 * @author ivanignacio
 */
import java .util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double imc;
        double peso;
        double talla;
                
        System.out.print("Ingrese peso en Kg : ");
        peso= teclado.nextDouble();
        
        System.out.print("Ingresa talla(altura) en Mts : ");
        talla= teclado.nextDouble();
        
        imc= peso/(talla*talla);
        System.out.println("IMC : "+imc);
        
    }
}
