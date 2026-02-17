package Lambdas.Desafio;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface CamadaFuncional {

    Predicate<Produto> isDesconto = produto -> {
        return produto.getPreco() * (1 - produto.getDesconto()) <= 3.35;

    };

    Function<Produto, Double > precoFinal = produto -> produto.getPreco() * (1 - produto.getDesconto());


    Consumer<Produto> imprimir = produto ->
            System.out.printf("Nome: %s | Preço original sem desconto: %.2f |Desconto dado: %.2f%n| Preço final com desconto: %.2f%n",
                    produto.getNome(),
                    produto.getPreco(),
                    produto.getDesconto(),
                    CamadaFuncional.precoFinal.apply(produto));


    }