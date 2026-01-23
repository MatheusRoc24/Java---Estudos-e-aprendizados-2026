package ClassesEMetodos.DesafiosClassesEMetodos.DesafioMetodo;

public class Pessoa {

    String nomePessoa;
    double peso;


    Pessoa(String nome, double pesagem) {

        nomePessoa = nome;
        peso = pesagem;

        System.out.println(nome);
        System.out.println(peso);
    }
    void comer(Comida comer){
        System.out.println(this.peso + comer.pesoComida);
    }

    }

