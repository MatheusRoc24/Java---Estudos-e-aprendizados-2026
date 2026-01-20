package Desafios;

import java.util.Scanner;

public class Desafio2While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int digitados = 0;
        int quantidadeDigitados = 0;
        int somar = 0;

        while (digitados >= 0) {
            System.out.println("Coloque os numeros que voce quer, caso queira sair coloque numero negativo");
            digitados = entrada.nextInt();

            if(digitados >0){
                quantidadeDigitados++;
                somar = somar + digitados;


            }

        }
        System.out.println("Somador: " + somar);
        System.out.println("Digitados: " + quantidadeDigitados);
    }
}