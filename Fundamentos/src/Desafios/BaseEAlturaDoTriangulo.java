package Desafios;

import java.util.Scanner;

public class BaseEAlturaDoTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double base;
        double altura;
        double calculo;

        System.out.println("Coloque a base do triangulo");
        base = entrada.nextDouble();

        System.out.println("Coloque a altura do triangulo");
        altura = entrada.nextDouble();

        calculo = (base * altura /2);

        System.out.println(calculo + "cm²");
    }
}
