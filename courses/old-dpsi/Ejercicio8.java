
/*
    En Java podemos trabajar con operadores
        
    -Aritmeticos +,-,*,/,%
    -Relacionales >,<,>=,<=,==,!=
    -Lógicos &&, || , !
*/

public class Ejercicio8 {
    public static void main(String [] args){
        //Ejemplo de operadores Aritmeticos
        double a= 5+(4*5)/5;
        double b= (6*4%2)+15;
        System.out.println("a = "+a);
        System.out.println("b = "+b);      
        
        //Ejemplo de operadores relacionales.
        boolean resultado1= a > b;
        boolean resultado2= a !=b;        
        System.out.println("R1= "+resultado1);
        System.out.println("R2= "+resultado2);        
    }    
}
