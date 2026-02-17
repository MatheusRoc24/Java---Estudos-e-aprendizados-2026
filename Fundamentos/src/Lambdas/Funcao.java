package Lambdas;

import java.util.function.Function;

public class Funcao {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "impar";

        System.out.println(parOuImpar.apply(42));

        Function<String, String> Resultado = valor -> "O resultado é " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!!!!";


        String resultadoFInal =
                parOuImpar.andThen(Resultado).andThen(empolgado).apply(42);


        System.out.println(resultadoFInal);
    }
}
