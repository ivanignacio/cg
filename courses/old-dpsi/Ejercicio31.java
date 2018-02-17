
// En Java es posible realizar una operación 'n' cantidad de veces según sea necesario.


/*
    ¿Te imaginas imprimir los primeros 10 números enteros a través de 10 sentencias System.out.println();?

    Esa es una de las operaciones que podemos realizar de manera mas sencilla a través de los ciclos.
*/
public class Ejercicio31 {
    public static void main(String[] args){
        
        
    /*  System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        .
        .
        .
        System.out.println("10");
    */
    
    //Considera que necesitamos llevar control de alguna manera.
    
    //Variable para controlar el ciclo.
    int variableControl=1;
    
    /*Ciclo while, considere leerlo de la siguiente forma:
            "Mientras el valor de la varible de control sea menor o igual a 10 hacer lo que se encuentre en el bloque de las llaves"    
    */
        while (variableControl<=10) {
            
            //Dentro del bloque usted colocará el código a ejecutar si la condición del igual fue VERDADERA
            System.out.println(variableControl);
            
            //Considere cambiar en algún momento el valor de la variable de control de lo contrario usted tendrá un LOOP INFINITO
            variableControl= variableControl+1;
        }       
    }
}
