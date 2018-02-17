
/*
    Parece sencillo definir variables. Sigamos haciendolo.

    En Java existen 8 tipos de datos primitivos que nos permiten definir variables.

        [byte, short, int, long]     son utilizados para almacenar números enteros.
        [float, double         ]     son utilizados para almacenar números reales.
        [char                  ]     almacena un solo caracter.
        [boolean               ]     almacena un valor lógico true/false   

    NOTA: Es posible definir y asignar valor a una variable en una sola línea.

    Ejemplo:  int edad = 23;
*/

public class Ejercicio5 {
    public static void main(String[] args){
                       
        float altura=1.68f;  //Definición de la variable altura junto con asignación de valor.
        double peso= 62.57;  //Definición de la variable peso junto con asignación de valor.
                
        //Impresión de las dos variables.
        System.out.println("Mi nombre es Iván Ignacio, mido "+altura+" mts. y peso :"+peso+" Kg.");
        //NOTA: El caracter + sirve para concatenar 2 o mas elementos.
    }
}
