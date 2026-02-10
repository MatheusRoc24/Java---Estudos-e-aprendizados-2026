package POO.herança.Desafio;

public class Corrida {
    public static void main(String[] args) {

        Supra supra = new Supra(30);
        Civic civic = new Civic(30);

       supra.acelerar();
       supra.acelerar();
       supra.acelerar();

       civic.acelerar();
       civic.acelerar();
       civic.acelerar();

       supra.frear();
       civic.frear();

        System.out.println("Velocidade de supra: " + supra.VelocidadeAtual);
        System.out.println("Velocidade de civic: " + civic.VelocidadeAtual);
    }
    }

