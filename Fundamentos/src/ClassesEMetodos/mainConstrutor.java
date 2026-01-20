package ClassesEMetodos;

public class mainConstrutor {
    public static void main(String[] args) {

        Construtores p1 = new Construtores("Notebook");
        p1.preco = 4645.4;
        p1.desconto = 0.25;

        var p2 = new Construtores("Caneta Preta", 4545);
        p2.preco = 4545.5;

        System.out.println(p1.nome);
        System.out.println(p2.nome);




    }
}
