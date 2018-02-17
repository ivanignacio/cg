
public class Ejercicio54 {
    public static void main(String[] args) {
        
        //Definición de una matriz 3x3
        int[][] tablero= new int[3][3];
        
        //FOR encargado de controlar las filas
        for(int fila=0; fila < 3 ; fila ++){
            
            //FOR encargado de controlar las columnas
            for(int columna=0; columna <3; columna++){
                System.out.print(tablero[fila][columna]+"\t");
            }
            System.out.println("");
        }
    }
}
