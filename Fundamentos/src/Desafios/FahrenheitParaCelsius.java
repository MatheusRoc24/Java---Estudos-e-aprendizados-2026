package Desafios;

import java.util.Scanner;

public class FahrenheitParaCelsius {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int padrao = 32;
        double fah;


        System.out.println("Quantos Fahrenheit?");
        fah = entrada.nextFloat();

        double conta = (double) (fah-padrao)*5/9;
        System.out.println(conta);


    }
}
