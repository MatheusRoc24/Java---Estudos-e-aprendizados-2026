package POO.herança;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 10;

        System.out.println(j1.vida );


        Jogador heroi = new Heroi(20, 20);
        heroi.x = 10;
        heroi.y = 11;

        System.out.println(heroi.vida);

        j1.atacar(heroi);
        heroi.atacar(j1);

        System.out.println("Vida final do oponente " + j1.vida );
        System.out.println("Vida final do heroi " + heroi.vida);
    }
}
