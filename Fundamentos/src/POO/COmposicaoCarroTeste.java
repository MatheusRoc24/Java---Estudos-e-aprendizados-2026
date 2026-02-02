package POO;

public class COmposicaoCarroTeste {
    public static void main(String[] args) {

        ComposicaoCarro carro = new ComposicaoCarro();

        System.out.println(carro.estaLigado());

        System.out.println(carro.motor.giros());

        carro.acelerar();
        carro.acelerar();

        System.out.println(carro.motor.giros());

        carro.frear();

        System.out.println(carro.motor.giros());
    }
}
