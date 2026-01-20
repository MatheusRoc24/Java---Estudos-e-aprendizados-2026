package EstruturasDeControle.IF.DesafiosEstruturaDeControle;

import java.util.Scanner;

public class Desafio3DoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        double numero = 0;
        int contador = 0;

        do {
            System.out.println("Coloque: \n1: Cadastrar numero " + " \n2: Mostrar total de numeros cadsatrados" + " \n0 para sair");
            opcao = entrada.nextInt();
            if (opcao == 1) {
                System.out.println("Coloque o numero");
                numero = entrada.nextDouble();

                numero = contador;
                contador++;

            }if (opcao == 2) {
                System.out.println(contador);
            }
        }while(opcao !=0);

    }
}
