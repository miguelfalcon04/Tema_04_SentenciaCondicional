/* Ejercicio 6
Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
una altura h. Aplica la fórmula t =√2h/g siendo g = 9.81m/s^2

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        int h = sc.nextInt();

        System.out.printf("El objeto tardará en caer %.2f segundos",Math.sqrt((2*h)/9.81));

        sc.close();
    }
}
