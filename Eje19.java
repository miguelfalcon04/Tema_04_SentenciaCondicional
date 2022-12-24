/* Ejercicio 19
Realiza un programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, introduzca un número entero (5 cifras como máximo): ");
        int n = sc.nextInt();

        int dig = 0;

        if ( n < 10 ) {
        dig = 1;
        }

        if (( n >= 10 ) && ( n < 100 )) {
        dig = 2;
        }

        if (( n >= 100 ) && ( n < 1000 )) {
        dig = 3;
        }

        if (( n >= 1000 ) && ( n < 10000 )) {
        dig = 4;
        }

        if ( n >= 10000 ) {
        dig = 5;
        }
        
        if (dig == 1) {
        System.out.println("El número introducido tiene 1 dígito.");
        } else {
        System.out.println("El número introducido tiene " + dig + " dígitos.");
        }

        sc.close();
    }
}
