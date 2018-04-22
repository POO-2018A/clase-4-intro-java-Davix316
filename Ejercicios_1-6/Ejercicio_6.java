package Ejer6;
import java.util.Scanner;

/**
 *
 * @author Davix316
 */

public class Ejercicio_6 {
    public static void main (String [] args){
//Declaración de variables
        boolean estaNevando;
        boolean estaLloviendo;
        double temperatura;
        Scanner lector = new Scanner(System.in);
//Preguntas con respuestas booleanas.
        System.out.println("Está nevando? si su respuesta es si escriba 'true', si es no escriba 'false'");
        estaNevando = lector.nextBoolean();
        System.out.println("Está lloviendo? si su respuesta es si escriba 'true', si es no escriba 'false'");
        estaLloviendo = lector.nextBoolean();
        System.out.println("Ingresa la temperatura ambiente que resgistra en estos momentos");
        temperatura = lector.nextDouble();
//Comprobación de las respuestas.
        if(estaLloviendo || estaNevando || temperatura < 10){
                System.out.println("Nos quedamos en casa!");
        } else {
            System.out.println("Vamos afuera!");
        }
    }
}
