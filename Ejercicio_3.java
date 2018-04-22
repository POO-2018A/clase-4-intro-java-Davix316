package Ejer3;
import java.util.Scanner;

/**
 *
 * @author Davix316
 */

public class Ejercicio_3 {
    public static void main(String [] args){
//Declaración de variables
        Scanner lector = new Scanner(System.in);
        int edad;

        System.out.println("Ingrese su edad: ");
        edad = lector.nextInt();
//Verificar si el numero es mayor que 18 o menor
        if(edad >= 18 ){
            System.out.println("Usted es mayor de edad.");
        } else {
            System.out.println("Usted es menor de edad. ");
        }
    }

}
