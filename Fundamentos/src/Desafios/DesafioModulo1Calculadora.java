package Desafios;

import java.util.Scanner;

public class DesafioModulo1Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        float Numero1;
        float Numero2;

        float adicionar;
        float menos;
        float dividir;
        float multiplicar;

        String escolha;
        float resultado;

        System.out.println("Coloque o primeiro numero");
        Numero1 = scanner.nextFloat();

        System.out.println("Coloque seu segundo numero");
        Numero2 = scanner.nextFloat();

        System.out.println("Selecione qual operação quer: adicionar menos, dividir, multiplicar");
        escolha = scanner.next();

         resultado = "adicionar".equals(escolha) ? Numero1 + Numero2 : 0;
         resultado =  "menos".equals(escolha) ? Numero1 - Numero2 : resultado;
         resultado = "dividir".equals(escolha) ? Numero1 / Numero2 : resultado;
         resultado = "multiplicar".equals(escolha) ? Numero1 * Numero2 : resultado;

        System.out.println(resultado);



    }
}
