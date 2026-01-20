package OperadoresAritimeticos;

import java.util.Scanner;

public class IMC {
    private static Object calculo;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double altura ;
        double peso ;


        System.out.println("Coloque sua altura");
        altura = entrada.nextDouble();

        System.out.println("Coloque seu peso");
        peso = entrada.nextDouble();

        double calculo = (double) Math.pow(altura, 2);
        double calculadora = (peso/calculo);
        System.out.println(calculadora);


    }
    }

