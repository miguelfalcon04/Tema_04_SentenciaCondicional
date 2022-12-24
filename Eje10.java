/* Ejercicio 10
Escribe un programa que nos diga el horóscopo a partir del día y el mes de
nacimiento.

@author miguelfalcon
*/

import java.util.Scanner;
public class Eje10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su día de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Introduzca su mes de nacimiento: ");
        int mes = sc.nextInt();

        if(dia>31 || mes>12){
            System.out.print("Se ha equivocado con los datos");
        }else{
            if( mes==11){
                if(dia>=22){
                    System.out.print("Eres sagitario");
                }else{
                    System.out.print("Eres escorpio");
                }
            }

            if( mes==12){
                if(dia>=22){
                    System.out.print("Eres capricornio");
                }else{
                    System.out.print("Eres sagitario");
                }
            }

            if( mes==1){
                if(dia>=21){
                    System.out.print("Eres acuario");
                }else{
                    System.out.print("Eres capricornio");
                }
            }

            if( mes==2){
                if(dia>=20){
                    System.out.print("Eres piscis");
                }else{
                    System.out.print("Eres acuario");
                }
            }

            if( mes==3){
                if(dia>=21){
                    System.out.print("Eres aries");
                }else{
                    System.out.print("Eres piscis");
                }
            }

            if( mes==4){
                if(dia>=21){
                    System.out.print("Eres tauro");
                }else{
                    System.out.print("Eres aries");
                }
            }

            if( mes==5){
                if(dia>=21){
                    System.out.print("Eres geminis");
                }else{
                    System.out.print("Eres tauro");
                }
            }

            if( mes==6){
                if(dia>=21){
                    System.out.print("Eres cancer");
                }else{
                    System.out.print("Eres geminis");
                }
            }

            if( mes==7){
                if(dia>=21){
                    System.out.print("Eres leo");
                }else{
                    System.out.print("Eres cancer");
                }
            }

            if( mes==8){
                if(dia>=21){
                    System.out.print("Eres virgo");
                }else{
                    System.out.print("Eres leo");
                }
            }

            if( mes==9){
                if(dia>=22){
                    System.out.print("Eres libra");
                }else{
                    System.out.print("Eres virgo");
                }
            }

            if( mes==10){
                if(dia>=22){
                    System.out.print("Eres escorpio");
                }else{
                    System.out.print("Eres libra");
                }
            }

            sc.close();
        }
    }
}
