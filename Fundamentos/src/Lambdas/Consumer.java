package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Consumidor {
    public static void main(String[] args) {

        Consumer<produto> imprimir = p -> System.out.println(p.nome);

        produto p1 = new produto("Vara", 34, 0.3);
        imprimir.accept(p1);

        produto p2 = new produto("Lanche", 34, 0.3);

        List<produto> produtos = Arrays.asList(p1, p2);

        //Conseguimos imprimir categoria por categoria com forEach
        produtos.forEach(imprimir);
        produtos.forEach(p -> System.out.println(p.preco ));
        produtos.forEach(System.out::println);

    }
}
