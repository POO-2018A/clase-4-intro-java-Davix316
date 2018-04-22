package Ejer1;
import java.util.Scanner;

/**
 *
 * @author Davix316
 */

public class Ejercicio_1 {

    public static void main ( String [] args){
        //Declaración de variables
        double fahrenheit;
        double celsius;
        Scanner dato = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Fahrenheit: ");
        fahrenheit= dato.nextDouble();
        //Comprobación de la variable entre los rangos asignados
        if(fahrenheit >= 0 && fahrenheit <= 100){
            celsius=((fahrenheit-32)*5)/9;
            System.out.println("La temperatra en grados Celsius es: " + celsius );
        }else{
            System.out.println("El valor ingresado no es valido. Ingrese un valor entre 0 y 100");
        }
    }
}
