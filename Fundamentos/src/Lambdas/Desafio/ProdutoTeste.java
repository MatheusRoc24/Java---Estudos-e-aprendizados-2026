package Lambdas.Desafio;



public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto("Leite", 3.40,0.2);
        Produto produto = new Produto("Macarrão",5.87, 0.1);

        System.out.println(CamadaFuncional.isDesconto.test(produto));
        System.out.println(CamadaFuncional.precoFinal.apply(produto));

        System.out.println(CamadaFuncional.isDesconto.test(produto1));
        System.out.println(CamadaFuncional.precoFinal.apply(produto1));

        if (CamadaFuncional.isDesconto.test(produto)) {
            CamadaFuncional.imprimir.accept(produto);
        }else{
            System.out.printf("Nome: %s | Preço original: %.2f%n",
                    produto.getNome(),
                    produto.getPreco());

        }
        if (CamadaFuncional.isDesconto.test(produto1)) {
            CamadaFuncional.imprimir.accept(produto1);
        }else{
            System.out.printf("Nome: %s | Preço original: %.2f%n",
                    produto1.getNome(),
                    produto1.getPreco());
    }



}
