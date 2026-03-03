package StreamAPIs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class mainFiltro {
    public static void main(String[] args) {


        aLunoFiltros a1 = new aLunoFiltros("Matheus", 1.8);
        aLunoFiltros a2 = new aLunoFiltros("Mathias", 8);
        aLunoFiltros a3 = new aLunoFiltros("Thaina", 7);
        aLunoFiltros a4 = new aLunoFiltros("Carla", 6);
        aLunoFiltros a5 = new aLunoFiltros("Luana", 5.4);

         List<aLunoFiltros> alunos = Arrays.asList(a1,a2,a3,a4,a5);

         Predicate<aLunoFiltros> aprovado = a -> a.nota >= 7;

         Function<aLunoFiltros, String> saudacao = a -> " Parabens!";

        alunos.stream()
                .filter(aprovado)
                .map(saudacao)
                .forEach(System.out::println);


    }
}
