package Lambdas.Desafio;


import java.util.ArrayList;
import java.util.Arrays;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto("Leite", 3.40, 0.2);
        Produto produto1 = new Produto("Macarrão", 3.20, 0.1);

        ArrayList<Produto> lista = new ArrayList<>(Arrays.asList(produto, produto1));
            lista.forEach(p -> {
                if (CamadaFuncional.isDesconto.test(p)) {
                    double precoComDesconto = CamadaFuncional.precoFinal.apply(p);
                    System.out.printf("Nome: %s | Preço com desconto: %.2f%n",
                            p.getNome(), precoComDesconto);

                } else {
                    System.out.printf("Nome: %s | Preço original: %.2f%n",
                            p.getNome(), p.getPreco());
                }
            });


        }
    }
