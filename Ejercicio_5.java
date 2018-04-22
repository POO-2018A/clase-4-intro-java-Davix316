package Ejer5;
import java.util.Scanner;

/**
 *
 * @author Davix316
 */

public class Ejercicio_5 {
    public static void main( String [] args){
//Declaración de variable
        int mes;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el numerro del mes: ");
        mes = lector.nextInt();
//Asignar un mes a cada caso
        switch (mes){
            case 1:
                System.out.println("El mes es: Enero");
                break;

            case 2:
                System.out.println("El mes es: Febrero");
                break;

            case 3:
                System.out.println("El mes es: Marzo");
                break;

            case 4:
                System.out.println("El mes es: Abril");
                break;

            case 5:
                System.out.println("El mes es: Mayo");
                break;

            case 6:
                System.out.println("El mes es: Junio");
                break;

            case 7:
                System.out.println("El mes es: Julio");
                break;

            case 8:
                System.out.println("El mes es: Agosto");
                break;

            case 9:
                System.out.println("El mes es: Septiembre");
                break;

            case 10:
                System.out.println("El mes es: Octubre");
                break;

            case 11:
                System.out.println("El mes es: Noviembre");
                break;

            case 12:
                System.out.println("El mes es: Diciembre");
                break;
            default:
                System.out.println("Ingrese un numero del 1 al 12 que son los meses del año.");
        }

    }
}
