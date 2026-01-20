package Desafios;

import java.util.Scanner;

public class deCelsiusParafahrenheit {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double celsius;
        double fah = 32;
        int padrao = 9/5;

        System.out.println("Coloque o Celsius");
        celsius = entrada.nextDouble();

        double conta = (celsius*padrao)+fah;
        System.out.println(conta);
    }
}
