package POO.herança.Desafio;

public class Supra extends Carro{
    public Supra(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    void  acelerar() {
        super.acelerar();

        }

    @Override
    void frear() {
        super.frear();
    }
}



