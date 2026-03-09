package StreamAPIs.DESAFIOMAP1;

import StreamAPIs.aLunoFiltros;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class minMax {

    public static void main(String[] args) {

        aLunoFiltros a1 = new aLunoFiltros("Ana", 7.1);
        aLunoFiltros a2 = new aLunoFiltros("Marcia", 4.1);
        aLunoFiltros a3 = new aLunoFiltros("Castiel", 5.2);
        aLunoFiltros a4 = new aLunoFiltros("Marta", 10);

        List<aLunoFiltros> alunos = Arrays.asList(a1, a2, a3, a4);

       // Comparator<aLunoFiltros> compararMelhorNota = (aluno1 , aluno2) ->{
         // if(aluno1.nota > aluno2.nota)return 1;
          //if(aluno1 .nota < aluno2.nota) return -1;
          //return 0;
        };
       // System.out.println(alunos.stream().max(compararMelhorNota));
    }
//}
