package TratamentoDeErros.Personalizada;

import ClassesEMetodos.DesafiosClassesEMetodos.Usuario;
import POO.Aluno;

public class Validar {

    public Validar(){}

    public static void usuario(Aluno aluno){
        if( aluno == null){
            throw new IllegalArgumentException("Aluno está nulo");
        }
        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("Aluno está sem nome");
        }

    }
}
