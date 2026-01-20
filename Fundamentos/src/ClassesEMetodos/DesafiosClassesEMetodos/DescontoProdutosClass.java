package ClassesEMetodos.DesafiosClassesEMetodos;

public class DescontoProdutosClass {

    String produto;
    double preco;
    static double valor = 0.25;

    DescontoProdutosClass(String nomeproduto, Double precoProduto, double precoDesconto ){
        produto = nomeproduto;
        preco = precoProduto;
        valor = precoDesconto;

        double valorComDesconto = (precoProduto * (1 - precoDesconto));

        System.out.println(valorComDesconto);
    }
}
