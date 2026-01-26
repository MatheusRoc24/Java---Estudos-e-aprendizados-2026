package Erray.Desafios;


import java.util.Arrays;
import java.util.Scanner;

public class NotsaAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qntNotas;
        double soma = 0;
        double calculo;

    // Variavel que armazena o quanto quer de nota
        System.out.println("Coloque a quantidade de notas que você quer cadastrar");
        qntNotas = entrada.nextInt();


        double[] notas = new double[qntNotas];
        for (int i = 0; i < notas.length; i++) {

            System.out.println("Adicione a nota de posição: " + (i + 1));
            notas[i] = entrada.nextDouble();

            //Calcular média
            soma += notas[i];


        }
        System.out.println(Arrays.toString(notas));

        calculo = (soma / qntNotas);
        System.out.println("Sua média é :" + calculo);

        if(calculo < 6){
            System.out.println("Reprovou");
        }else{
            System.out.println("Aprovado");
        }


    }

}
