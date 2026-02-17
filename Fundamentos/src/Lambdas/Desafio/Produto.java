package Lambdas.Desafio;

public class Produto extends Object{

     String nome;
     double preco;
     private double desconto;

    public Produto ( String nome, double preco, double desconto){
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco(){
        return preco;
    }

}
