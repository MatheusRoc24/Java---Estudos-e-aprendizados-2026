package ClassesEMetodos;

import java.util.Scanner;

public class Construtores {

    String nome;
    double preco;
    double desconto;

    Construtores(String NomeInicial) {
        nome = NomeInicial;
    }

    Construtores(String NomeInicial, double PrecoInicial) {
        nome = NomeInicial;
        preco = PrecoInicial;

    }
}
