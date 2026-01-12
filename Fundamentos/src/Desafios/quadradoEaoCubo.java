package Desafios;

import java.util.Scanner;

public class quadradoEaoCubo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double ler;
        String escolha;

        double resultado;
        double calculo;

        System.out.println("Coloque o valor que voce quer");
        ler = entrada.nextDouble();

        System.out.println("Ao cubo ou ao quadrado?");
        escolha = entrada.next();

        resultado = "quadrado".equals(escolha) ? calculo = (Math.pow(ler, 2)): 0;
        resultado = "cubo".equals(escolha) ? calculo = (Math.pow(ler, 3)) : resultado;

        System.out.println(resultado);


    }
}
