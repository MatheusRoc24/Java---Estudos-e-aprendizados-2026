package ClassesEMetodos;

public class mainAluno {
    public static void main(String[] args) {

        ClassAluno aluno = new ClassAluno();


        aluno.setData();

        aluno.ShowData();

        if (aluno.isApproved()){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }
}
