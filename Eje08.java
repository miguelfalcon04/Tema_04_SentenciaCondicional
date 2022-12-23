/* Ejercicio 8
Amplía el programa anterior para que diga la nota del boletín (insuficiente,
suficiente, bien, notable o sobresaliente).

@author miguelfalcon
*/

import java.util.Scanner;;
public class Eje08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su primera nota: ");
        double n1=sc.nextDouble();

        System.out.print("Introduzca su segunda nota: ");
        double n2=sc.nextDouble();

        System.out.print("Introduzca su tercera nota: ");
        double n3=sc.nextDouble();

        double media=(n1+n2+n3)/3;

        System.out.printf("Su media es de %.2f ",media);

        if(media>=9){
            System.out.print("Sobre");
        }

        if(media>=8 && media<9){
            System.out.print("Notable");
        }

        if(media>=5 && media<8){
            System.out.print("Bien");
        }

        if(media>=3 && media<5){
            System.out.print("Sufi");
        }

        if(media>=0 && media<3){
            System.out.print("Insufi");
        }

        sc.close();
    }
}
