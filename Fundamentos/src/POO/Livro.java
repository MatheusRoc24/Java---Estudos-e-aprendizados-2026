package POO;

public class Livro {
    public String nome;
    private int codigo;
    private boolean disponibilidade;


   public Livro(String nome, int codigo){
       this.nome = nome;
       this.codigo = codigo;
       this.disponibilidade = true;
   }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void emprestar() {
        if (disponibilidade) {
            disponibilidade = false;
            System.out.println("Livro emprestado");
        } else {
            System.out.println("Livro não disponivel");
        }
    }
    public void devolver(){
            disponibilidade = true;
            System.out.println("Livro devolvido");
        }
    }

