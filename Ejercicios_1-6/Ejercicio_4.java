package Ejer4;
import java.util.Scanner;

/**
 *
 * @author Davix316
 */

public class Ejercicio_4 {

    public static void main(String [] args){
//Declaración de variable
        int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = lector.nextInt();
//Comprobar si el residuo es 0 o diferente
        if(numero%2 == 0){
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }

}
