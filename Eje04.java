/* Ejercicio 4
Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
las horas extras. Escribe un programa que calcule el salario semanal de un
trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
la hora.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horas que ha trabajado: ");
        int hora = sc.nextInt();

        int horasext=hora-40;

        if(hora<=40){
            System.out.print("Su sueldo es de: "+hora*12);
        }

        if(hora>=40){
            System.out.print("Su sueldo es de: "+((40*12)+horasext*16));
        }

        sc.close();
    }
}
