
import java.util.Scanner;

/**
 * @author Iván Ignacio López Ambrocio
 * @version 1.0
 */
public class Ejercicio31 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Diga un numero entero del 1 al 12");
        numero = entrada.nextInt();
        if (numero == 1) {
            System.out.println("Enero");

        } else {
            if (numero == 2) {
                System.out.println("Febrero");
            } else {
                if (numero == 3) {
                    System.out.println("Marzo");
                } else {
                    if (numero == 4) {
                        System.out.println("Abril");
                    } else {
                        if (numero == 5) {
                            System.out.println("Mayo");
                        } else {
                            if (numero == 6) {
                                System.out.println("Junio");
                            } else {
                                if (numero == 7) {
                                    System.out.println("Julio");
                                } else {
                                    if (numero == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (numero == 9) {
                                            System.out.println("Septiembre");
                                        } else {
                                            if (numero == 10) {
                                                System.out.println("Octubre");
                                            } else {
                                                if (numero == 11) {
                                                    System.out.println("Noviembre");
                                                } else {

                                                    System.out.println("Diciembre");
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
