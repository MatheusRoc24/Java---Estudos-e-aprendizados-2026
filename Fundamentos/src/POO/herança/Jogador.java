package POO.herança;

import POO.Desafio2.Direcao;

import static POO.Desafio2.Direcao.LESTE;
import static POO.Desafio2.Direcao.NORTE;


public class Jogador {

    int x;
    int y;

    boolean andar(Direcao direcao) {
        switch(direcao) {
            case NORTE:
                y++;
                break;

            case SUL:
                y++;
                break;

            case LESTE:
                y++;
                break;
        }

                    return true;
                }
            }

