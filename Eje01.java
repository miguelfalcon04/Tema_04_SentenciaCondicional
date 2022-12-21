/* Ejercicio 1
Escribe un programa que pida por teclado un día de la semana y que diga qué
asignatura toca a primera hora ese día.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el día de la semana (en minúsculas): ");
        String dia = sc.next();

        if(dia.equals("lunes")){
            System.out.print("Programación");
        }

        if(dia.equals("martes")){
            System.out.print("BBDD");
        }

        if(dia.equals("miercoles")){
            System.out.print("SSII");
        }

        if(dia.equals("jueves")){
            System.out.print("Entornos");
        }

        if(dia.equals("viernes")){
            System.out.print("FOL");
        }

        if(dia.equals("sabado") || dia.equals("domingo")){
            System.out.print("No hay clases");
        }

        sc.close();
    }
}