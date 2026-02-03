package POO.Desafios;

public class CompraTeste {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Marcos");

        Produto produto1 = new Produto("Calça", 14.9);
        Produto produto2 = new Produto("Camiseta", 12.5);

        Item item1 = new Item(2, produto1);
        Item item2 = new Item(3, produto2);

        Compra compra1 = new Compra();
        compra1.itens.add(new Item(1, produto1));
        compra1.itens.add(new Item(2, produto2));

        Compra compra2 = new Compra();
        compra2.itens.add(new Item(1, produto1));
        compra2.itens.add(new Item(2, produto2));

        cliente1.adicionarCompras(compra1);
        cliente1.adicionarCompras(compra2);

        double total = cliente1.calculoTotal();
        System.out.println("Total gasto: " + total);
    }
}
