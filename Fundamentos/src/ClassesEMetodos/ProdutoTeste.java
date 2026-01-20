package ClassesEMetodos;


public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome = "Notebook";
        p1.preco = 4545.45;
        p1.desconto = 0.25;

        var p2 = new Produto();

        p2.nome = "Caneta";
        p2.preco = 4.25;
        p2.desconto = 0.1;

        System.out.println(p1.nome + p1.nome);

        double PrecoFInal = (+ p1.preco * ( 1 -   p1.desconto));
        double PrecoFinal2 = (p2.preco * ( 1 -   p2.desconto));

        System.out.println("Recebeu de desconto " + PrecoFInal);
        System.out.println("Voce recebeu de desconto " + PrecoFinal2);

    }
}
