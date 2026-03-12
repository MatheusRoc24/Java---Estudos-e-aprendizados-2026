package TratamentoDeErros.Personalizada;

import POO.Aluno;

public class testePersonalizadas {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("");
        Validar.usuario(aluno);
        System.out.println("Final");
    }
}
