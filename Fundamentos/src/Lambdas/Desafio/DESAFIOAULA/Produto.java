package Lambdas.Desafio.DESAFIOAULA;

public class Produto {
    public String nome;
    private double preco;
    private double desconto;


    Produto(String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() { return preco;}

    public double getDesconto() {
        return desconto;
    }
}
