package Lambdas.Desafio.DESAFIOAULA;

import java.util.function.Function;
import java.util.function.Predicate;

public interface CamadaCalculadora {
    //Valida as regras de desconto, se elas estiverem dentro do padrão retornaram correto.
    Predicate<Produto> isDesconto = proct -> {
       return (proct.getPreco() * (1 - proct.getDesconto())) >= 1000.00; };
    Predicate<Produto> isMunicipal = proct -> { return (proct.getPreco() >= 2500 && proct.getPreco() < 2500 );};
    Predicate<Produto> isFrete = proct -> {return (proct.getPreco() >= 3000 && proct.getPreco() < 3000 );};

    //Gera valores de acordo com regras do que o sistema quer
    Function<Produto, Double> isPrecoDesconto = produto -> produto.getPreco() * (1- produto.getDesconto());
    Function<Double> isTaxaMunicipal




}


