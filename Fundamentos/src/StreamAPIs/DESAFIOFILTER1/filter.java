package StreamAPIs.DESAFIOFILTER1;

import java.util.Arrays;
import java.util.List;

public class filter {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 4550, 0.45, true);
        Produto p2 = new Produto("Celular", 2450, 0.35, false);
        Produto p3 = new Produto("Cama", 2450, 0.1, true);

        List<Produto>p = Arrays.asList(p1,p2,p3);


        p.stream()
                .filter(LambdaProduto.valido).
                map(LambdaProduto.pode).

                forEach(System.out::println);



    }
}
