package POO;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("MAtheus");
        Aluno aluno2 = new Aluno ("Claudia");

        Curso curso1 = new Curso("Java completo");
        Curso curso2 = new Curso("Web2023");

        curso1.adicionarAlunos(aluno1);
        curso1.adicionarAlunos(aluno2);

        aluno1.adicionarCurso(curso1);
        aluno2.adicionarCurso(curso2);

        for(Aluno aluno : curso1.alunos){
            System.out.println("Estou matriculado no curso 1... ");
            System.out.println("Meu nome é " + aluno.nome);
        }
    }
}
