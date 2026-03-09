package StreamAPIs;

import POO.Aluno;

import javax.print.attribute.standard.Media;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
    public static void main(String[] args) {

        aLunoFiltros a1 = new aLunoFiltros("Ana", 7.1);
        aLunoFiltros a2 = new aLunoFiltros("Marcia", 4.1);
        aLunoFiltros a3 = new aLunoFiltros("Castiel", 5.2);
        aLunoFiltros a4 = new aLunoFiltros("Marta", 10);

        List<aLunoFiltros> alunos = Arrays.asList(a1,a2,a3,a4);

        Predicate<aLunoFiltros>aprovado = a-> a.nota >=7;
        Function<aLunoFiltros,Double> apenasNota = a-> a.nota;
        BinaryOperator<Double> soma = (a, b) -> a+ b;
        //BiFunction<Media,Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
        //BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1,m2);

       // alunos.stream().filter(aprovado).map(apenasNota).reduce(new Media(), calcularMedia, combinarMedia);

        alunos.parallelStream().filter(aprovado).map(apenasNota).reduce(soma).ifPresent(System.out::println);
    }
}
