/* Ejercicio 9
Realiza un programa que resuelva una ecuación de segundo grado (del tipo
ax2 + bx + c = 0).

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax2 + bx + c = 0 ");

        System.out.println("Por favor, introduzca el valor de a: ");
        double a= sc.nextDouble();

        System.out.println("Por favor, introduzca el valor de b: ");
        double b= sc.nextDouble();

        System.out.println("Por favor, introduzca el valor de c: ");
        double c= sc.nextDouble();

        double menosb = b*-1; 
        double raizdentro = b*b-(4*a*c); 
        double raiz = Math.sqrt(raizdentro); 
        double x1 = menosb+raiz/2*a; 
        double x2 = menosb-raiz/2*a; 

        if(raizdentro>=0 && a!=0){
            System.out.println("Un valor de x es "+String.format("%.3f",x1));
            System.out.print("Y otro valor de x es "+String.format("%.3f",x2));
        }else{
            System.out.print("La raiz cuadrada no da un numero real prueba con otros digitos");
        }

        sc.close();
    }
}

