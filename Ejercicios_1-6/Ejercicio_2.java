package Ejer2;
import java.util.Scanner;

/**
 *
 * @author Davix316
 */

public class Ejercicio_2 {

    public static void main (String [] args){

        //Declaración e ingreso de valor a la variable
        System.out.println("Ingrese su nombre: ");
        Scanner lector = new Scanner(System.in);
        String nombre = lector.next();
        System.out.println("Hola [" + nombre + "]" );
    }
}
