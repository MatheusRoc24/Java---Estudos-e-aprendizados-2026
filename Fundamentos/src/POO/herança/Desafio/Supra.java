package POO.herança.Desafio;

public class Supra extends Carro{
    @Override
    void  acelerar() {
        super.acelerar();{
            VelocidadeAtual += 35;
        }
        super.frear();{
            VelocidadeAtual -= 15;
        }

    }
}


