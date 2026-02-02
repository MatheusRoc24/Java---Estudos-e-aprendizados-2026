package POO;

public class Produto {

    String nome;
    int quantidade;
    double preco;
    Compra compra;

    Produto(String nome,  int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
