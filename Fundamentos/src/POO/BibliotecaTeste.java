package POO;

public class BibliotecaTeste {
    public static void main(String[] args) {

        Livro livro = new Livro("Alice nos pais da maravilha", 45);

        System.out.println(livro.getNome() + "  " + "Codigo: " + livro.getCodigo());
        System.out.println(livro.isDisponibilidade());

        livro.emprestar();

        System.out.println(livro.isDisponibilidade());
        livro.emprestar();

        System.out.println(livro.isDisponibilidade());



    }
}
