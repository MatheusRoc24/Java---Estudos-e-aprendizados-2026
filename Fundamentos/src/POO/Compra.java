package POO;

import java.util.ArrayList;

public class Compra {

    String nomeCLiente;

    ArrayList<Produto> produtos = new ArrayList<>();

    void adcionarProduto(Produto produto){

        produtos.add(produto);
        produto.compra = this;
    }

    double getValorTotal(){

        double total = 0;

        for(Produto produto: produtos){
            total += produto.quantidade * produto.preco;
        }

        return total;
    }

    int Compra;

    }


