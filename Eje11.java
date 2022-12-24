/* Ejercicio 11
Escribe un programa que dada una hora determinada (horas y minutos), calcule
los segundos que faltan para llegar a la medianoche.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la hora: ");
        int h = sc.nextInt();

        System.out.print("Introduzca los minutos: ");
        int min = sc.nextInt();

        if(h<0 && h>24 && min<0 && min>60){
            System.out.print("Introduzca bien los datos");
        }else{
            if(min==0){
            System.out.print("Quedan "+(24-h)+" horas y 0 minutos");
            }else{
                System.out.print("Quedan "+(23-h)+" horas y "+ (60-min)+ " minutos");
            }
        }

        sc.close();
    }
}
