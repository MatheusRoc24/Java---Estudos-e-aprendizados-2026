

public class personagem {

    public String nome;
    private int hp = 100;

   public personagem(){
       int hp = 100;

    }

    public int getHp () {
        return hp;
    }
    public void colidir() {
        if (hp >= 20) {
             hp -= 20;
        }

        }
    }

