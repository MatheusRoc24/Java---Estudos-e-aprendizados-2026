package StreamAPIs.DESAFIOFILTER1;

public class Produto {

    String nome;
    double preco;
    double desconto;
    boolean freteGratis;

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public boolean isFreteGratis() {
        return freteGratis;
    }

    public void setFreteGratis(boolean freteGratis) {
        this.freteGratis = freteGratis;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Produto(String nome, double preco, double desconto, boolean freteGratis){
       this.nome = nome;
       this.preco = preco;
       this.desconto = desconto;
       this.freteGratis = freteGratis;
   }
}

