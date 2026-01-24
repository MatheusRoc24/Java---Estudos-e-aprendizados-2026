package Erray.Desafios.Erray;

public class Desafio1 {
    public static void main(String[] args) {
        double[] notasAluno = {4.5, 4.9, 4, 0};

        double mais = 0;
        for (double nota : notasAluno) {

                mais += nota;

            }

        System.out.println(mais / notasAluno.length);


        double[] notasAlunoB = {4, 3, 6};

        double total2 = 0;
        for (double notab : notasAlunoB) {
            total2 += notab;
        }
        System.out.println(total2 / notasAlunoB.length);
        }
    }
