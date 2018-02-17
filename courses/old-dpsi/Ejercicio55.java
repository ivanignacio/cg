
import java.util.Random;
public class Ejercicio55 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random r= new Random();      
        //Control de las filas
        for (int i = 0; i < 3; i++) {
            //Control de columnas
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=r.nextInt(10);
            }
        }
        
        //Impresión de la matriz
         
        //FOR encargado de controlar las filas
        for(int fila=0; fila < 3 ; fila ++){
            
            //FOR encargado de controlar las columnas
            for(int columna=0; columna <3; columna++){
                System.out.print(matriz[fila][columna]+"\t");
            }
            System.out.println("");
        }
        
    }
}
