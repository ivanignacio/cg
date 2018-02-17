
/*
    Sigamos practicando el definir variables.

    En Java cuando queremos almacenar texto utilizamos el tipo de dato String.

    Nota: String no es un tipo de datos primitivo.
    Nota: String inicia con "S" MAYUSCULA.
    Nota: El valor de un String debe ser envuelto entre doble comilla.    
*/

public class Ejercicio6 {

    public static void main(String[] args) {

        //Definición de la variable edad de tipo entero.
        int edad = 23;
        //Definición de la variable peso de tipo floar.
        float peso = 62.574536f;
        //Definición de la variable altura de tipo float.
        float altura = (float) 1.68;
        
        //Definición de la variable nombre de tipo String
        String nombre = "Iván Ignacio";
        //Definición de la variable apellidos de tipo String
        String apellidos = "López Ambrocio";
        //Definición de la variable dirección de tipo String
        String direccion = "Infonavit Chiveria And R.";

   
        /*
            Impresión del valor de las variables.
        
            No olvides que el operador + nos permite unir 2 o mas elementos.
        */
        System.out.println("Mi nombre es " + nombre + " " + apellidos + ", tengo " + edad + " años, vivo en " + direccion + " mido " + altura + " mts." + " y peso " + peso + " Kg.");
        System.out.printf("Mi nombre es %s %s\n",nombre,apellidos);
        System.out.printf("Mi peso es %.1f", peso);
    }
    
}
