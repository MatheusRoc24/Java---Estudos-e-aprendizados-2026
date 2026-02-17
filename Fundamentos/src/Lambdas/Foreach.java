package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {

        //Mostra outra forma de percorrer uma ArrayList
        List<String> aprovados = Arrays.asList("Ana", "Beatriz", "Lia", "Gui");

        System.out.println("Forma tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nLambda V1");

        aprovados.forEach((nome -> {
            System.out.println(nome + "!!!");
        }));

        //Imprimi por referencia
        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);

        // Imprimi por referencia colocando algo
        System.out.println("\nMethod Reference2");
        aprovados.forEach(Foreach::meuImprimir);

        //Coloca uma frase atras do nome de cada um
        System.out.println("\nLambda V2");

        aprovados.forEach(nome -> meuImprimir(nome));
    }

    static void meuImprimir(String nome) {

        System.out.println("Ola, meu nome é: " + nome);
    }

}