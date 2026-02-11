package POO.Polimorfismo;

public class Janta {
    public static void main(String[] args) {

        Pessoa convidado = new Pessoa(80);

        Arroz ingrediente1 = new Arroz(0.25);
        Feijão ingrediente2 = new Feijão(1.40);

        convidado.comer(ingrediente1);
        convidado.comer(ingrediente2);

            System.out.println(convidado.getPeso());


        }
    }


