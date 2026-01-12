package Desafios;

import java.util.Scanner;

public class Equação2Grau {
    public static void main(String[] args) {
        Scanner entrda = new Scanner(System.in);

        //Valores padrão
        double a;
        double b;
        double c;

        //Matematico
        double deltamath;
        double calculo1;
        double raiz;

        //bhaskara
        double prim;
        double div;
        double calculo2;
        double calculo3;

        //Parte do Delta
        System.out.println("Coloque o A ");
        a = entrda.nextDouble();

        System.out.println("Coloque o B ");
        b = entrda.nextDouble();

        System.out.println("Coloque o C ");
        c = entrda.nextDouble();

        deltamath = Math.pow(b, 2);
        calculo1 = deltamath - 4 * a * c;

        System.out.println("o seu delta é: " + calculo1);

        //Bhaskara
        prim = -b;
        div = 2*a;


        //Calculo raiz;
        raiz = Math.sqrt(calculo1);

        System.out.println("x = " + "(" + (prim) + " ± " + raiz + "+" +  ")" + "/" + div);

        calculo2 = ((prim + raiz) /div);
        calculo3 = ((prim - raiz) /div) ;
        System.out.println("\nx1 = " + calculo2 + "\nx2 = " + calculo3);


    }
}
