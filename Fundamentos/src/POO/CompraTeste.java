package POO;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.nomeCLiente = "João";

        c1.adcionarProduto(new Produto("Borracha", 12, 3.90));
        c1.adcionarProduto(new Produto("Caderno", 24, 15.9));

        System.out.print(c1.produtos.size());

        System.out.println(c1.getValorTotal());
    }
}
