package EstruturasDeControle.IF.DesafiosEstruturaDeControle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = 0;
        double quantidadeDeNota= 0;
        int total = 0;

        String nome = " ";

        while(nota !=-1) {
            System.out.println("Coloque a nota");
            nota = entrada.nextDouble();

            if(nota <= 10 &&  nota >= 0){
                total += nota;
                quantidadeDeNota++;

            }
        }

        double media = total / quantidadeDeNota;
        System.out.println(media);
    }
}
