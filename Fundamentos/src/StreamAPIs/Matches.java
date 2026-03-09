package StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Matches {
    public static void main(String[] args) {

        aLunoFiltros a1 = new aLunoFiltros("Ana", 7.1);
        aLunoFiltros a2 = new aLunoFiltros("Marcia", 4.1);
        aLunoFiltros a3 = new aLunoFiltros("Castiel", 5.2);
        aLunoFiltros a4 = new aLunoFiltros("Marta", 10);

        List<aLunoFiltros> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<aLunoFiltros> aprovado = a -> a.nota >= 7;
        Predicate<aLunoFiltros> reprovado = aprovado.negate();

        System.out.println(alunos.stream().anyMatch(aprovado)); //Algum teve match?
        System.out.println(alunos.stream().allMatch(aprovado)); // Todos foram aprovados?
        System.out.println(alunos.stream().noneMatch(reprovado));// Nenhum foi aprovado?
    }
}