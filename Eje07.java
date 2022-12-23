/* Ejercicio 7
Realiza un programa que calcule la media de tres notas.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su primera nota: ");
        double n1=sc.nextInt();

        System.out.print("Introduzca su segunda nota: ");
        double n2=sc.nextInt();

        System.out.print("Introduzca su tercera nota: ");
        double n3=sc.nextInt();

        double media=(n1+n2+n3)/3;

        System.out.printf("Su media es de %.2f",media);

        sc.close();
    }
}
