package POO.herança;

import POO.Desafio2.Direcao;

public class Jogo {
    public static void main(String[] args) {

        Jogador j1 = new Jogador();
        j1.x = 10;
        j1.y = 20;

        j1.andar(Direcao.NORTE);
        j1.andar(Direcao.OESTE);

        System.out.println(j1.x );
        System.out.println(j1.y);
    }
}
