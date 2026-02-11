package POO.herança.Desafio;

public class Supra extends Carro{
    public Supra(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public void acelerar() {
        super.acelerar();
    }

    @Override
    public void frear() {
        super.frear();
    }
}



