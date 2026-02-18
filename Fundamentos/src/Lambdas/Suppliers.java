package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {

        Supplier<List<String>> umLista =
                () -> Arrays.asList("Ana, Maria,Guilherme");

        System.out.println(umLista.get());
    }
}
