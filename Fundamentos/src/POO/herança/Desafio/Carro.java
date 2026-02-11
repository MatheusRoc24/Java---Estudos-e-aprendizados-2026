package POO.herança.Desafio;

public class Carro {
    private int VelocidadeAtual = 0;
    int delta = 5;

    private final int VELOCIDADE_MAXIMA;

    public Carro(int velocidadeMaxima) {
        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
    }


    public void acelerar(){
        int velocidadePossivel = VelocidadeAtual + delta;

        if(velocidadePossivel > VELOCIDADE_MAXIMA){
            VelocidadeAtual = VELOCIDADE_MAXIMA;
            System.out.println("Velocidade maxima atingida ");
        }else{
            VelocidadeAtual = velocidadePossivel;
        }


    }

    public int getVelocidadeAtual() {
        return VelocidadeAtual;
    }

    public void frear(){
        VelocidadeAtual -= 5;
        if(VelocidadeAtual < 0){
            VelocidadeAtual = 0;

        }
     }



}


