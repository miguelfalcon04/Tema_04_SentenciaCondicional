/* Ejercicio 18
Escribe un programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un numero de hasta 5 cifras: ");
        int n = sc.nextInt();

        if(n>99999){
            System.out.print("Introduzca los datos correctamente");
        }else{
            int first=0;

            if ( n < 10 ) {
                first = n;
            }
            
            if (( n >= 10 ) && ( n < 100 )) {
                first = n / 10;
            }
            
            if (( n >= 100 ) && ( n < 1000 )) {
                first = n / 100;
            }
            
            if (( n >= 1000 ) && ( n < 10000 )) {
                first = n / 1000;
            }
            
            if ( n >= 10000 ) {
                first = n / 10000;
            }
            
            System.out.println("La first cifra del número introducido es el " + first + ".");
        }

        sc.close();
    }
}
