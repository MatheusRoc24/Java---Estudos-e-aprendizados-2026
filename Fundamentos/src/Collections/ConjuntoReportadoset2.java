package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoReportadoset2 {
    public static void main(String[] args) {

       // Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>();

        listaAprovados.add("Arnaldo");
        listaAprovados.add("Lucas");
        listaAprovados.add("Felipe");
        listaAprovados.add("Arnaldo");


        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
        Set<Integer> colocacaoNumAprovado = new HashSet<>();

        colocacaoNumAprovado.add(41);
    }
}
