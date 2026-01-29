package Erray.Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        double calculo;

        System.out.println("Quantos alunos?");
        int qntAlunos = entrada.nextInt();

        System.out.println("Quantas notas?");
        int qntNotas = entrada.nextInt();

        double[][] notas = new double[qntAlunos][qntNotas];
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Informe a nota " + ((j + 1)) + " do aluno " + ((i + 1)));
                notas[i][j] = entrada.nextDouble();
                total += notas[i][j];
            }
        }

        calculo = total / (qntAlunos * qntNotas);
        System.out.println("Média da turma é: " + calculo);

        for (double[] notasDosAlunos : notas) {
            System.out.println(Arrays.toString(notasDosAlunos));


        }
        entrada.close();
    }

}
