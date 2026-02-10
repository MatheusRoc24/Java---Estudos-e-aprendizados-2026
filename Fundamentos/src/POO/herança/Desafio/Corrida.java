package POO.herança.Desafio;

public class Corrida {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Supra supra = new Supra();
        Civic civic = new Civic();

       supra.acelerar();
       supra.acelerar();

       civic.acelerar();
       civic.acelerar();

       supra.frear();
       civic.frear();

        System.out.println("Velocidade de civic: " + civic.VelocidadeAtual);
        System.out.println("Velocidade de supra: " + supra.VelocidadeAtual);
    }
    }

