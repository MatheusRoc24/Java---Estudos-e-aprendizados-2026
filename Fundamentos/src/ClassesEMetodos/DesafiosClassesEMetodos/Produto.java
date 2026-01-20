package ClassesEMetodos.DesafiosClassesEMetodos;

public class Produto {

    String nome;
    double preco;
    double quantidade;

    Produto(String DadosNome, double DadosPreco, double DadosQuantidade){
        nome = DadosNome;
        preco = DadosPreco;
        quantidade = DadosQuantidade;
    }
    void mostrarDados(){
        System.out.println( nome );
        System.out.println( preco);
        System.out.println( quantidade);
    }
}
