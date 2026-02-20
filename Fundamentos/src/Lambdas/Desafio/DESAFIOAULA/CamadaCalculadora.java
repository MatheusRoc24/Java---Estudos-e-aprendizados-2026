package Lambdas.Desafio.DESAFIOAULA;


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface CamadaCalculadora {
    //Valida as regras de desconto, se elas estiverem dentro do padrão retornaram correto.

    Function<Produto, Double> isPrecoDesconto = produto -> produto.getPreco() * (1 - produto.getDesconto());
    Predicate<Produto> isDesconto = produtos -> {
        return CamadaCalculadora.isPrecoDesconto.apply(produtos) >= 1000.00;
    };

    Function<Produto, Double> calcularTaxaMunicipal = produto -> {
        double imposto = isPrecoDesconto.apply(produto) * 0.08;
        if (imposto >= 2500) {
            return imposto; // aplica o imposto
        } else {
            return 0.0; // não aplica
        }
    };
    Predicate<Produto> isMunicipal = produto -> calcularTaxaMunicipal.apply(produto) > 0;


    Predicate<Double> verificarFrete = frete -> {
        return frete >= 3000 && frete < 4000;
    };
    Function<Double, Double> fretados = fretado -> {
        double valorFrete;
        if (fretado > 3000) {
            valorFrete = 100;
        } else {
            valorFrete = 50;
        }
        return + valorFrete;

    };
    Function<Double, Double> arredondarDuasCasas = valor -> {
        return Math.round(valor * 100.0) / 100.0;
    };

    Function<Produto, Double> valorFinal = produto -> {
        // 1. Aplica o desconto
        double precoComDesconto = isPrecoDesconto.apply(produto);

        // 2. Calcula imposto municipal (só se for maior que 2500)
        double imposto = calcularTaxaMunicipal.apply(produto); // já retorna 0 se menor que 2500

        // 3. Calcula frete baseado no preço com desconto
        double frete = fretados.apply(precoComDesconto);

        // 4. Soma tudo
        double total = precoComDesconto + imposto + frete;

        // 5. Arredonda para duas casas decimais
        return Math.round(total * 100.0) / 100.0;
    };

    Consumer<Produto> imprimir = produto -> {
        System.out.printf("Nome: %s | Preço original sem desconto: %.2f |Desconto dado: %.2f%n| Preço final com desconto: %.2f%n",
                produto.getNome(),
                produto.getPreco(),
                produto.getDesconto(),
               valorFinal.apply(produto));



    };
}


