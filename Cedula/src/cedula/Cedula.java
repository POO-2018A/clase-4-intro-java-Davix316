/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedula;

/**
 *
 * @author toshiba
 */
public class Cedula {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        
        // TODO code application logic here
            int[] cedulaValid={1,7,1,8,1,6,5,5,2,3};
            int[] arreProducto={2,1,2,1,2,1,2,1,2};
            int suma = 0;
            int verif = 0;
            //System.out.println(cedulaValid);

            for(int i =0 ;i < 9 ; i++ ) {
                int n = cedulaValid[i] * arreProducto[i];
                if (n >= 10) {
                    n = n - 9;
                }
                suma = n + suma;
            }
            System.out.println("La suma total es: " + suma);
            
            verif=suma;
            while (suma%10 != 0){
                suma++;
            }
            
            verif = suma - verif; 
            System.out.println("El ultimo digito es: " + verif);
            
            if (cedulaValid[9]== verif ){
                System.out.println("Su Cedula es valida");
            } else {
                System.out.println("Su cedula no es valida");
            }
    }
    
}
