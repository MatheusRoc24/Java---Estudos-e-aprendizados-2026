package TratamentoDeErros;

import POO.Aluno;

public class Basico {
    public static void main(String[] args) {

        //try para pegar o bloco de codigo que poderá dar erro e catch para trata-lo
        try{
            System.out.println(7/0);
        }catch (Exception excecao){
            System.out.println("Erro de calculo, impossivel calcular");
        }

        try {
            System.out.println(7/0);
            //Aqui ele vai tratar o erro como de calculo, servindo para mostrar que é impossivel calcular

        } catch (ArithmeticException e) {
            e.printStackTrace();

            //Aqui vai mostrar a origem do erro a partir do getMessage

            System.out.println("Ocorreu um erro " + e.getMessage());
        }
    }
}
