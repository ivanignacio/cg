
import java.util.Scanner;

public class Ejercicio56 {
    public static void main(String[] args) {
        
        //Variables
        int turno=0;
        int jugadorActual=0;
        int[][] tablero= new int[3][3];
        Scanner entrada = new Scanner(System.in);
        int fila=0;
        int columna=0;
        int ganador=0;
        
        do{
            //Determinar a quien le toca tirar
            if (turno%2==0) {
                jugadorActual=1;
            }else{
                jugadorActual=2;
            }
            System.out.println("Turno del jugador "+jugadorActual);
            System.out.print("Fila: ");
            fila= entrada.nextInt();
            System.out.print("Columna: ");
            columna= entrada.nextInt();
            if (tablero[fila][columna]==0) {
                tablero[fila][columna]= jugadorActual;
            }else{
                turno--;
                System.out.println("OCUPADO, TIRE DE NUEVO");                
            }
            turno++;
            //Impresión de la matriz
         
            //FOR encargado de controlar las filas
            for(int i=0; i < 3 ; i ++){
                
                //FOR encargado de controlar las columnas
                for(int j=0; j <3; j++){
                    System.out.print(tablero[i][j]+"\t");
                }
                System.out.println("");
            }
            
            //Verificación del ganador :D 
            if (tablero[0][0]== jugadorActual &&
                tablero[0][1]== jugadorActual &&
                tablero[0][2]== jugadorActual) {
                ganador= jugadorActual;
            }
            
            if (tablero[1][0]== jugadorActual &&
                tablero[1][1]== jugadorActual &&
                tablero[1][2]== jugadorActual) {
                ganador= jugadorActual;
            }
            
            if (tablero[2][0]== jugadorActual &&
                tablero[2][1]== jugadorActual &&
                tablero[2][2]== jugadorActual) {
                ganador= jugadorActual;
                break;
            }
                        
        }while(turno <9);
        
        if (ganador==0) {
            System.out.println("EMPATE");
        }else{
            System.out.println("GANADOR JUGADOR "+jugadorActual);  
        }
        
    }
}


