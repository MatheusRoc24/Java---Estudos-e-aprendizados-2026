package Lambdas;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {

        Predicate<produto> isCaro  = prod -> (prod.preco * ( 1 - prod.desconto)) >= 750;


        produto prodt = new produto("Notebook", 4520, 0.15);

        System.out.println(isCaro.test(prodt));
    }
}
