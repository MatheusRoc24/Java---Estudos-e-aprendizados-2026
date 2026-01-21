package ClassesEMetodos.DesafiosClassesEMetodos.DesafioMetodo;

public class Pessoa {

    String nomePessoa;
    double peso;


    Pessoa(String nome, double pesagem) {

        nome = nomePessoa;
        peso = pesagem;

    }
    void comer(Comida comida ){
        System.out.println(this.peso + comida.pesoComida);
    }

    }

