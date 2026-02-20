package Lambdas.Desafio.DESAFIOAULA;

public class main {
        public static void main(String[] args) {
            Produto produto = new Produto("Ipad", 5345.3, 0.15);

            // Preço com desconto
            double precoComDesconto = CamadaCalculadora.isPrecoDesconto.apply(produto);

            // Imposto municipal
            double impostoMunicipal = CamadaCalculadora.calcularTaxaMunicipal.apply(produto);

            // Frete baseado no valor do imposto ou preço
            double frete = CamadaCalculadora.fretados.apply(precoComDesconto);

            // Valor final
            double valorFinal = precoComDesconto + impostoMunicipal + frete;

            // Arredonda para duas casas decimais
            valorFinal = Math.round(valorFinal * 100.0) / 100.0;

            // Chama o consumer para imprimir (se já estiver implementado)
            CamadaCalculadora.imprimir.accept(produto);
        }
    }


