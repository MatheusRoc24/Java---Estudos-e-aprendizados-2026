package POO.herança.Desafio;

public class Carro {
    int VelocidadeAtual = 0;
    int delta = 5;

    private final int VELOCIDADE_MAXIMA;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }


    void acelerar(){
        int velocidadePossivel = VelocidadeAtual + delta;

        if(velocidadePossivel > VELOCIDADE_MAXIMA){
            VelocidadeAtual = VELOCIDADE_MAXIMA;
            System.out.println("Velocidade maxima atingida ");
        }else{
            VelocidadeAtual = velocidadePossivel;
        }

    }

     void frear(){
        VelocidadeAtual -= 5;
        if(VelocidadeAtual < 0){
            VelocidadeAtual = 0;

        }
     }
    }


