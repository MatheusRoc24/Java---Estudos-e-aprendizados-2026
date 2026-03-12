package POO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aluno {
    public final String nome;
    ArrayList<Curso> cursos = new ArrayList<>();
    public Aluno(String nome){
        this.nome = nome;
    }

    void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }
}
