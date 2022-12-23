/* Ejercicio 5
Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");

        System.out.print("Por favor, introduzca el valor de a: ");
        int a = sc.nextInt();

        System.out.print("Ahora introduzca el valor de b: "); 
        int b = sc.nextInt();

        System.out.printf("x: %.2f",((float)-b/a));

        sc.close();
    }
}
