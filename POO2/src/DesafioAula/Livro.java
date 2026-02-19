package DesafioAula;

public class Livro {
    public String nome;
    private int tag;


    public void livro(String nome, int tag) {
        this.nome = nome;
        this.tag = tag;
        boolean disponivel = true;
    }




public void emprestar(boolean disponivel){
        if(disponivel == false){
            System.out.println("Livro emprestado");
        }else(disponivel = true)
            System.out.println("Livro não disponivel");
        }


}



}






