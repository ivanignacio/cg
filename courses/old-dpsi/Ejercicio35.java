

import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio;
        int limite;
        System.out.print("Ingrese inicio : ");
        inicio = entrada.nextInt();
        System.out.print("Ingrese el limite : ");
        limite = entrada.nextInt();
        while(inicio <= limite){
            System.out.println(inicio);
            inicio= inicio+1;
        }    
    }
}
