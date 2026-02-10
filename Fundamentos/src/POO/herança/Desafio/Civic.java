package POO.herança.Desafio;

public class Civic extends Carro {

    void acelerar() {
        super.acelerar();
        {
            VelocidadeAtual += 25;
        }
        super.frear();
        {
            VelocidadeAtual -= 15;
        }

    }
}
